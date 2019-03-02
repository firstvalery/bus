/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables.records;


import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.bus.postgres.tables.RouteSnapshot;


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
public class RouteSnapshotRecord extends UpdatableRecordImpl<RouteSnapshotRecord> implements Record8<Short, Short, Short, String, Short, OffsetDateTime, OffsetDateTime, Short> {

    private static final long serialVersionUID = -1932253184;

    /**
     * Setter for <code>public.route_snapshot.id</code>.
     */
    public void setId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.route_snapshot.id</code>.
     */
    public Short getId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>public.route_snapshot.bus_stop_list_id</code>.
     */
    public void setBusStopListId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.route_snapshot.bus_stop_list_id</code>.
     */
    public Short getBusStopListId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.route_snapshot.track_id</code>.
     */
    public void setTrackId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.route_snapshot.track_id</code>.
     */
    public Short getTrackId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.route_snapshot.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.route_snapshot.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.route_snapshot.day_type</code>.
     */
    public void setDayType(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.route_snapshot.day_type</code>.
     */
    public Short getDayType() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>public.route_snapshot.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.route_snapshot.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>public.route_snapshot.ended_at</code>.
     */
    public void setEndedAt(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.route_snapshot.ended_at</code>.
     */
    public OffsetDateTime getEndedAt() {
        return (OffsetDateTime) get(6);
    }

    /**
     * Setter for <code>public.route_snapshot.0</code>.
     */
    public void set_0(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.route_snapshot.0</code>.
     */
    public Short get_0() {
        return (Short) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Short, OffsetDateTime> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Short, Short, Short, String, Short, OffsetDateTime, OffsetDateTime, Short> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Short, Short, Short, String, Short, OffsetDateTime, OffsetDateTime, Short> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return RouteSnapshot.ROUTE_SNAPSHOT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return RouteSnapshot.ROUTE_SNAPSHOT.BUS_STOP_LIST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return RouteSnapshot.ROUTE_SNAPSHOT.TRACK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return RouteSnapshot.ROUTE_SNAPSHOT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return RouteSnapshot.ROUTE_SNAPSHOT.DAY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field6() {
        return RouteSnapshot.ROUTE_SNAPSHOT.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field7() {
        return RouteSnapshot.ROUTE_SNAPSHOT.ENDED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field8() {
        return RouteSnapshot.ROUTE_SNAPSHOT._0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component1() {
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
    public OffsetDateTime component6() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component7() {
        return getEndedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component8() {
        return get_0();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
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
    public OffsetDateTime value6() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value7() {
        return getEndedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value8() {
        return get_0();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteSnapshotRecord value1(Short value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteSnapshotRecord value2(Short value) {
        setBusStopListId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteSnapshotRecord value3(Short value) {
        setTrackId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteSnapshotRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteSnapshotRecord value5(Short value) {
        setDayType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteSnapshotRecord value6(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteSnapshotRecord value7(OffsetDateTime value) {
        setEndedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteSnapshotRecord value8(Short value) {
        set_0(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteSnapshotRecord values(Short value1, Short value2, Short value3, String value4, Short value5, OffsetDateTime value6, OffsetDateTime value7, Short value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RouteSnapshotRecord
     */
    public RouteSnapshotRecord() {
        super(RouteSnapshot.ROUTE_SNAPSHOT);
    }

    /**
     * Create a detached, initialised RouteSnapshotRecord
     */
    public RouteSnapshotRecord(Short id, Short busStopListId, Short trackId, String name, Short dayType, OffsetDateTime createdAt, OffsetDateTime endedAt, Short _0) {
        super(RouteSnapshot.ROUTE_SNAPSHOT);

        set(0, id);
        set(1, busStopListId);
        set(2, trackId);
        set(3, name);
        set(4, dayType);
        set(5, createdAt);
        set(6, endedAt);
        set(7, _0);
    }
}
