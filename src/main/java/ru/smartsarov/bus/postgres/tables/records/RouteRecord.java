/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.bus.postgres.tables.Route;


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
public class RouteRecord extends UpdatableRecordImpl<RouteRecord> implements Record6<Integer, Short, Short, String, Short, Short> {

    private static final long serialVersionUID = 1769426190;

    /**
     * Setter for <code>public.route.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.route.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.route.bus_stop_list_id</code>.
     */
    public void setBusStopListId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.route.bus_stop_list_id</code>.
     */
    public Short getBusStopListId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.route.track_id</code>.
     */
    public void setTrackId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.route.track_id</code>.
     */
    public Short getTrackId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.route.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.route.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.route.day_type</code>.
     */
    public void setDayType(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.route.day_type</code>.
     */
    public Short getDayType() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>public.route.removed</code>.
     */
    public void setRemoved(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.route.removed</code>.
     */
    public Short getRemoved() {
        return (Short) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Short, Short, String, Short, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Short, Short, String, Short, Short> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Route.ROUTE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return Route.ROUTE.BUS_STOP_LIST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Route.ROUTE.TRACK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Route.ROUTE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Route.ROUTE.DAY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Route.ROUTE.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getBusStopListId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getTrackId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getDayType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getBusStopListId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getTrackId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getDayType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value2(Short value) {
        setBusStopListId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value3(Short value) {
        setTrackId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value5(Short value) {
        setDayType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord value6(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteRecord values(Integer value1, Short value2, Short value3, String value4, Short value5, Short value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RouteRecord
     */
    public RouteRecord() {
        super(Route.ROUTE);
    }

    /**
     * Create a detached, initialised RouteRecord
     */
    public RouteRecord(Integer id, Short busStopListId, Short trackId, String name, Short dayType, Short removed) {
        super(Route.ROUTE);

        set(0, id);
        set(1, busStopListId);
        set(2, trackId);
        set(3, name);
        set(4, dayType);
        set(5, removed);
    }
}