package ru.smartsarov.bus;




import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import io.swagger.annotations.*;
import ru.smartsarov.bus.responses.*;


import java.io.InputStream;
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
	@Path("/driver/get_list")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getDriverList()
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	@GET
	@ApiOperation(value = "Получить данные о водителе",
	    notes = "Выводится JSON массивом",
	    response = DriverData.class)
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/driver/get")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getDriver(
    		@ApiParam(value = "Идентификатор водителя", required = true)@QueryParam("driver_id") int driverId)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
			
	@GET
	@ApiOperation(value = "Получить расписание водителя",
	    notes = "Выводится JSON массивом в виде списка дат и типа смены. На конкретный промежуток между двумя датами. в параметре driverIdList JSON список id водителей. При пустом driverIdList выводится расписание всех водителей",
	    response = DriverScheduleDataOnDate.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/driver/schedule/get")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public Response getDriverShiftType(
    		@ApiParam(value = "Идентификаторы водителей", required = true)@QueryParam("driverIdList") String driverId,
    		@ApiParam(value = "дата минимальная", required = true)@QueryParam("dateMin") String dateMin,
    		@ApiParam(value = "дата максимальная", required = true)@QueryParam("dateMax") String dateMax)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }

	@GET
	@ApiOperation(value = "Получить список всех кондукторов",
	    notes = "Выводится JSON массивом",
	    response = ConductorData.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/conductor/get_list")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getConductorList()
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	@GET
	@ApiOperation(value = "Получить данные о кондукторe",
	    notes = "Выводится JSON массивом",
	    response = ConductorData.class)
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/conductor/get")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getConductor(
    		@ApiParam(value = "Идентификатор кондуктора", required = true)@QueryParam("conductor_id") int driverId)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	
	@GET
	@ApiOperation(value = "Получить расписание кондуктора",
	    notes = "Выводится JSON массивом в виде списка дат и типа смены. На конкретный промежуток между двумя датами. в параметре conductorIdList JSON список id кондукторов. При пустом conductorIdList выводится расписание всех кондукторов",
	    response = ConductorScheduleDataOnDate.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/conductor/schedule/get")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
    public Response getConductorShiftType(
    		@ApiParam(value = "Идентификаторы кондуктора", required = false)@QueryParam("conductorIdList") String conductorIdList,
    		@ApiParam(value = "дата минимальная", required = true)@QueryParam("dateMin") String date_min,
    		@ApiParam(value = "дата максимальная", required = true)@QueryParam("dateMax") String date_max)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	@GET
	@ApiOperation(value = "Получить актуальный список доступных водителей",
	    notes = "Выводится JSON массивом. На конкретную дату",
	    response = DriverData.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/driver/get_actual_list")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getAvailableDrivers(
    		@ApiParam(value = "Идентификатор водителя", required = true)@QueryParam("driver_id") int driverId,
    		@ApiParam(value = "Дата", required = true)@QueryParam("date") int date)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	@GET
	@ApiOperation(value = "Получить актуальный список доступных кондукторов",
	    notes = "Выводится JSON массивом. На конкретную дату",
	    response = ConductorData.class,
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/conductor/get_actual_list")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getAvailableConductors(
    		@ApiParam(value = "Идентификатор кондуктора", required = true)@QueryParam("conductor_id") int driverId,
    		@ApiParam(value = "Дата", required = true)@QueryParam("date") int date)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
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
	@ApiOperation(value = "Получить общую разнарядку",
	    notes = "JSON ",
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/schedule/get")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getCommonSchedule(
    		@ApiParam(value = "JSON", required = true)@QueryParam("date") String date)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	@GET
	@ApiOperation(value = "Получить разнарядку для водителя",
	    notes = "JSON ",
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/schedule/get/for_driver")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getDriverSchedule(
    		@ApiParam(value = "JSON", required = true)@QueryParam("date") String date,
    		@ApiParam(value = "идентификатор водителя", required = true)@QueryParam("driver_id") String driverId)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	
	@GET
	@ApiOperation(value = "Получить разнарядку для кондуктора",
	    notes = "JSON ",
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/schedule/get/for_conductor")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getConductorSchedule(
    		@ApiParam(value = "JSON", required = true)@QueryParam("date") String date,
    		@ApiParam(value = "идентификатор кондуктора", required = true)@QueryParam("conductor_id") String conductorId)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
	@GET
	@ApiOperation(value = "Получить разнарядку для автобуса",
	    notes = "JSON ",
	    responseContainer = "List")
	@ApiResponses(value = { 
		      @ApiResponse(code = 400, message = "Bad Request"),
		      @ApiResponse(code = 404, message = "Not Found") })
	@Path("/schedule/get/for_bus")
	@Produces(MediaType.APPLICATION_JSON)
    public Response getBusSchedule(
    		@ApiParam(value = "JSON", required = true)@QueryParam("date") String date,
    		@ApiParam(value = "идентификатор автобуса", required = true)@QueryParam("bus_id") String conductorId)
    {
		InputStream is = this.getClass().getResourceAsStream("/static/index.html");
    	return Response.status(Response.Status.OK).entity(is).build();
    }
	
}