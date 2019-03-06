package ru.smartsarov.bus;

import static ru.smartsarov.bus.postgres.tables.User.*;
import static ru.smartsarov.bus.postgres.tables.UserSession.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

import org.jooq.DSLContext;
import org.jooq.JSONFormat;
import org.jooq.JSONFormat.RecordFormat;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;

import com.google.gson.Gson;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


@Path("/")
@Produces(MediaType.TEXT_HTML + ";charset=UTF-8")
@Api(value = "AuthenticationActions")
public class AuthenticationActions {
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	public static int checkLogin(Cookie cookie) throws SQLException, NamingException{
		try(Connection conn = BusScheduleEngine.getConnection()){
			if(cookie==null)return 0;
			DSLContext jooq = DSL.using(conn, SQLDialect.POSTGRES);
			Record session = jooq.select().from(USER_SESSION).where(USER_SESSION.ID.eq(cookie.getValue())).fetchOne();
			if(session==null)return 0;
			return session.getValue(USER_SESSION.USER_ID);		
		}catch(DataAccessException | ClassNotFoundException ex){
			return 0;
		}
		
	}
		
	@GET
	@Path("login")
	@ApiOperation(value = "Функция аутентификации", response = ReturnObject.class)
    public Response login(@CookieParam("authsessionid") Cookie cookie,
    		@ApiParam( value = "логин", required = true) @QueryParam("login") String login,
    		@ApiParam( value = "пароль", required = true) @QueryParam("psw") String psw) {
		ReturnObject ro = new ReturnObject();
		try(Connection conn = BusScheduleEngine.getConnection()) {
			DSLContext jooq = DSL.using(conn, SQLDialect.POSTGRES);
			long count = jooq.selectCount().from(USER).where(USER.LOGIN.eq(login)).fetchOne(0, int.class);
			if(count==0) {
				ro.setErorMessage("Пользователь с email "+login+" не найден");
			}else{
				
				Record user = jooq.select().from(USER).where(USER.LOGIN.eq(login)).fetchOne();
				if(psw==null) {
					ro.setErorMessage("Пароль не задан");
				}else{
					if(!psw.equals(user.getValue(USER.PSW)))
						ro.setErorMessage("Пароль не верный");
				}
				
				if(!ro.getHasErrors()) {
					count = 30;
					StringBuilder builder = new StringBuilder();
					while (count-- != 0) {
						int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
						builder.append(ALPHA_NUMERIC_STRING.charAt(character));
					}
					
					//Сохраним сессию
					jooq.insertInto(USER_SESSION,USER_SESSION.ID,USER_SESSION.USER_ID)
				      .values(builder.toString().toLowerCase(),user.getValue(USER.ID))
				      .execute();
					
					NewCookie ncookie = new NewCookie("authsessionid", builder.toString().toLowerCase());
					return Response.ok().cookie(ncookie).build();
				}
			}
		} catch (Exception e) {
			ro.setException(e);
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.APPLICATION_JSON).entity(new Gson().toJson(ro)).build();
		}
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.APPLICATION_JSON).entity(new Gson().toJson(ro)).build();
    }
	
	@GET
	@Path("changePassword")
	@ApiOperation(value = "Функция смены пароля", response = ReturnObject.class)
    public Response changePassword(@CookieParam("authsessionid") Cookie cookie,
    		@ApiParam( value = "старый пароль", required = true) @QueryParam("oldPsw") String oldPsw,
    		@ApiParam( value = "новый пароль", required = true) @QueryParam("newPsw") String newPsw) {
		ReturnObject ro = new ReturnObject();
		try(Connection conn = BusScheduleEngine.getConnection()) {
			int userId = checkLogin(cookie);
			if(userId==0) return Response.status(Response.Status.UNAUTHORIZED).build();
			if(oldPsw==null)ro.addError("oldPsw", "Старый пароль не задан");
			if(newPsw==null)ro.addError("newPsw", "Пароль не задан");
			DSLContext jooq = DSL.using(conn, SQLDialect.POSTGRES);
			Record user = jooq.select().from(USER).where(USER.ID.eq(userId)).fetchOne();
			if(!user.getValue(USER.PSW).equals(oldPsw))ro.addError("oldPsw", "Старый пароль неверный");
			
			if(ro.getHasErrors()==false) {
				jooq.update(USER).set(USER.PSW,newPsw).where(USER.ID.eq(userId)).execute();
			}
			
			
			return Response.ok().type(MediaType.APPLICATION_JSON).entity(new Gson().toJson(ro)).build();
		} catch (Exception e) {
			ro.setException(e);
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.APPLICATION_JSON).entity(new Gson().toJson(ro)).build();
		}
    }
	
	@GET
	@Path("getUser")
	@ApiOperation(value = "Функция получения пользователя"/*, response = User.class*/)
    public Response getUser(@CookieParam("authsessionid") Cookie cookie) {
		try(Connection conn = BusScheduleEngine.getConnection()) {
			int userId = checkLogin(cookie);
			if(userId==0) return Response.status(Response.Status.UNAUTHORIZED).build();
			DSLContext jooq = DSL.using(conn, SQLDialect.POSTGRES);
			Record user = jooq.select().from(USER).where(USER.ID.eq(userId)).fetchOne();
			return Response.ok(user.formatJSON(new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT))).build();
		} catch (Exception e) {
			ReturnObject ro = new ReturnObject();
			ro.setException(e);
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).type(MediaType.APPLICATION_JSON).entity(new Gson().toJson(ro)).build();
		}
    }
	
}
