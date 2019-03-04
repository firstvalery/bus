package ru.smartsarov.bus;

import static ru.smartsarov.bus.postgres.tables.Bus.*;
import static ru.smartsarov.bus.postgres.tables.BusInfo.*;
import static ru.smartsarov.bus.postgres.tables.RbBusMake.*;
import static ru.smartsarov.bus.postgres.tables.RbBusModel.*;
import static ru.smartsarov.bus.postgres.tables.RbBusConditionType.*;
import static ru.smartsarov.bus.postgres.tables.TechAvailability.*;
import static ru.smartsarov.bus.postgres.tables.Driver.*;
import static ru.smartsarov.bus.postgres.tables.EmployeeInfo.*;
import static ru.smartsarov.bus.postgres.tables.DriverGroup.*;
import static ru.smartsarov.bus.postgres.tables.RbStateType.*;
import static ru.smartsarov.bus.postgres.tables.DriverSchedule.*;
import static ru.smartsarov.bus.postgres.tables.RbShiftType.*;
import static ru.smartsarov.bus.postgres.tables.RbReadyType.*;
import static ru.smartsarov.bus.postgres.tables.Conductor.*;
import static ru.smartsarov.bus.postgres.tables.ConductorSchedule.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.jooq.Record11;
import org.jooq.Record4;
import org.jooq.Record6;
import org.jooq.Record8;
import org.jooq.Result;
import org.jooq.SQLDialect;

import org.jooq.impl.DSL;


import com.google.gson.Gson;


import ru.smartsarov.bus.responses.AvailableBusesOnDate;
import ru.smartsarov.bus.responses.AvailableDriversOnDate;
import ru.smartsarov.bus.responses.BusData;
import ru.smartsarov.bus.responses.BusTechAvailabilityData;
import ru.smartsarov.bus.responses.BusTechAvailabilityDataOnDate;
import ru.smartsarov.bus.responses.ConductorData;
import ru.smartsarov.bus.responses.ConductorScheduleData;
import ru.smartsarov.bus.responses.ConductorScheduleDataOnDate;
import ru.smartsarov.bus.responses.DriverData;
import ru.smartsarov.bus.responses.DriverScheduleData;
import ru.smartsarov.bus.responses.DriverScheduleDataOnDate;




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
	public static String getBusList() throws ClassNotFoundException, SQLException {
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
	         						}
	         				).collect(Collectors.toList()));
		}    
	}
	
	/**
	 *returns bus info 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static String getBusInfo(String busId) throws ClassNotFoundException, SQLException {
		Integer integerBusesId =null;
		try {
			integerBusesId = Integer.valueOf(busId);
		}catch(NumberFormatException e) {
			return getJsonMessage(String.format("%s%s", busId,"- this parameter has not numeric value."));
		}
		
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
			         							.where(BUS.ID.eq(integerBusesId))
	         									.fetchAny();	         								
	        return j==null?"{}":new Gson().toJson(new BusData(
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
												j.get(RB_BUS_CONDITION_TYPE.NAME)));
	    }
	}
	
	/**
	 *returns available buses for the date
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static String getAvailableBuses(String date) throws ClassNotFoundException, SQLException {
		Date sqlDate=null;
		try {
			sqlDate = Date.valueOf(date);
		}catch(IllegalArgumentException  e) {
			return getJsonMessage(String.format("%s%s", date, " - wrong date formate. Сheck pattern matching yyyy-[m]m-[d]d"));
		}
		try (Connection conn = getConnection()) {
			return new Gson().toJson(new AvailableBusesOnDate(date,
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
				       									RB_BUS_CONDITION_TYPE.NAME)
	       										.from(BUS).join(BUS_INFO).on(BUS.BUS_INFO_ID.eq(BUS_INFO.ID))
	       												.join(RB_BUS_MAKE).on(BUS_INFO.MAKE_ID.eq(RB_BUS_MAKE.ID))
	       												.join(RB_BUS_MODEL).on(BUS_INFO.MODEL_ID.eq(RB_BUS_MODEL.ID))		
	       												.join(RB_BUS_CONDITION_TYPE).on(BUS.CONDITION_ID.eq(RB_BUS_CONDITION_TYPE.ID))
	       												.join(TECH_AVAILABILITY).on(BUS.ID.eq(TECH_AVAILABILITY.BUS_ID))
	       										.where(TECH_AVAILABILITY.DATE.eq(sqlDate)
	       												.and(TECH_AVAILABILITY.BUS_CONDITION_ID.eq(Constants.BUS_CONDITION_AVAILABLE)))
	         									.fetch()	         									
	         									.stream()
	         									.map(j->{return new	BusData(        
	         															j.get(BUS.ID),
																		null,//j.get(BUS_INFO.VIN),
																		null,//j.get(BUS_INFO.YEAR_OF_ISSUE),
																		j.get(RB_BUS_MAKE.NAME),
																		j.get(RB_BUS_MODEL.NAME),
																		j.get(BUS.GARAGE_NUMBER),
																		j.get(BUS.STATE_NUMBER),
																		null,//j.get(BUS.FUEL_CODE_ID),
																		null,//j.get(BUS.ODOMETER_MILEAGE),
																		null,//j.get(BUS.TRACKER_MILEAGE),
																		null);//j.get(RB_BUS_CONDITION_TYPE.NAME));
	         									})
	         									.collect(Collectors.toList())));
		}  	
	}
	
	/**
	 *returns technical condition of buses for the period between to dates
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static String getBusesCondition(List<String> busesIdList, String dateMin, String dateMax)  throws ClassNotFoundException, SQLException {
		Date sqlDateMin=null;
		Date sqlDateMax=null;
		try {
			sqlDateMin = Date.valueOf(dateMin);
			sqlDateMax = Date.valueOf(dateMax);
		}catch(IllegalArgumentException  e) {
			return getJsonMessage(String.format("%s%s%s%s", dateMin,", ",dateMax,  " - wrong date formate. Сheck pattern matching yyyy-[m]m-[d]d"));
		}
		
		List<Integer>integerBusesIdList = null;
		try {
			integerBusesIdList = busesIdList.stream()
			.map(j->{
						return Integer.valueOf(j);
					}).collect(Collectors.toList());
		}catch(NumberFormatException e) {
			return getJsonMessage(String.format("%s%s", busesIdList,"- One or more parameters has not numeric value."));
		}
		

		
		try (Connection conn = getConnection()) {
		return new Gson().toJson(DSL.using(conn, SQLDialect.POSTGRES_10)    	         
				.select(
				   TECH_AVAILABILITY.DATE,
				   BUS.ID, 
				   BUS.GARAGE_NUMBER,
				   RB_BUS_CONDITION_TYPE.NAME)
	       		.from(BUS).join(BUS_INFO).on(BUS.BUS_INFO_ID.eq(BUS_INFO.ID))	
	       		.join(TECH_AVAILABILITY).on(BUS.ID.eq(TECH_AVAILABILITY.BUS_ID))
	       		.join(RB_BUS_CONDITION_TYPE).on(TECH_AVAILABILITY.BUS_CONDITION_ID.eq(RB_BUS_CONDITION_TYPE.ID))
	       		.where(TECH_AVAILABILITY.DATE.between(sqlDateMin).and(sqlDateMax)
	       				.and((integerBusesIdList==null || integerBusesIdList.size()==0)?BUS.ID.eq(BUS.ID):BUS.ID.in(integerBusesIdList)))
	         	.fetch()	

	         	.stream()
	         	.collect(Collectors.groupingBy(Record4<Date, Integer, String, String>::value1))//TODO
	         	.entrySet()
	         	.stream()
	         	.map(i->{
	         			return new BusTechAvailabilityDataOnDate(
	         						i.getValue().get(0).get(TECH_AVAILABILITY.DATE).toString(),//date
	         						i.getValue()// list of busses
	         						.stream()
	         						.map(j->{return new 
	         		         					BusTechAvailabilityData(
	         		         						new	BusData(        
	         		         									j.get(BUS.ID),
	         													null,
	         													null,
	         													null,
	         													null,
	         													j.get(BUS.GARAGE_NUMBER),
	         													null,
	         													null,
	         													null,
	         													null,
	         													null), 
	         		         						j.get(RB_BUS_CONDITION_TYPE.NAME));
	         		         				}
	         							).sorted(new Comparator<BusTechAvailabilityData>() {
											@Override
											public int compare(BusTechAvailabilityData a, BusTechAvailabilityData b) {
												//TODO
												if(a==null||b==null)return 0;
												if(a.getBusData()==null||b.getBusData()==null)return 0;
												if(a.getBusData().getId()==null || b.getBusData().getId()==null) return 0;
												return a.getBusData().getId().compareTo(b.getBusData().getId());
											}
	         								
	         							})
	         						.collect(Collectors.toList()));
	         			}
	         	).sorted(new Comparator<BusTechAvailabilityDataOnDate>() {

					@Override
					public int compare(BusTechAvailabilityDataOnDate a, BusTechAvailabilityDataOnDate b) {
						if(a==null||b==null)return 0;
						if(a.getDate()==null|| b.getDate()==null)return 0;
						return Date.valueOf(a.getDate()).compareTo(Date.valueOf(b.getDate()));
					}
	         		
	         	})
	         	.collect(Collectors.toList())
	       );
		}  	
	}

	
	 
		/**
		 *returns drivers info list 
		 * @throws SQLException 
		 * @throws ClassNotFoundException 
		 */ 
		public static String getDriversList() throws ClassNotFoundException, SQLException {
			try (Connection conn = getConnection()) {
				return new Gson().toJson(
		       DSL.using(conn, SQLDialect.POSTGRES_10)   	         
		   						.select(DRIVER.ID,
		   								EMPLOYEE_INFO.PERSONNEL_NUMBER,
		   								EMPLOYEE_INFO.FIRST_NAME,
		   								EMPLOYEE_INFO.MIDDLE_NAME,
		   								EMPLOYEE_INFO.LAST_NAME,
		   								BUS.GARAGE_NUMBER,
		   								DRIVER.GROUP_ID,
		   								DRIVER_GROUP.BRIGADE_ID,
		   								DRIVER.BRIGADIER_FLAG,
		   								RB_STATE_TYPE.NAME,
		   								DRIVER.TICKET_FLAG)
		   						.from(DRIVER)
		   						.join(EMPLOYEE_INFO).on(DRIVER.EMPLOYEE_DATA_ID.eq(EMPLOYEE_INFO.ID))
		   						.join(BUS).on(DRIVER.BUS_ID.eq(BUS.ID))
		    		   			.join(DRIVER_GROUP).on(DRIVER.GROUP_ID.eq(DRIVER_GROUP.ID))
		    		   			.join(RB_STATE_TYPE).on(DRIVER.STATE_ID.eq(RB_STATE_TYPE.ID))
		         				.fetch()
		         				.stream()
		         				.map(j->{return new DriverData(
			         						j.getValue(DRIVER.ID),
			         						j.getValue(EMPLOYEE_INFO.PERSONNEL_NUMBER),
			         						j.getValue(EMPLOYEE_INFO.FIRST_NAME),
			         						j.getValue(EMPLOYEE_INFO.MIDDLE_NAME),
			         						j.getValue(EMPLOYEE_INFO.LAST_NAME),
			         						j.getValue(BUS.GARAGE_NUMBER),
			         						j.getValue(DRIVER.GROUP_ID),
			         						j.getValue(DRIVER_GROUP.BRIGADE_ID),
			         						j.getValue(DRIVER.BRIGADIER_FLAG),
			         						j.getValue(RB_STATE_TYPE.NAME),
			         						j.getValue(DRIVER.TICKET_FLAG)
		         							);
		         						}
		         				).collect(Collectors.toList()));
			}  
		}
		
		
		/**
		 *returns driver data by Id
		 * @throws SQLException 
		 * @throws ClassNotFoundException 
		 */ 
		public static String getDriver(String driverId) throws ClassNotFoundException, SQLException {
			Integer integerDriverId = null;
			try {
				integerDriverId = Integer.valueOf(driverId);
			}catch(NumberFormatException e) {
				return getJsonMessage(String.format("%s%s", driverId,"- this parameter has not numeric value."));
			}
			try (Connection conn = getConnection()) {
		    Record11<Integer, String, String, String, String, String, Short, Short, Boolean, String, Boolean> j =  DSL.using(conn, SQLDialect.POSTGRES_10)   	         
		   						.select(DRIVER.ID,
		   								EMPLOYEE_INFO.PERSONNEL_NUMBER,
		   								EMPLOYEE_INFO.FIRST_NAME,
		   								EMPLOYEE_INFO.MIDDLE_NAME,
		   								EMPLOYEE_INFO.LAST_NAME,
		   								BUS.GARAGE_NUMBER,
		   								DRIVER.GROUP_ID,
		   								DRIVER_GROUP.BRIGADE_ID,
		   								DRIVER.BRIGADIER_FLAG,
		   								RB_STATE_TYPE.NAME,
		   								DRIVER.TICKET_FLAG)
		   						.from(DRIVER)
		   						.join(EMPLOYEE_INFO).on(DRIVER.EMPLOYEE_DATA_ID.eq(EMPLOYEE_INFO.ID))
		   						.join(BUS).on(DRIVER.BUS_ID.eq(BUS.ID))
		    		   			.join(DRIVER_GROUP).on(DRIVER.GROUP_ID.eq(DRIVER_GROUP.ID))
		    		   			.join(RB_STATE_TYPE).on(DRIVER.STATE_ID.eq(RB_STATE_TYPE.ID))
		    		   			.where(DRIVER.ID.eq(integerDriverId))
		         				.fetchAny();
		         				
		    return j==null?"{}": new Gson().toJson(new DriverData(
											         	j.getValue(DRIVER.ID),
											         	j.getValue(EMPLOYEE_INFO.PERSONNEL_NUMBER),
											         	j.getValue(EMPLOYEE_INFO.FIRST_NAME),
											         	j.getValue(EMPLOYEE_INFO.MIDDLE_NAME),
											         	j.getValue(EMPLOYEE_INFO.LAST_NAME),
											         	j.getValue(BUS.GARAGE_NUMBER),
											         	j.getValue(DRIVER.GROUP_ID),
											         	j.getValue(DRIVER_GROUP.BRIGADE_ID),
											         	j.getValue(DRIVER.BRIGADIER_FLAG),
											         	j.getValue(RB_STATE_TYPE.NAME),
											         	j.getValue(DRIVER.TICKET_FLAG)
										         	));
			}
		}


		/**
		 *returns drivers schedule for period between to dates
		 * @throws SQLException 
		 * @throws ClassNotFoundException 
		 */ 
		public static String getDriverSchedule(List<String> driversIdList, String brigadeId, List<String> busesIdList, 
															String dateMin, String dateMax) 
																	throws ClassNotFoundException, SQLException {
			//проверим передаваемые параметры на соответствие типам
			List<Integer>integerDriversIdList = null;
			List<Integer>integerBusesIdList = null;
			Short shBrigadeId = null;
			try {
				integerDriversIdList = driversIdList.stream() 
				.map(j->{
							return Integer.valueOf(j);
						}).collect(Collectors.toList());
				
				integerBusesIdList = busesIdList.stream()
						.map(j->{
									return Integer.valueOf(j);
								}).collect(Collectors.toList());
				shBrigadeId = Short.valueOf(brigadeId);
			}catch(NumberFormatException e) {
				return getJsonMessage(String.format("driversIdList = %s, brigadeId = %s, busesIdList = %s - One or more parameters has not numeric value.", driversIdList, brigadeId, busesIdList));
			}
			
			
			Date sqlDateMin=null;
			Date sqlDateMax=null;
			try {
				sqlDateMin = Date.valueOf(dateMin);
				sqlDateMax = Date.valueOf(dateMax);
			}catch(IllegalArgumentException  e) {
				return getJsonMessage(String.format("%s%s%s%s", dateMin,", ",dateMax,  " - wrong date formate. Сheck pattern matching yyyy-[m]m-[d]d"));
			}
			//работаем с БД
			try (Connection conn = getConnection()) {	
		      return new Gson().toJson(DSL.using(conn, SQLDialect.POSTGRES_10)   	         
		   						.select(DRIVER_SCHEDULE.DATE,
		   								DRIVER.ID,
		   								EMPLOYEE_INFO.PERSONNEL_NUMBER,
		   								EMPLOYEE_INFO.FIRST_NAME,
		   								EMPLOYEE_INFO.MIDDLE_NAME,
		   								EMPLOYEE_INFO.LAST_NAME,
		   								BUS.GARAGE_NUMBER,
		   								DRIVER.GROUP_ID,
		   								DRIVER_GROUP.BRIGADE_ID,
		   								RB_SHIFT_TYPE.NAME,
		   								RB_READY_TYPE.NAME
		   								)
		   						
		   						.from(DRIVER)
		   						.join(EMPLOYEE_INFO).on(DRIVER.EMPLOYEE_DATA_ID.eq(EMPLOYEE_INFO.ID))
		   						.join(BUS).on(DRIVER.BUS_ID.eq(BUS.ID))
		    		   			.join(DRIVER_GROUP).on(DRIVER.GROUP_ID.eq(DRIVER_GROUP.ID))
		    		   			.join(DRIVER_SCHEDULE).on(DRIVER.ID.eq(DRIVER_SCHEDULE.DRIVER_ID))
		    		   			.join(RB_SHIFT_TYPE).on(DRIVER_SCHEDULE.SHIFT_TYPE_ID.eq(RB_SHIFT_TYPE.ID))
		    		   			.join(RB_READY_TYPE).on(DRIVER_SCHEDULE.READY_TYPE_ID.eq(RB_READY_TYPE.ID))
		    		   			
		    		   			.where(DRIVER_SCHEDULE.DATE.between(sqlDateMin).and(sqlDateMax))
		    		   			.and((integerDriversIdList==null||integerDriversIdList.size()==0) ?DRIVER.ID.eq(DRIVER.ID): DRIVER.ID.in(integerDriversIdList))
		    		   			.and((integerBusesIdList==null||integerBusesIdList.size()==0) ?BUS.ID.eq(BUS.ID): BUS.ID.in(integerBusesIdList))
		    		   			.and(DRIVER_GROUP.BRIGADE_ID.eq(shBrigadeId))
		    		   			
		    		   			.fetch()
		         	//получили выборку по датам, водителям, автобусам, номеру бригады.
		         				
		         				//сгруппируем по дате
		         				.stream()
		         				.collect(Collectors.groupingBy(Record11<Date, Integer, String,
		         																String, String, String,
		         																		String, Short, Short,
		         																				String, String>::value1))
		         				.entrySet() // в каждом наборе имеем список строк по всем водителям в указанную дату
		         				.stream()
		         				.map(j->{ //сгенерируем List<DriverScheduleDataOnDate> 
		         					return new DriverScheduleDataOnDate(
		         							j.getValue().get(0).get(DRIVER_SCHEDULE.DATE).toString(),
		         							j.getValue().stream()
		         							.map(k->{//сгенерируем для каждой даты List<DriverScheduleData>
		         								return new DriverScheduleData(
		         											new DriverData(
		         													k.getValue(DRIVER.ID),
		    											         	k.getValue(EMPLOYEE_INFO.PERSONNEL_NUMBER),
		    											         	k.getValue(EMPLOYEE_INFO.FIRST_NAME),
		    											         	k.getValue(EMPLOYEE_INFO.MIDDLE_NAME),
		    											         	k.getValue(EMPLOYEE_INFO.LAST_NAME),
		    											         	k.getValue(BUS.GARAGE_NUMBER),
		    											         	k.getValue(DRIVER.GROUP_ID),
		    											         	k.getValue(DRIVER_GROUP.BRIGADE_ID),
		    											         	null,
		    											         	null,
		    											         	null
		         													),
		         											k.getValue(RB_SHIFT_TYPE.NAME),
		         											k.getValue(RB_READY_TYPE.NAME));
		         									}
		         								).sorted(new Comparator<DriverScheduleData>() {
		         									//TODO
													@Override
													public int compare(DriverScheduleData a, DriverScheduleData b) {
														//при null вернем 0
														if(a==null||b==null)return 0;
														if (a.getDriverData()==null||b.getDriverData()==null) return 0;
														if (a.getDriverData().getId()==null||b.getDriverData().getId()==null) return 0;
														return a.getDriverData().getId().compareTo(b.getDriverData().getId());
													}
		         								})
		         							.collect(Collectors.toList()));
		         						}
		         					).sorted(new Comparator<DriverScheduleDataOnDate>() {
		         						//TODO
										@Override
										public int compare(DriverScheduleDataOnDate a, DriverScheduleDataOnDate b) {
											if(a==null||b==null)return 0;
											if(a.getDate()==null|| b.getDate()==null)return 0;
											return Date.valueOf(a.getDate()).compareTo(Date.valueOf(b.getDate()));
										}})
		         				.collect(Collectors.toList())); 
			}
		}		

		/**
		 *returns available drivers on Date
		 * @throws SQLException 
		 * @throws ClassNotFoundException 
		 */ 
		public static String getAvailableDrivers(String date) throws ClassNotFoundException, SQLException {
			//проверим на соответствие формату
			Date sqlDate=null;
			try {
				sqlDate = Date.valueOf(date);

			}catch(IllegalArgumentException  e) {
				return getJsonMessage(String.format("date:%s "," - wrong date formate. Сheck pattern matching yyyy-[m]m-[d]d"));
			}
				return new Gson().toJson(new AvailableDriversOnDate(date, getAvailableDriversList(sqlDate)));
		}
		
		/**
		 * Returns List<DriverScheduleData> of available drivers
		 * @throws SQLException 
		 * @throws ClassNotFoundException 
		 */
		public static List<DriverScheduleData> getAvailableDriversList(Date date) throws ClassNotFoundException, SQLException  {	
			//работаем с БД
			try (Connection conn = getConnection()) {	
				return 
			      DSL.using(conn, SQLDialect.POSTGRES_10)   	         
			   						.select(
			   								DRIVER.ID,
			   								EMPLOYEE_INFO.FIRST_NAME,
			   								EMPLOYEE_INFO.MIDDLE_NAME,
			   								EMPLOYEE_INFO.LAST_NAME,
			   								BUS.GARAGE_NUMBER,
			   								RB_SHIFT_TYPE.NAME,
			   								DRIVER.TICKET_FLAG
			   								)
			   						.from(DRIVER)
			   						.join(EMPLOYEE_INFO).on(DRIVER.EMPLOYEE_DATA_ID.eq(EMPLOYEE_INFO.ID))
			   						.join(BUS).on(DRIVER.BUS_ID.eq(BUS.ID))
			    		   			.join(DRIVER_SCHEDULE).on(DRIVER.ID.eq(DRIVER_SCHEDULE.DRIVER_ID))
			    		   			.join(RB_SHIFT_TYPE).on(DRIVER_SCHEDULE.SHIFT_TYPE_ID.eq(RB_SHIFT_TYPE.ID))
			    		   			.join(RB_READY_TYPE).on(DRIVER_SCHEDULE.READY_TYPE_ID.eq(RB_READY_TYPE.ID))
			      					.where(DRIVER_SCHEDULE.DATE.eq(date))
			      					.and(DRIVER_SCHEDULE.READY_TYPE_ID.eq(Constants.DRIVER_READY_AVAILABLE))
			      					.fetch()
			      					.stream()
			      					.map(j->{
			      							return new DriverScheduleData(new DriverData(
			      																j.getValue(DRIVER.ID),
																		         	null,
																		         	j.getValue(EMPLOYEE_INFO.FIRST_NAME),
																		         	j.getValue(EMPLOYEE_INFO.MIDDLE_NAME),
																		         	j.getValue(EMPLOYEE_INFO.LAST_NAME),
																		         	j.getValue(BUS.GARAGE_NUMBER),
																		         	null,
																		         	null,
																		         	null,
																		         	null,
																		         	j.getValue(DRIVER.TICKET_FLAG)),
											      							  	j.getValue(RB_SHIFT_TYPE.NAME),
											      							  	null);
			      							}
			      						)
			      					.collect(Collectors.toList());
			}	
		}

		/**
		 * Returns conductors list
		 * @throws SQLException 
		 * @throws ClassNotFoundException 
		 */
		public static String getConductorsList() throws ClassNotFoundException, SQLException  {
			try (Connection conn = getConnection()) {
				return new Gson().toJson(
		       DSL.using(conn, SQLDialect.POSTGRES_10)   	         
		   						.select(CONDUCTOR.ID,
		   								EMPLOYEE_INFO.PERSONNEL_NUMBER,
		   								EMPLOYEE_INFO.FIRST_NAME,
		   								EMPLOYEE_INFO.MIDDLE_NAME,
		   								EMPLOYEE_INFO.LAST_NAME,
		   								RB_STATE_TYPE.NAME)
		   						.from(CONDUCTOR)
		   						.join(EMPLOYEE_INFO).on(CONDUCTOR.EMPLOYEE_DATA_ID.eq(EMPLOYEE_INFO.ID))
		    		   			.join(RB_STATE_TYPE).on(CONDUCTOR.STATE_ID.eq(RB_STATE_TYPE.ID))
		         				.fetch()
		         				.stream()
		         				.map(j->{return new ConductorData(
					         						j.getValue(CONDUCTOR.ID),
					         						j.getValue(EMPLOYEE_INFO.PERSONNEL_NUMBER),
					         						j.getValue(EMPLOYEE_INFO.FIRST_NAME),
					         						j.getValue(EMPLOYEE_INFO.MIDDLE_NAME),
					         						j.getValue(EMPLOYEE_INFO.LAST_NAME),
					         						j.getValue(RB_STATE_TYPE.NAME));
		         						}
		         					)
		         				.collect(Collectors.toList()));
			}  
		}
		
		/**
		 * Returns conductor data
		 * @throws SQLException 
		 * @throws ClassNotFoundException 
		 */
		public static String getConductor(String conductorId) throws ClassNotFoundException, SQLException  {
			Integer integerConductorId = null;
			try {
				integerConductorId = Integer.valueOf(conductorId);
			}catch(NumberFormatException e) {
				return getJsonMessage(String.format("%s - this parameter has not numeric value.",conductorId));
			}
			
			try (Connection conn = getConnection()) {
				
		       Record6<Integer, String, String, String, String, String>j = DSL.using(conn, SQLDialect.POSTGRES_10)   	         
		   						.select(CONDUCTOR.ID,
		   								EMPLOYEE_INFO.PERSONNEL_NUMBER,
		   								EMPLOYEE_INFO.FIRST_NAME,
		   								EMPLOYEE_INFO.MIDDLE_NAME,
		   								EMPLOYEE_INFO.LAST_NAME,
		   								RB_STATE_TYPE.NAME)
		   						.from(CONDUCTOR)
		   						.join(EMPLOYEE_INFO).on(CONDUCTOR.EMPLOYEE_DATA_ID.eq(EMPLOYEE_INFO.ID))
		    		   			.join(RB_STATE_TYPE).on(CONDUCTOR.STATE_ID.eq(RB_STATE_TYPE.ID))
		    		   			.where(CONDUCTOR.ID.eq(integerConductorId))
		         				.fetchAny();
		         				return j==null?"{}": new Gson().toJson(new ConductorData(
					         						j.getValue(CONDUCTOR.ID),
					         						j.getValue(EMPLOYEE_INFO.PERSONNEL_NUMBER),
					         						j.getValue(EMPLOYEE_INFO.FIRST_NAME),
					         						j.getValue(EMPLOYEE_INFO.MIDDLE_NAME),
					         						j.getValue(EMPLOYEE_INFO.LAST_NAME),
					         						j.getValue(RB_STATE_TYPE.NAME)));
			}  
		}

		/**
		 *Returnt conductors schedule fos period between two dates 
		 * @throws SQLException 
		 * @throws ClassNotFoundException 
		 */
		public static Object getConductorSchedule(List<String> conductorIdList, String dateMin, String dateMax) throws ClassNotFoundException, SQLException {
			//проверим передаваемые параметры на соответствие типам
			List<Integer>integerConductorIdList = null;
			try {
				integerConductorIdList = conductorIdList.stream() 
				.map(j->{
							return Integer.valueOf(j);
						}).collect(Collectors.toList());
			}catch(NumberFormatException e) {
				return getJsonMessage(String.format("conductorIdList: %s - One or more parameters has not numeric value.", conductorIdList));
			}
					
			Date sqlDateMin=null;
			Date sqlDateMax=null;
			try {
				sqlDateMin = Date.valueOf(dateMin);
				sqlDateMax = Date.valueOf(dateMax);
			}catch(IllegalArgumentException  e) {
				return getJsonMessage(String.format("%s or %s - wrong date formate. Сheck pattern matching yyyy-[m]m-[d]d", dateMin, dateMax));
			}
			
			try (Connection conn = getConnection()) {
				return new Gson().toJson(DSL.using(conn, SQLDialect.POSTGRES_10)   	         
					.select(CONDUCTOR_SCHEDULE.DATE,
							CONDUCTOR.ID,
							EMPLOYEE_INFO.PERSONNEL_NUMBER,
							EMPLOYEE_INFO.FIRST_NAME,
							EMPLOYEE_INFO.MIDDLE_NAME,
							EMPLOYEE_INFO.LAST_NAME,
							RB_SHIFT_TYPE.NAME,
							RB_READY_TYPE.NAME)
					.from(CONDUCTOR)
					.join(EMPLOYEE_INFO).on(CONDUCTOR.EMPLOYEE_DATA_ID.eq(EMPLOYEE_INFO.ID))
		   			.join(CONDUCTOR_SCHEDULE).on(CONDUCTOR.ID.eq(CONDUCTOR_SCHEDULE.CONDUCTOR_ID))
		   			.join(RB_SHIFT_TYPE).on(CONDUCTOR_SCHEDULE.SHIFT_TYPE_ID.eq(RB_SHIFT_TYPE.ID))
		   			.join(RB_READY_TYPE).on(CONDUCTOR_SCHEDULE.READY_TYPE_ID.eq(RB_READY_TYPE.ID))
		   			.where(CONDUCTOR_SCHEDULE.DATE.between(sqlDateMin).and(sqlDateMax))
		   			.and((integerConductorIdList==null||integerConductorIdList.size()==0)?CONDUCTOR.ID.eq(CONDUCTOR.ID):CONDUCTOR.ID.in(integerConductorIdList))
		   			.fetch()
		   			//Получили выборку расписания
		   			
		   			.stream()//соберем по датам
		   			.collect(Collectors.groupingBy(Record8<Date,Integer, String,
		   													String, String, String,
		   															String, String>::value1))
		   			.entrySet()
		   			.stream()
		   			.map(j->{
		   				return new ConductorScheduleDataOnDate(
		   									j.getValue().get(0).getValue(CONDUCTOR_SCHEDULE.DATE).toString(),
		   									j.getValue()
		   									.stream()
		   									.map(k->{
		   										return new ConductorScheduleData(
					   												new ConductorData(
					   						         						k.getValue(CONDUCTOR.ID),
					   						         						k.getValue(EMPLOYEE_INFO.PERSONNEL_NUMBER),
					   						         						k.getValue(EMPLOYEE_INFO.FIRST_NAME),
					   						         						k.getValue(EMPLOYEE_INFO.MIDDLE_NAME),
					   						         						k.getValue(EMPLOYEE_INFO.LAST_NAME),
					   						         						k.getValue(RB_STATE_TYPE.NAME)),
					   												k.getValue(RB_SHIFT_TYPE.NAME),
					   												k.getValue(RB_READY_TYPE.NAME));
		   											}
		   										).sorted(new Comparator<ConductorScheduleData>() {

													@Override
													public int compare(ConductorScheduleData a,ConductorScheduleData b) {
														// TODO 
														if(a==null||b==null)return 0;
														if (a.getConductorData()==null||b.getConductorData()==null) return 0;
														if (a.getConductorData().getId()==null||b.getConductorData().getId()==null) return 0;
														return a.getConductorData().getId().compareTo(b.getConductorData().getId());

													}})
		   									.collect(Collectors.toList()));
		   					}
		   				).sorted(new Comparator<ConductorScheduleDataOnDate>() {

							@Override
							public int compare(ConductorScheduleDataOnDate a, ConductorScheduleDataOnDate b) {
								//TODO
								if(a==null||b==null)return 0;
								if(a.getDate()==null|| b.getDate()==null)return 0;
								return Date.valueOf(a.getDate()).compareTo(Date.valueOf(b.getDate()));
							}
		   					
		   				})
		   			.collect(Collectors.toList()));
				}
		}
		
		/**
		 * returns available conductors on date
		 * @throws SQLException 
		 * @throws ClassNotFoundException 
		 */
		public static Object getAvailableConductors(String date) throws ClassNotFoundException, SQLException {
			//проверим передаваемые параметры на соответствие типам
			Date sqlDate=null;
			try {
				sqlDate = Date.valueOf(date);
			}catch(IllegalArgumentException  e) {
				return getJsonMessage(String.format("%s - wrong date formate. Сheck pattern matching yyyy-[m]m-[d]d", date));
			}

			return new Gson().toJson( new ConductorScheduleDataOnDate(date, getAvailableConductorsList(sqlDate)));	
		}
		/**
		 * returns List<ConductorScheduleData> of available conductors on date
		 * @throws SQLException 
		 * @throws ClassNotFoundException 
		 */
		public static List<ConductorScheduleData> getAvailableConductorsList(Date date) throws ClassNotFoundException, SQLException {
			try (Connection conn = getConnection()) {
			return DSL.using(conn, SQLDialect.POSTGRES_10)   	         
					.select(
							CONDUCTOR.ID,
							EMPLOYEE_INFO.PERSONNEL_NUMBER,
							EMPLOYEE_INFO.FIRST_NAME,
							EMPLOYEE_INFO.MIDDLE_NAME,
							EMPLOYEE_INFO.LAST_NAME,
							RB_SHIFT_TYPE.NAME)
					.from(CONDUCTOR)
					.join(EMPLOYEE_INFO).on(CONDUCTOR.EMPLOYEE_DATA_ID.eq(EMPLOYEE_INFO.ID))
		   			.join(CONDUCTOR_SCHEDULE).on(CONDUCTOR.ID.eq(CONDUCTOR_SCHEDULE.CONDUCTOR_ID))
		   			.join(RB_SHIFT_TYPE).on(CONDUCTOR_SCHEDULE.SHIFT_TYPE_ID.eq(RB_SHIFT_TYPE.ID))
		   			.join(RB_READY_TYPE).on(CONDUCTOR_SCHEDULE.READY_TYPE_ID.eq(RB_READY_TYPE.ID))
		   			.where(CONDUCTOR_SCHEDULE.DATE.eq(date))
		   			.and(CONDUCTOR_SCHEDULE.READY_TYPE_ID.eq(Constants.DRIVER_READY_AVAILABLE))
		 		   	.fetch()
		   			//Получили выборку работающих кондукторов
		   			
		   			.stream()
		   			.map(j->{
		   				return new ConductorScheduleData(
		   						new ConductorData(
		   								j.getValue(CONDUCTOR.ID),
		         						j.getValue(EMPLOYEE_INFO.PERSONNEL_NUMBER),
		         						j.getValue(EMPLOYEE_INFO.FIRST_NAME),
		         						j.getValue(EMPLOYEE_INFO.MIDDLE_NAME),
		         						j.getValue(EMPLOYEE_INFO.LAST_NAME),
		         						null),
		   						j.getValue(RB_SHIFT_TYPE.NAME),
		   						null);
		   			}).collect(Collectors.toList());	
				}
		}


		
		
		
	
}
