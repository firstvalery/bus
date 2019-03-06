/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres;


import javax.annotation.Generated;

import ru.smartsarov.bus.postgres.tables.Bus;
import ru.smartsarov.bus.postgres.tables.BusInfo;
import ru.smartsarov.bus.postgres.tables.BusSnapshot;
import ru.smartsarov.bus.postgres.tables.BusStopList;
import ru.smartsarov.bus.postgres.tables.BusStops;
import ru.smartsarov.bus.postgres.tables.CondEmployeeInfo;
import ru.smartsarov.bus.postgres.tables.Conductor;
import ru.smartsarov.bus.postgres.tables.ConductorSchedule;
import ru.smartsarov.bus.postgres.tables.ConductorScheduleSnapshot;
import ru.smartsarov.bus.postgres.tables.ConductorSnapshot;
import ru.smartsarov.bus.postgres.tables.DepartureList;
import ru.smartsarov.bus.postgres.tables.DepartureMoments;
import ru.smartsarov.bus.postgres.tables.Driver;
import ru.smartsarov.bus.postgres.tables.DriverBrigade;
import ru.smartsarov.bus.postgres.tables.DriverGroup;
import ru.smartsarov.bus.postgres.tables.DriverSchedule;
import ru.smartsarov.bus.postgres.tables.DriverScheduleSnapshot;
import ru.smartsarov.bus.postgres.tables.DriverSnapshot;
import ru.smartsarov.bus.postgres.tables.EmployeeInfo;
import ru.smartsarov.bus.postgres.tables.FuelCode;
import ru.smartsarov.bus.postgres.tables.GenerationInfo;
import ru.smartsarov.bus.postgres.tables.Incident;
import ru.smartsarov.bus.postgres.tables.Race;
import ru.smartsarov.bus.postgres.tables.RaceSnaphot;
import ru.smartsarov.bus.postgres.tables.RbBusConditionType;
import ru.smartsarov.bus.postgres.tables.RbBusMake;
import ru.smartsarov.bus.postgres.tables.RbBusModel;
import ru.smartsarov.bus.postgres.tables.RbBusStop;
import ru.smartsarov.bus.postgres.tables.RbEmployeeScheduleType;
import ru.smartsarov.bus.postgres.tables.RbFuelType;
import ru.smartsarov.bus.postgres.tables.RbIncidentType;
import ru.smartsarov.bus.postgres.tables.RbPosition;
import ru.smartsarov.bus.postgres.tables.RbReadyType;
import ru.smartsarov.bus.postgres.tables.RbShiftType;
import ru.smartsarov.bus.postgres.tables.RbStateType;
import ru.smartsarov.bus.postgres.tables.Route;
import ru.smartsarov.bus.postgres.tables.RouteSchedule;
import ru.smartsarov.bus.postgres.tables.RouteScheduleSnapshot;
import ru.smartsarov.bus.postgres.tables.RouteSnapshot;
import ru.smartsarov.bus.postgres.tables.ShiftDepartureList;
import ru.smartsarov.bus.postgres.tables.ShiftDepartureMoments;
import ru.smartsarov.bus.postgres.tables.ShiftFixed;
import ru.smartsarov.bus.postgres.tables.ShiftFixedSnapshot;
import ru.smartsarov.bus.postgres.tables.ShiftSchedule;
import ru.smartsarov.bus.postgres.tables.ShiftScheduleSnapshot;
import ru.smartsarov.bus.postgres.tables.TechAvailability;
import ru.smartsarov.bus.postgres.tables.TechAvailabilitySnapshot;
import ru.smartsarov.bus.postgres.tables.Track;
import ru.smartsarov.bus.postgres.tables.TrackCoordinates;
import ru.smartsarov.bus.postgres.tables.User;
import ru.smartsarov.bus.postgres.tables.UserSession;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.bus</code>.
     */
    public static final Bus BUS = ru.smartsarov.bus.postgres.tables.Bus.BUS;

    /**
     * The table <code>public.bus_info</code>.
     */
    public static final BusInfo BUS_INFO = ru.smartsarov.bus.postgres.tables.BusInfo.BUS_INFO;

    /**
     * The table <code>public.bus_snapshot</code>.
     */
    public static final BusSnapshot BUS_SNAPSHOT = ru.smartsarov.bus.postgres.tables.BusSnapshot.BUS_SNAPSHOT;

    /**
     * The table <code>public.bus_stop_list</code>.
     */
    public static final BusStopList BUS_STOP_LIST = ru.smartsarov.bus.postgres.tables.BusStopList.BUS_STOP_LIST;

    /**
     * The table <code>public.bus_stops</code>.
     */
    public static final BusStops BUS_STOPS = ru.smartsarov.bus.postgres.tables.BusStops.BUS_STOPS;

    /**
     * The table <code>public.cond_employee_info</code>.
     */
    public static final CondEmployeeInfo COND_EMPLOYEE_INFO = ru.smartsarov.bus.postgres.tables.CondEmployeeInfo.COND_EMPLOYEE_INFO;

    /**
     * The table <code>public.conductor</code>.
     */
    public static final Conductor CONDUCTOR = ru.smartsarov.bus.postgres.tables.Conductor.CONDUCTOR;

    /**
     * The table <code>public.conductor_schedule</code>.
     */
    public static final ConductorSchedule CONDUCTOR_SCHEDULE = ru.smartsarov.bus.postgres.tables.ConductorSchedule.CONDUCTOR_SCHEDULE;

    /**
     * The table <code>public.conductor_schedule_snapshot</code>.
     */
    public static final ConductorScheduleSnapshot CONDUCTOR_SCHEDULE_SNAPSHOT = ru.smartsarov.bus.postgres.tables.ConductorScheduleSnapshot.CONDUCTOR_SCHEDULE_SNAPSHOT;

    /**
     * The table <code>public.conductor_snapshot</code>.
     */
    public static final ConductorSnapshot CONDUCTOR_SNAPSHOT = ru.smartsarov.bus.postgres.tables.ConductorSnapshot.CONDUCTOR_SNAPSHOT;

    /**
     * The table <code>public.departure_list</code>.
     */
    public static final DepartureList DEPARTURE_LIST = ru.smartsarov.bus.postgres.tables.DepartureList.DEPARTURE_LIST;

    /**
     * The table <code>public.departure_moments</code>.
     */
    public static final DepartureMoments DEPARTURE_MOMENTS = ru.smartsarov.bus.postgres.tables.DepartureMoments.DEPARTURE_MOMENTS;

    /**
     * The table <code>public.driver</code>.
     */
    public static final Driver DRIVER = ru.smartsarov.bus.postgres.tables.Driver.DRIVER;

    /**
     * The table <code>public.driver_brigade</code>.
     */
    public static final DriverBrigade DRIVER_BRIGADE = ru.smartsarov.bus.postgres.tables.DriverBrigade.DRIVER_BRIGADE;

    /**
     * The table <code>public.driver_group</code>.
     */
    public static final DriverGroup DRIVER_GROUP = ru.smartsarov.bus.postgres.tables.DriverGroup.DRIVER_GROUP;

    /**
     * The table <code>public.driver_schedule</code>.
     */
    public static final DriverSchedule DRIVER_SCHEDULE = ru.smartsarov.bus.postgres.tables.DriverSchedule.DRIVER_SCHEDULE;

    /**
     * The table <code>public.driver_schedule_snapshot</code>.
     */
    public static final DriverScheduleSnapshot DRIVER_SCHEDULE_SNAPSHOT = ru.smartsarov.bus.postgres.tables.DriverScheduleSnapshot.DRIVER_SCHEDULE_SNAPSHOT;

    /**
     * The table <code>public.driver_snapshot</code>.
     */
    public static final DriverSnapshot DRIVER_SNAPSHOT = ru.smartsarov.bus.postgres.tables.DriverSnapshot.DRIVER_SNAPSHOT;

    /**
     * The table <code>public.employee_info</code>.
     */
    public static final EmployeeInfo EMPLOYEE_INFO = ru.smartsarov.bus.postgres.tables.EmployeeInfo.EMPLOYEE_INFO;

    /**
     * The table <code>public.fuel_code</code>.
     */
    public static final FuelCode FUEL_CODE = ru.smartsarov.bus.postgres.tables.FuelCode.FUEL_CODE;

    /**
     * The table <code>public.generation_info</code>.
     */
    public static final GenerationInfo GENERATION_INFO = ru.smartsarov.bus.postgres.tables.GenerationInfo.GENERATION_INFO;

    /**
     * The table <code>public.incident</code>.
     */
    public static final Incident INCIDENT = ru.smartsarov.bus.postgres.tables.Incident.INCIDENT;

    /**
     * The table <code>public.race</code>.
     */
    public static final Race RACE = ru.smartsarov.bus.postgres.tables.Race.RACE;

    /**
     * The table <code>public.race_snaphot</code>.
     */
    public static final RaceSnaphot RACE_SNAPHOT = ru.smartsarov.bus.postgres.tables.RaceSnaphot.RACE_SNAPHOT;

    /**
     * The table <code>public.rb_bus_condition_type</code>.
     */
    public static final RbBusConditionType RB_BUS_CONDITION_TYPE = ru.smartsarov.bus.postgres.tables.RbBusConditionType.RB_BUS_CONDITION_TYPE;

    /**
     * The table <code>public.rb_bus_make</code>.
     */
    public static final RbBusMake RB_BUS_MAKE = ru.smartsarov.bus.postgres.tables.RbBusMake.RB_BUS_MAKE;

    /**
     * The table <code>public.rb_bus_model</code>.
     */
    public static final RbBusModel RB_BUS_MODEL = ru.smartsarov.bus.postgres.tables.RbBusModel.RB_BUS_MODEL;

    /**
     * The table <code>public.rb_bus_stop</code>.
     */
    public static final RbBusStop RB_BUS_STOP = ru.smartsarov.bus.postgres.tables.RbBusStop.RB_BUS_STOP;

    /**
     * The table <code>public.rb_employee_schedule_type</code>.
     */
    public static final RbEmployeeScheduleType RB_EMPLOYEE_SCHEDULE_TYPE = ru.smartsarov.bus.postgres.tables.RbEmployeeScheduleType.RB_EMPLOYEE_SCHEDULE_TYPE;

    /**
     * The table <code>public.rb_fuel_type</code>.
     */
    public static final RbFuelType RB_FUEL_TYPE = ru.smartsarov.bus.postgres.tables.RbFuelType.RB_FUEL_TYPE;

    /**
     * The table <code>public.rb_incident_type</code>.
     */
    public static final RbIncidentType RB_INCIDENT_TYPE = ru.smartsarov.bus.postgres.tables.RbIncidentType.RB_INCIDENT_TYPE;

    /**
     * The table <code>public.rb_position</code>.
     */
    public static final RbPosition RB_POSITION = ru.smartsarov.bus.postgres.tables.RbPosition.RB_POSITION;

    /**
     * The table <code>public.rb_ready_type</code>.
     */
    public static final RbReadyType RB_READY_TYPE = ru.smartsarov.bus.postgres.tables.RbReadyType.RB_READY_TYPE;

    /**
     * The table <code>public.rb_shift_type</code>.
     */
    public static final RbShiftType RB_SHIFT_TYPE = ru.smartsarov.bus.postgres.tables.RbShiftType.RB_SHIFT_TYPE;

    /**
     * The table <code>public.rb_state_type</code>.
     */
    public static final RbStateType RB_STATE_TYPE = ru.smartsarov.bus.postgres.tables.RbStateType.RB_STATE_TYPE;

    /**
     * The table <code>public.route</code>.
     */
    public static final Route ROUTE = ru.smartsarov.bus.postgres.tables.Route.ROUTE;

    /**
     * The table <code>public.route_schedule</code>.
     */
    public static final RouteSchedule ROUTE_SCHEDULE = ru.smartsarov.bus.postgres.tables.RouteSchedule.ROUTE_SCHEDULE;

    /**
     * The table <code>public.route_schedule_snapshot</code>.
     */
    public static final RouteScheduleSnapshot ROUTE_SCHEDULE_SNAPSHOT = ru.smartsarov.bus.postgres.tables.RouteScheduleSnapshot.ROUTE_SCHEDULE_SNAPSHOT;

    /**
     * The table <code>public.route_snapshot</code>.
     */
    public static final RouteSnapshot ROUTE_SNAPSHOT = ru.smartsarov.bus.postgres.tables.RouteSnapshot.ROUTE_SNAPSHOT;

    /**
     * The table <code>public.shift_departure_list</code>.
     */
    public static final ShiftDepartureList SHIFT_DEPARTURE_LIST = ru.smartsarov.bus.postgres.tables.ShiftDepartureList.SHIFT_DEPARTURE_LIST;

    /**
     * Оператор наполняет смену маршрута из списка моментов отправления для данного маршрута. 
Триггером проверяется приналдежность всех записей одному маршруту при INSERT. На уровне внешнего приложения проверяется group() ==1
     */
    public static final ShiftDepartureMoments SHIFT_DEPARTURE_MOMENTS = ru.smartsarov.bus.postgres.tables.ShiftDepartureMoments.SHIFT_DEPARTURE_MOMENTS;

    /**
     * The table <code>public.shift_fixed</code>.
     */
    public static final ShiftFixed SHIFT_FIXED = ru.smartsarov.bus.postgres.tables.ShiftFixed.SHIFT_FIXED;

    /**
     * The table <code>public.shift_fixed_snapshot</code>.
     */
    public static final ShiftFixedSnapshot SHIFT_FIXED_SNAPSHOT = ru.smartsarov.bus.postgres.tables.ShiftFixedSnapshot.SHIFT_FIXED_SNAPSHOT;

    /**
     * The table <code>public.shift_schedule</code>.
     */
    public static final ShiftSchedule SHIFT_SCHEDULE = ru.smartsarov.bus.postgres.tables.ShiftSchedule.SHIFT_SCHEDULE;

    /**
     * The table <code>public.shift_schedule_snapshot</code>.
     */
    public static final ShiftScheduleSnapshot SHIFT_SCHEDULE_SNAPSHOT = ru.smartsarov.bus.postgres.tables.ShiftScheduleSnapshot.SHIFT_SCHEDULE_SNAPSHOT;

    /**
     * The table <code>public.tech_availability</code>.
     */
    public static final TechAvailability TECH_AVAILABILITY = ru.smartsarov.bus.postgres.tables.TechAvailability.TECH_AVAILABILITY;

    /**
     * The table <code>public.tech_availability_snapshot</code>.
     */
    public static final TechAvailabilitySnapshot TECH_AVAILABILITY_SNAPSHOT = ru.smartsarov.bus.postgres.tables.TechAvailabilitySnapshot.TECH_AVAILABILITY_SNAPSHOT;

    /**
     * The table <code>public.track</code>.
     */
    public static final Track TRACK = ru.smartsarov.bus.postgres.tables.Track.TRACK;

    /**
     * The table <code>public.track_coordinates</code>.
     */
    public static final TrackCoordinates TRACK_COORDINATES = ru.smartsarov.bus.postgres.tables.TrackCoordinates.TRACK_COORDINATES;

    /**
     * The table <code>public.user</code>.
     */
    public static final User USER = ru.smartsarov.bus.postgres.tables.User.USER;

    /**
     * The table <code>public.user_session</code>.
     */
    public static final UserSession USER_SESSION = ru.smartsarov.bus.postgres.tables.UserSession.USER_SESSION;
}
