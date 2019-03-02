/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>public.bus_condition_id_seq</code>
     */
    public static final Sequence<Integer> BUS_CONDITION_ID_SEQ = new SequenceImpl<Integer>("bus_condition_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.bus_data_id_seq</code>
     */
    public static final Sequence<Integer> BUS_DATA_ID_SEQ = new SequenceImpl<Integer>("bus_data_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.bus_id_seq</code>
     */
    public static final Sequence<Integer> BUS_ID_SEQ = new SequenceImpl<Integer>("bus_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.bus_stop_list_id_seq</code>
     */
    public static final Sequence<Integer> BUS_STOP_LIST_ID_SEQ = new SequenceImpl<Integer>("bus_stop_list_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.bus_stops_id_seq</code>
     */
    public static final Sequence<Integer> BUS_STOPS_ID_SEQ = new SequenceImpl<Integer>("bus_stops_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.conductor_id_seq</code>
     */
    public static final Sequence<Integer> CONDUCTOR_ID_SEQ = new SequenceImpl<Integer>("conductor_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.conductor_snapshot_id_seq</code>
     */
    public static final Sequence<Integer> CONDUCTOR_SNAPSHOT_ID_SEQ = new SequenceImpl<Integer>("conductor_snapshot_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.departure_list_id_seq</code>
     */
    public static final Sequence<Integer> DEPARTURE_LIST_ID_SEQ = new SequenceImpl<Integer>("departure_list_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.departure_moments_id_seq</code>
     */
    public static final Sequence<Integer> DEPARTURE_MOMENTS_ID_SEQ = new SequenceImpl<Integer>("departure_moments_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.driver_brigade_id_seq</code>
     */
    public static final Sequence<Integer> DRIVER_BRIGADE_ID_SEQ = new SequenceImpl<Integer>("driver_brigade_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.driver_group_id_seq</code>
     */
    public static final Sequence<Integer> DRIVER_GROUP_ID_SEQ = new SequenceImpl<Integer>("driver_group_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.driver_id_seq</code>
     */
    public static final Sequence<Integer> DRIVER_ID_SEQ = new SequenceImpl<Integer>("driver_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.driver_snapshot_id_seq</code>
     */
    public static final Sequence<Integer> DRIVER_SNAPSHOT_ID_SEQ = new SequenceImpl<Integer>("driver_snapshot_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.employee_data_id_seq</code>
     */
    public static final Sequence<Integer> EMPLOYEE_DATA_ID_SEQ = new SequenceImpl<Integer>("employee_data_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.fuel_code_fuel_type_id_seq</code>
     */
    public static final Sequence<Integer> FUEL_CODE_FUEL_TYPE_ID_SEQ = new SequenceImpl<Integer>("fuel_code_fuel_type_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.fuel_code_id_seq</code>
     */
    public static final Sequence<Integer> FUEL_CODE_ID_SEQ = new SequenceImpl<Integer>("fuel_code_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.intsident_id_seq</code>
     */
    public static final Sequence<Integer> INTSIDENT_ID_SEQ = new SequenceImpl<Integer>("intsident_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.race_id_seq</code>
     */
    public static final Sequence<Integer> RACE_ID_SEQ = new SequenceImpl<Integer>("race_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.race_snaphot_id_seq</code>
     */
    public static final Sequence<Integer> RACE_SNAPHOT_ID_SEQ = new SequenceImpl<Integer>("race_snaphot_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.rb_bus_make_id_seq</code>
     */
    public static final Sequence<Integer> RB_BUS_MAKE_ID_SEQ = new SequenceImpl<Integer>("rb_bus_make_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.rb_bus_model_id_seq</code>
     */
    public static final Sequence<Integer> RB_BUS_MODEL_ID_SEQ = new SequenceImpl<Integer>("rb_bus_model_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.rb_bus_stop_id_seq</code>
     */
    public static final Sequence<Integer> RB_BUS_STOP_ID_SEQ = new SequenceImpl<Integer>("rb_bus_stop_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.rb_employee_schedule_type_id_seq</code>
     */
    public static final Sequence<Integer> RB_EMPLOYEE_SCHEDULE_TYPE_ID_SEQ = new SequenceImpl<Integer>("rb_employee_schedule_type_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.rb_employee_type_id_seq</code>
     */
    public static final Sequence<Integer> RB_EMPLOYEE_TYPE_ID_SEQ = new SequenceImpl<Integer>("rb_employee_type_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.rb_fuel_type_id_seq</code>
     */
    public static final Sequence<Integer> RB_FUEL_TYPE_ID_SEQ = new SequenceImpl<Integer>("rb_fuel_type_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.rb_ready_type_id_seq</code>
     */
    public static final Sequence<Integer> RB_READY_TYPE_ID_SEQ = new SequenceImpl<Integer>("rb_ready_type_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.rb_state_type_id_seq</code>
     */
    public static final Sequence<Integer> RB_STATE_TYPE_ID_SEQ = new SequenceImpl<Integer>("rb_state_type_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.route_id_seq</code>
     */
    public static final Sequence<Integer> ROUTE_ID_SEQ = new SequenceImpl<Integer>("route_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.shift_departure_list_id_seq</code>
     */
    public static final Sequence<Integer> SHIFT_DEPARTURE_LIST_ID_SEQ = new SequenceImpl<Integer>("shift_departure_list_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.shift_departure_moments_id_seq</code>
     */
    public static final Sequence<Integer> SHIFT_DEPARTURE_MOMENTS_ID_SEQ = new SequenceImpl<Integer>("shift_departure_moments_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.shift_schedule_id_seq</code>
     */
    public static final Sequence<Integer> SHIFT_SCHEDULE_ID_SEQ = new SequenceImpl<Integer>("shift_schedule_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.shift_schedule_snapshot_id_seq</code>
     */
    public static final Sequence<Integer> SHIFT_SCHEDULE_SNAPSHOT_ID_SEQ = new SequenceImpl<Integer>("shift_schedule_snapshot_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.shift_type_id_seq</code>
     */
    public static final Sequence<Integer> SHIFT_TYPE_ID_SEQ = new SequenceImpl<Integer>("shift_type_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.track_coordinates_id_seq</code>
     */
    public static final Sequence<Integer> TRACK_COORDINATES_ID_SEQ = new SequenceImpl<Integer>("track_coordinates_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));

    /**
     * The sequence <code>public.track_id_seq</code>
     */
    public static final Sequence<Integer> TRACK_ID_SEQ = new SequenceImpl<Integer>("track_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));
}