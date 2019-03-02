package ru.smartsarov.bus;

import static ru.smartsarov.bus.postgres.tables.Bus.*;
import static ru.smartsarov.bus.postgres.tables.BusInfo.*;
import static ru.smartsarov.bus.postgres.tables.RbBusMake.*;
import static ru.smartsarov.bus.postgres.tables.RbBusModel.*;
import static ru.smartsarov.bus.postgres.tables.RbBusConditionType.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.stream.Collectors;


import org.jooq.Record11;

import org.jooq.SQLDialect;

import org.jooq.impl.DSL;


import com.google.gson.Gson;

import ru.smartsarov.bus.responses.BusData;



public class BusScheduleEngine {
	/** 
	 *Getting conect to postgresql DB. Look for Properies file
	 *return Connection conn  
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		Class.forName("org.postgresql.Driver");		
		
		   conn = DriverManager.getConnection("jdbc:postgresql://"+
				   			Props.get().getProperty("host","localhost")+":"+
				   				Props.get().getProperty("port", "5432")+"/"+
				   					Props.get().getProperty("db","transport_schedule"), Props.get());
		   conn.setAutoCommit(false);
		   return conn;
	} 
	
	
	/**
	 * returns message in json format {"message": "message text"}
	 */
	 public static String getJsonMessage(String str) {
		  return "{\"message\":\"" + str + "\"}";
	 }
	
	 
	/**
	 *returns buses info list 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */ 
	public static String getBusList(Integer busId) throws ClassNotFoundException, SQLException {
		try (Connection conn = getConnection()) {
	       return new Gson().toJson(DSL.using(conn, SQLDialect.POSTGRES_10)   	         
	   			.select(BUS.ID, 
						BUS_INFO.VIN,
						BUS_INFO.YEAR_OF_ISSUE,
						RB_BUS_MAKE.NAME,
						RB_BUS_MODEL.NAME,
						BUS.GARAGE_NUMBER,
						BUS.STATE_NUMBER,
						BUS.FUEL_CODE_ID,
						BUS.ODOMETER_MILEAGE,
						BUS.TRACKER_MILEAGE,
						RB_BUS_CONDITION_TYPE.NAME	)
							.from(BUS).join(BUS_INFO).on(BUS.BUS_INFO_ID.eq(BUS_INFO.ID))
									.join(RB_BUS_MAKE).on(BUS_INFO.MAKE_ID.eq(RB_BUS_MAKE.ID))
									.join(RB_BUS_MODEL).on(BUS_INFO.MODEL_ID.eq(RB_BUS_MODEL.ID))		
									.join(RB_BUS_CONDITION_TYPE).on(BUS.CONDITION_ID.eq(RB_BUS_CONDITION_TYPE.ID))
									.where(busId==null? BUS.ID.eq(BUS.ID):BUS.ID.eq(busId))
	         									.fetch()
	         									.stream()
	         									.map(j->{return new BusData(
														j.get(BUS.ID),
														j.get(BUS_INFO.VIN),
														j.get(BUS_INFO.YEAR_OF_ISSUE),
														j.get(RB_BUS_MAKE.NAME),
														j.get(RB_BUS_MODEL.NAME),
														j.get(BUS.GARAGE_NUMBER),
														j.get(BUS.STATE_NUMBER),
														j.get(BUS.FUEL_CODE_ID),
														j.get(BUS.ODOMETER_MILEAGE),
														j.get(BUS.TRACKER_MILEAGE),
														j.get(RB_BUS_CONDITION_TYPE.NAME));
	         										})
	         									.collect(Collectors.toList()));
											}    
	}
	
	/**
	 *returns bus info 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static String getBusInfo(Integer busId) throws ClassNotFoundException, SQLException {
		try (Connection conn = getConnection()) {
	       Record11<Integer, String, Short, String,
	       				String, String, String,
	       					Short, Integer, Integer, String> j =  			
	       					DSL.using(conn, SQLDialect.POSTGRES_10)   	         
	       							.select(BUS.ID, 
	       									BUS_INFO.VIN,
	       									BUS_INFO.YEAR_OF_ISSUE,
	       									RB_BUS_MAKE.NAME,
	       									RB_BUS_MODEL.NAME,
	       									BUS.GARAGE_NUMBER,
	       									BUS.STATE_NUMBER,
	       									BUS.FUEL_CODE_ID,
	       									BUS.ODOMETER_MILEAGE,
	       									BUS.TRACKER_MILEAGE,
	       									RB_BUS_CONDITION_TYPE.NAME	)
	       										.from(BUS).join(BUS_INFO).on(BUS.BUS_INFO_ID.eq(BUS_INFO.ID))
	       												.join(RB_BUS_MAKE).on(BUS_INFO.MAKE_ID.eq(RB_BUS_MAKE.ID))
	       												.join(RB_BUS_MODEL).on(BUS_INFO.MODEL_ID.eq(RB_BUS_MODEL.ID))		
	       												.join(RB_BUS_CONDITION_TYPE).on(BUS.CONDITION_ID.eq(RB_BUS_CONDITION_TYPE.ID))
			         							.where(busId==null? BUS.ID.eq(BUS.ID):BUS.ID.eq(busId))
	         									.fetchAny();
	         								if(j!=null) {
	         									return new Gson().toJson(new BusData(j.get(BUS.ID),
														j.get(BUS_INFO.VIN),
														j.get(BUS_INFO.YEAR_OF_ISSUE),
														j.get(RB_BUS_MAKE.NAME),
														j.get(RB_BUS_MODEL.NAME),
														j.get(BUS.GARAGE_NUMBER),
														j.get(BUS.STATE_NUMBER),
														j.get(BUS.FUEL_CODE_ID),
														j.get(BUS.ODOMETER_MILEAGE),
														j.get(BUS.TRACKER_MILEAGE),
														j.get(RB_BUS_CONDITION_TYPE.NAME)));
	         								}else return "{}";
		}
	}
	

	
	
	
	
}
