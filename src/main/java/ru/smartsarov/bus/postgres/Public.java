/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

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
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 550856080;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.bus</code>.
     */
    public final Bus BUS = ru.smartsarov.bus.postgres.tables.Bus.BUS;

    /**
     * The table <code>public.bus_info</code>.
     */
    public final BusInfo BUS_INFO = ru.smartsarov.bus.postgres.tables.BusInfo.BUS_INFO;

    /**
     * The table <code>public.bus_snapshot</code>.
     */
    public final BusSnapshot BUS_SNAPSHOT = ru.smartsarov.bus.postgres.tables.BusSnapshot.BUS_SNAPSHOT;

    /**
     * The table <code>public.bus_stop_list</code>.
     */
    public final BusStopList BUS_STOP_LIST = ru.smartsarov.bus.postgres.tables.BusStopList.BUS_STOP_LIST;

    /**
     * The table <code>public.bus_stops</code>.
     */
    public final BusStops BUS_STOPS = ru.smartsarov.bus.postgres.tables.BusStops.BUS_STOPS;

    /**
     * The table <code>public.cond_employee_info</code>.
     */
    public final CondEmployeeInfo COND_EMPLOYEE_INFO = ru.smartsarov.bus.postgres.tables.CondEmployeeInfo.COND_EMPLOYEE_INFO;

    /**
     * The table <code>public.conductor</code>.
     */
    public final Conductor CONDUCTOR = ru.smartsarov.bus.postgres.tables.Conductor.CONDUCTOR;

    /**
     * The table <code>public.conductor_schedule</code>.
     */
    public final ConductorSchedule CONDUCTOR_SCHEDULE = ru.smartsarov.bus.postgres.tables.ConductorSchedule.CONDUCTOR_SCHEDULE;

    /**
     * The table <code>public.conductor_schedule_snapshot</code>.
     */
    public final ConductorScheduleSnapshot CONDUCTOR_SCHEDULE_SNAPSHOT = ru.smartsarov.bus.postgres.tables.ConductorScheduleSnapshot.CONDUCTOR_SCHEDULE_SNAPSHOT;

    /**
     * The table <code>public.conductor_snapshot</code>.
     */
    public final ConductorSnapshot CONDUCTOR_SNAPSHOT = ru.smartsarov.bus.postgres.tables.ConductorSnapshot.CONDUCTOR_SNAPSHOT;

    /**
     * The table <code>public.departure_list</code>.
     */
    public final DepartureList DEPARTURE_LIST = ru.smartsarov.bus.postgres.tables.DepartureList.DEPARTURE_LIST;

    /**
     * The table <code>public.departure_moments</code>.
     */
    public final DepartureMoments DEPARTURE_MOMENTS = ru.smartsarov.bus.postgres.tables.DepartureMoments.DEPARTURE_MOMENTS;

    /**
     * The table <code>public.driver</code>.
     */
    public final Driver DRIVER = ru.smartsarov.bus.postgres.tables.Driver.DRIVER;

    /**
     * The table <code>public.driver_brigade</code>.
     */
    public final DriverBrigade DRIVER_BRIGADE = ru.smartsarov.bus.postgres.tables.DriverBrigade.DRIVER_BRIGADE;

    /**
     * The table <code>public.driver_group</code>.
     */
    public final DriverGroup DRIVER_GROUP = ru.smartsarov.bus.postgres.tables.DriverGroup.DRIVER_GROUP;

    /**
     * The table <code>public.driver_schedule</code>.
     */
    public final DriverSchedule DRIVER_SCHEDULE = ru.smartsarov.bus.postgres.tables.DriverSchedule.DRIVER_SCHEDULE;

    /**
     * The table <code>public.driver_schedule_snapshot</code>.
     */
    public final DriverScheduleSnapshot DRIVER_SCHEDULE_SNAPSHOT = ru.smartsarov.bus.postgres.tables.DriverScheduleSnapshot.DRIVER_SCHEDULE_SNAPSHOT;

    /**
     * The table <code>public.driver_snapshot</code>.
     */
    public final DriverSnapshot DRIVER_SNAPSHOT = ru.smartsarov.bus.postgres.tables.DriverSnapshot.DRIVER_SNAPSHOT;

    /**
     * The table <code>public.employee_info</code>.
     */
    public final EmployeeInfo EMPLOYEE_INFO = ru.smartsarov.bus.postgres.tables.EmployeeInfo.EMPLOYEE_INFO;

    /**
     * The table <code>public.fuel_code</code>.
     */
    public final FuelCode FUEL_CODE = ru.smartsarov.bus.postgres.tables.FuelCode.FUEL_CODE;

    /**
     * The table <code>public.generation_info</code>.
     */
    public final GenerationInfo GENERATION_INFO = ru.smartsarov.bus.postgres.tables.GenerationInfo.GENERATION_INFO;

    /**
     * The table <code>public.incident</code>.
     */
    public final Incident INCIDENT = ru.smartsarov.bus.postgres.tables.Incident.INCIDENT;

    /**
     * The table <code>public.race</code>.
     */
    public final Race RACE = ru.smartsarov.bus.postgres.tables.Race.RACE;

    /**
     * The table <code>public.race_snaphot</code>.
     */
    public final RaceSnaphot RACE_SNAPHOT = ru.smartsarov.bus.postgres.tables.RaceSnaphot.RACE_SNAPHOT;

    /**
     * The table <code>public.rb_bus_condition_type</code>.
     */
    public final RbBusConditionType RB_BUS_CONDITION_TYPE = ru.smartsarov.bus.postgres.tables.RbBusConditionType.RB_BUS_CONDITION_TYPE;

    /**
     * The table <code>public.rb_bus_make</code>.
     */
    public final RbBusMake RB_BUS_MAKE = ru.smartsarov.bus.postgres.tables.RbBusMake.RB_BUS_MAKE;

    /**
     * The table <code>public.rb_bus_model</code>.
     */
    public final RbBusModel RB_BUS_MODEL = ru.smartsarov.bus.postgres.tables.RbBusModel.RB_BUS_MODEL;

    /**
     * The table <code>public.rb_bus_stop</code>.
     */
    public final RbBusStop RB_BUS_STOP = ru.smartsarov.bus.postgres.tables.RbBusStop.RB_BUS_STOP;

    /**
     * The table <code>public.rb_employee_schedule_type</code>.
     */
    public final RbEmployeeScheduleType RB_EMPLOYEE_SCHEDULE_TYPE = ru.smartsarov.bus.postgres.tables.RbEmployeeScheduleType.RB_EMPLOYEE_SCHEDULE_TYPE;

    /**
     * The table <code>public.rb_fuel_type</code>.
     */
    public final RbFuelType RB_FUEL_TYPE = ru.smartsarov.bus.postgres.tables.RbFuelType.RB_FUEL_TYPE;

    /**
     * The table <code>public.rb_incident_type</code>.
     */
    public final RbIncidentType RB_INCIDENT_TYPE = ru.smartsarov.bus.postgres.tables.RbIncidentType.RB_INCIDENT_TYPE;

    /**
     * The table <code>public.rb_position</code>.
     */
    public final RbPosition RB_POSITION = ru.smartsarov.bus.postgres.tables.RbPosition.RB_POSITION;

    /**
     * The table <code>public.rb_ready_type</code>.
     */
    public final RbReadyType RB_READY_TYPE = ru.smartsarov.bus.postgres.tables.RbReadyType.RB_READY_TYPE;

    /**
     * The table <code>public.rb_shift_type</code>.
     */
    public final RbShiftType RB_SHIFT_TYPE = ru.smartsarov.bus.postgres.tables.RbShiftType.RB_SHIFT_TYPE;

    /**
     * The table <code>public.rb_state_type</code>.
     */
    public final RbStateType RB_STATE_TYPE = ru.smartsarov.bus.postgres.tables.RbStateType.RB_STATE_TYPE;

    /**
     * The table <code>public.route</code>.
     */
    public final Route ROUTE = ru.smartsarov.bus.postgres.tables.Route.ROUTE;

    /**
     * The table <code>public.route_schedule</code>.
     */
    public final RouteSchedule ROUTE_SCHEDULE = ru.smartsarov.bus.postgres.tables.RouteSchedule.ROUTE_SCHEDULE;

    /**
     * The table <code>public.route_schedule_snapshot</code>.
     */
    public final RouteScheduleSnapshot ROUTE_SCHEDULE_SNAPSHOT = ru.smartsarov.bus.postgres.tables.RouteScheduleSnapshot.ROUTE_SCHEDULE_SNAPSHOT;

    /**
     * The table <code>public.route_snapshot</code>.
     */
    public final RouteSnapshot ROUTE_SNAPSHOT = ru.smartsarov.bus.postgres.tables.RouteSnapshot.ROUTE_SNAPSHOT;

    /**
     * The table <code>public.shift_departure_list</code>.
     */
    public final ShiftDepartureList SHIFT_DEPARTURE_LIST = ru.smartsarov.bus.postgres.tables.ShiftDepartureList.SHIFT_DEPARTURE_LIST;

    /**
     * Оператор наполняет смену маршрута из списка моментов отправления для данного маршрута. 
Триггером проверяется приналдежность всех записей одному маршруту при INSERT. На уровне внешнего приложения проверяется group() ==1
     */
    public final ShiftDepartureMoments SHIFT_DEPARTURE_MOMENTS = ru.smartsarov.bus.postgres.tables.ShiftDepartureMoments.SHIFT_DEPARTURE_MOMENTS;

    /**
     * The table <code>public.shift_fixed</code>.
     */
    public final ShiftFixed SHIFT_FIXED = ru.smartsarov.bus.postgres.tables.ShiftFixed.SHIFT_FIXED;

    /**
     * The table <code>public.shift_fixed_snapshot</code>.
     */
    public final ShiftFixedSnapshot SHIFT_FIXED_SNAPSHOT = ru.smartsarov.bus.postgres.tables.ShiftFixedSnapshot.SHIFT_FIXED_SNAPSHOT;

    /**
     * The table <code>public.shift_schedule</code>.
     */
    public final ShiftSchedule SHIFT_SCHEDULE = ru.smartsarov.bus.postgres.tables.ShiftSchedule.SHIFT_SCHEDULE;

    /**
     * The table <code>public.shift_schedule_snapshot</code>.
     */
    public final ShiftScheduleSnapshot SHIFT_SCHEDULE_SNAPSHOT = ru.smartsarov.bus.postgres.tables.ShiftScheduleSnapshot.SHIFT_SCHEDULE_SNAPSHOT;

    /**
     * The table <code>public.tech_availability</code>.
     */
    public final TechAvailability TECH_AVAILABILITY = ru.smartsarov.bus.postgres.tables.TechAvailability.TECH_AVAILABILITY;

    /**
     * The table <code>public.tech_availability_snapshot</code>.
     */
    public final TechAvailabilitySnapshot TECH_AVAILABILITY_SNAPSHOT = ru.smartsarov.bus.postgres.tables.TechAvailabilitySnapshot.TECH_AVAILABILITY_SNAPSHOT;

    /**
     * The table <code>public.track</code>.
     */
    public final Track TRACK = ru.smartsarov.bus.postgres.tables.Track.TRACK;

    /**
     * The table <code>public.track_coordinates</code>.
     */
    public final TrackCoordinates TRACK_COORDINATES = ru.smartsarov.bus.postgres.tables.TrackCoordinates.TRACK_COORDINATES;

    /**
     * The table <code>public.user</code>.
     */
    public final User USER = ru.smartsarov.bus.postgres.tables.User.USER;

    /**
     * The table <code>public.user_session</code>.
     */
    public final UserSession USER_SESSION = ru.smartsarov.bus.postgres.tables.UserSession.USER_SESSION;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.BUS_ID_SEQ,
            Sequences.BUS_INFO_ID_SEQ,
            Sequences.BUS_SNAPSHOT_ID_SEQ,
            Sequences.BUS_STOP_LIST_ID_SEQ,
            Sequences.BUS_STOPS_ID_SEQ,
            Sequences.COND_EMPLOYEE_INFO_ID_SEQ,
            Sequences.CONDUCTOR_ID_SEQ,
            Sequences.CONDUCTOR_SNAPSHOT_ID_SEQ,
            Sequences.DEPARTURE_LIST_ID_SEQ,
            Sequences.DEPARTURE_MOMENTS_ID_SEQ,
            Sequences.DRIVER_BRIGADE_ID_SEQ,
            Sequences.DRIVER_GROUP_ID_SEQ,
            Sequences.DRIVER_ID_SEQ,
            Sequences.DRIVER_SNAPSHOT_ID_SEQ,
            Sequences.EMPLOYEE_INFO_ID_SEQ,
            Sequences.FUEL_CODE_ID_SEQ,
            Sequences.INCIDENT_ID_SEQ,
            Sequences.RACE_ID_SEQ,
            Sequences.RACE_SNAPHOT_ID_SEQ,
            Sequences.RB_BUS_CONDITION_TYPE_ID_SEQ,
            Sequences.RB_BUS_MAKE_ID_SEQ,
            Sequences.RB_BUS_MODEL_ID_SEQ,
            Sequences.RB_BUS_STOP_ID_SEQ,
            Sequences.RB_EMPLOYEE_SCHEDULE_TYPE_ID_SEQ,
            Sequences.RB_FUEL_TYPE_ID_SEQ,
            Sequences.RB_POSITION_ID_SEQ,
            Sequences.RB_READY_TYPE_ID_SEQ,
            Sequences.RB_SHIFT_TYPE_ID_SEQ,
            Sequences.RB_STATE_TYPE_ID_SEQ,
            Sequences.ROUTE_ID_SEQ,
            Sequences.SHIFT_DEPARTURE_LIST_ID_SEQ,
            Sequences.SHIFT_DEPARTURE_MOMENTS_ID_SEQ,
            Sequences.SHIFT_FIXED_SHIFT_SCHEDULE_ID_SEQ,
            Sequences.SHIFT_FIXED_SNAPSHOT_SHIFT_SCHEDULE_ID_SEQ,
            Sequences.SHIFT_SCHEDULE_ID_SEQ,
            Sequences.SHIFT_SCHEDULE_SNAPSHOT_ID_SEQ,
            Sequences.TRACK_COORDINATES_ID_SEQ,
            Sequences.TRACK_ID_SEQ,
            Sequences.USER_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Bus.BUS,
            BusInfo.BUS_INFO,
            BusSnapshot.BUS_SNAPSHOT,
            BusStopList.BUS_STOP_LIST,
            BusStops.BUS_STOPS,
            CondEmployeeInfo.COND_EMPLOYEE_INFO,
            Conductor.CONDUCTOR,
            ConductorSchedule.CONDUCTOR_SCHEDULE,
            ConductorScheduleSnapshot.CONDUCTOR_SCHEDULE_SNAPSHOT,
            ConductorSnapshot.CONDUCTOR_SNAPSHOT,
            DepartureList.DEPARTURE_LIST,
            DepartureMoments.DEPARTURE_MOMENTS,
            Driver.DRIVER,
            DriverBrigade.DRIVER_BRIGADE,
            DriverGroup.DRIVER_GROUP,
            DriverSchedule.DRIVER_SCHEDULE,
            DriverScheduleSnapshot.DRIVER_SCHEDULE_SNAPSHOT,
            DriverSnapshot.DRIVER_SNAPSHOT,
            EmployeeInfo.EMPLOYEE_INFO,
            FuelCode.FUEL_CODE,
            GenerationInfo.GENERATION_INFO,
            Incident.INCIDENT,
            Race.RACE,
            RaceSnaphot.RACE_SNAPHOT,
            RbBusConditionType.RB_BUS_CONDITION_TYPE,
            RbBusMake.RB_BUS_MAKE,
            RbBusModel.RB_BUS_MODEL,
            RbBusStop.RB_BUS_STOP,
            RbEmployeeScheduleType.RB_EMPLOYEE_SCHEDULE_TYPE,
            RbFuelType.RB_FUEL_TYPE,
            RbIncidentType.RB_INCIDENT_TYPE,
            RbPosition.RB_POSITION,
            RbReadyType.RB_READY_TYPE,
            RbShiftType.RB_SHIFT_TYPE,
            RbStateType.RB_STATE_TYPE,
            Route.ROUTE,
            RouteSchedule.ROUTE_SCHEDULE,
            RouteScheduleSnapshot.ROUTE_SCHEDULE_SNAPSHOT,
            RouteSnapshot.ROUTE_SNAPSHOT,
            ShiftDepartureList.SHIFT_DEPARTURE_LIST,
            ShiftDepartureMoments.SHIFT_DEPARTURE_MOMENTS,
            ShiftFixed.SHIFT_FIXED,
            ShiftFixedSnapshot.SHIFT_FIXED_SNAPSHOT,
            ShiftSchedule.SHIFT_SCHEDULE,
            ShiftScheduleSnapshot.SHIFT_SCHEDULE_SNAPSHOT,
            TechAvailability.TECH_AVAILABILITY,
            TechAvailabilitySnapshot.TECH_AVAILABILITY_SNAPSHOT,
            Track.TRACK,
            TrackCoordinates.TRACK_COORDINATES,
            User.USER,
            UserSession.USER_SESSION);
    }
}
