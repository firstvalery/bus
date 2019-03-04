package ru.smartsarov.bus;




import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import io.swagger.annotations.*;
import ru.smartsarov.bus.responses.*;


import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;
@Path("/")
@Api()
@Produces(MediaType.APPLICATION_JSON)
public class BusService
{
	/*
	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML + ";charset=UTF-8")
    public Response index()
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
*/
	
	
	@GET
	@ApiOperation(value = "Получить актуальный список остановок",
	    notes = "Список остановок выводится JSON массивом",
	    response = BusStopData.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/bus_stops/get_list")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getBusStopsList()
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	
	
	@GET
	@ApiOperation(value = "Получить актуальный список маршрутов",
	    notes = "Список остановок выводится JSON массивом",
	    response = RouteData.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/route/get_list")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getRouteList()
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	
	
	@GET
	@ApiOperation(value = "Получить актуальный список остановок маршрута",
	    notes = "Список остановок выводится JSON массивом",
	    response = BusStopListData.class)
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/route/get_bus_stops")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getRouteBusStopsList(
    		@ApiParam(value = "Идентификатор маршрута", required = true)@QueryParam("route_id") int routeId)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	@GET
	@ApiOperation(value = "Получить актуальное расписание маршрута",
	    response=RouteScheduleData.class,
	    notes = "Выводится JSON массивом")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/route/schedule/get")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getRouteSchedule(
    		@ApiParam(value = "Идентификатор маршрута", required = true)@QueryParam("route_id") int routeId)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	
	@GET
	@ApiOperation(value = "Получить список смен маршрута",
	    notes = "Выводится JSON массивом",
	    response = RouteShiftDataList.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/route/shift/get_list")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getRouteShiftList(
    		@ApiParam(value = "Идентификатор маршрута", required = true)@QueryParam("route_id") int routeId)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	@GET
	@ApiOperation(value = "Получить расписание для смены маршрута",
			response = RouteShiftData.class)
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/route/shift/get_schedule")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getRouteShiftSchedule(
    		@ApiParam(value = "Идентификатор маршрута", required = true)@QueryParam("route_id") int routeId,
    		@ApiParam(value = "Идентификатор смены", required = true)@QueryParam("shift_id") int shiftId)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	@GET
	@ApiOperation(value = "Получить список всех водителей",
	    notes = "Выводится JSON массивом",
	    response = DriverData.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/drivers")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getDriverList()
    {
    	try {
			return Response.status(Response.Status.OK).entity(BusScheduleEngine.getDriversList()).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
    }
	
	@GET
	@ApiOperation(value = "Получить данные о водителе",
	    notes = "Выводится JSON массивом",
	    response = DriverData.class)
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/drivers/{id}")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getDriver(
    		@ApiParam(value = "Идентификатор водителя", required = true)@PathParam("id") String driverId)
    {
    	try {
			return Response.status(Response.Status.OK).entity(BusScheduleEngine.getDriver(driverId)).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
    }
	
			
	@GET
	@ApiOperation(value = "Получить расписание водителей",
	    notes = "Выводится JSON массивом в виде списка дат и типа смены. На конкретный промежуток между двумя датами. в параметре driverId id водителей. При пустом driverId выводится расписание всех водителей",
	    response = DriverScheduleDataOnDate.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/drivers/schedule")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getDriverSchedule(
    		@ApiParam(value = "Идентификаторы водителей", required = true)@QueryParam("drivers_id") List<String> driversIdList,
    		@ApiParam(value = "Номер бригады", required = true)@QueryParam("brigade_id") String brigadeId,
    		@ApiParam(value = "Идентификаторы автобусов", required = true)@QueryParam("bus_id") List<String> busesIdList,
    		@ApiParam(value = "Дата минимальная", required = true)@QueryParam("date_min") String dateMin,
    		@ApiParam(value = "Дата максимальная", required = true)@QueryParam("date_max") String dateMax)
    {
    	try {
			return Response.status(Response.Status.OK).entity(BusScheduleEngine.getDriverSchedule(driversIdList, brigadeId, busesIdList, dateMin, dateMax)).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
    }

	@GET
	@ApiOperation(value = "Получить список всех кондукторов",
	    notes = "Выводится JSON массивом",
	    response = ConductorData.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/conductors")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getConductorList()
    {
    	try {
			return Response.status(Response.Status.OK).entity(BusScheduleEngine.getConductorsList()).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
    }
	
	@GET
	@ApiOperation(value = "Получить данные о кондукторe",
	    notes = "Выводится JSON массивом",
	    response = ConductorData.class)
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/conductors/{id}")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getConductor(
    		@ApiParam(value = "Идентификатор кондуктора", required = true)@PathParam("id") String conductorId)
    {
    	try {
			return Response.status(Response.Status.OK).entity(BusScheduleEngine.getConductor(conductorId)).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
    }
	
	
	@GET
	@ApiOperation(value = "Получить расписание кондукторов",
	    notes = "Выводится JSON массивом в виде списка дат и типа смены. На конкретный промежуток между двумя датами. в параметре conductorIdList JSON список id кондукторов. При пустом conductorIdList выводится расписание всех кондукторов",
	    response = ConductorScheduleDataOnDate.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/conductors/schedule")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public Response getConductorShiftType(
    		@ApiParam(value = "список идентификаторов кондукторов", required = false)@QueryParam("conductors_id") List<String> conductorIdList,		
    		@ApiParam(value = "дата минимальная", required = true)@QueryParam("date_min") String dateMin,
    		@ApiParam(value = "дата максимальная", required = true)@QueryParam("date_max") String dateMax)
    {
    	try {
			return Response.status(Response.Status.OK).entity(BusScheduleEngine.getConductorSchedule(conductorIdList, dateMin, dateMax)).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
    }
	
	@GET
	@ApiOperation(value = "Получить актуальный список доступных водителей",
	    notes = "Выводится JSON массивом. На конкретную дату",
	    response = AvailableDriversOnDate.class)
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/drivers/available")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getAvailableDrivers(
    		@ApiParam(value = "Дата", required = true)@QueryParam("date") String date)
    {		
    	try {
			return Response.status(Response.Status.OK).entity(BusScheduleEngine.getAvailableDrivers(date)).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
    }
	
	@GET
	@ApiOperation(value = "Получить актуальный список доступных кондукторов",
	    notes = "Выводится JSON массивом. На конкретную дату",
	    response = ConductorData.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/conductor/available")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getAvailableConductors(
    		@ApiParam(value = "Дата", required = true)@QueryParam("date") String date)
    {
    	try {
			return Response.status(Response.Status.OK).entity(BusScheduleEngine.getAvailableConductors(date)).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
    }
	
	@POST
	@ApiOperation(value = "Назначить смене маршрута водителя",
	    notes = "В параметрах передается JSON  с идентификатором смены маршрута, идентификатором водителя и датой",
	    response=FixDriverParams.class)
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/schedule/fix_driver")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public Response setDriverForShift(FixDriverParams fixDriverParams)
    {
    	return Response.status(Response.Status.OK).entity(fixDriverParams).build();
    }

	
	@POST
	@ApiOperation(value = "Назначить смене маршрута кондуктора",
	    notes = "В параметрах передается JSON  с идентификатором смены маршрута, идентификатором кондуктора и датой",
	    response=FixConductorParams.class)
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/schedule/fix_conductor")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public Response setConductorForShift(FixConductorParams fixConductorParams)
    {
		return Response.status(Response.Status.OK).entity(fixConductorParams).build();
    }
		
	@GET
	@ApiOperation(value = "Получить список автобусов",
	    notes = "JSON ",
	    response = BusData.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/buses")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getBusList()
    {
    	try {
			return Response.status(Response.Status.OK).entity(BusScheduleEngine.getBusList()).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}	
    }
	
	
	@GET
	@ApiOperation(value = "Получить данные об автобусе",
	    notes = "JSON ",
	    response = BusData.class)
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/buses/{id}")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getBus(@ApiParam(value = "Идентификатор автобуса", required = true)@PathParam("id") String busId)
    {
		try {
			return Response.status(Response.Status.OK).entity(BusScheduleEngine.getBusInfo(busId)).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
    }
	
	
	@GET
	@ApiOperation(value = "Получить список доступных автобусов на конкретную дату",
	    notes = "Выводится JSON, в составе которого дата и список доступных автобусов ",
	    response = AvailableBusesOnDate.class)
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/buses/available")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getActualBusList(
    		@ApiParam(value = "дата", required = true)@QueryParam("date") String date)
    {
		
    	try {
			return Response.status(Response.Status.OK).entity(BusScheduleEngine.getAvailableBuses(date)).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
    }
	
	
	@GET
	@ApiOperation(value = "Получить расписание технической доступности автобусов",
	    notes = "Выводится JSON массивом в виде списка дат, где каждой дате соответствует список автобусов с указанием типа технического состояния. На конкретный промежуток между двумя датами. в параметре busesIdList JSON список гаражных номеров автобусов. При пустом busesIdList выводится расписание всех автобусов",
	    response = BusTechAvailabilityDataOnDate.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/buses/techAvailability")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getBusTechAvailability(
    		@ApiParam(value = "JSON список id автобусов", required = false)@QueryParam("busesIdList") List<String> busesIdList,
    		@ApiParam(value = "дата начальная", required = true)@QueryParam("date_min") String dateMin,
    		@ApiParam(value = "дата конечная", required = true)@QueryParam("date_max") String dateMax)
    {
    	try {
			return Response.status(Response.Status.OK).entity(BusScheduleEngine.getBusesCondition(busesIdList, dateMin, dateMax)).build();
		} catch (ClassNotFoundException | SQLException e) {
			return Response.status(Response.Status.OK).entity(e.toString()).build();
		}
    }
	
	@GET
	@ApiOperation(value = "Получить разнарядку",
	    notes = "Выводится JSON массивом.",
	    response = OrderData.class)
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/order/get")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getOrder(
    		@ApiParam(value = "дата", required = true)@QueryParam("date") String date_max)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
}