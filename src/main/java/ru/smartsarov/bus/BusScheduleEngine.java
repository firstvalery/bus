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


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.jooq.Record11;
import org.jooq.Record4;
import org.jooq.SQLDialect;

import org.jooq.impl.DSL;


import com.google.gson.Gson;


import ru.smartsarov.bus.responses.AvailableBusesOnDate;
import ru.smartsarov.bus.responses.BusData;
import ru.smartsarov.bus.responses.BusTechAvailabilityData;
import ru.smartsarov.bus.responses.BusTechAvailabilityDataOnDate;
import ru.smartsarov.bus.responses.DriverData;




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
	         						}).collect(Collectors.toList()));
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
												if(a==null&b!=null)return -1;
												else if(a!=null&b==null)return 1;
												else if(a==null && b==null) return 0;
												return a.getBusData().getId().compareTo(b.getBusData().getId());
											}
	         								
	         							})
	         						.collect(Collectors.toList()));
	         			}
	         	).sorted(new Comparator<BusTechAvailabilityDataOnDate>() {

					@Override
					public int compare(BusTechAvailabilityDataOnDate a, BusTechAvailabilityDataOnDate b) {
						if(a==null&b!=null)return -1;
						else if(a!=null&b==null)return 1;
						else if(a==null && b==null) return 0;
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


	
}
