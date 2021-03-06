/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables.records;


import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.bus.postgres.tables.RouteScheduleSnapshot;


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
public class RouteScheduleSnapshotRecord extends UpdatableRecordImpl<RouteScheduleSnapshotRecord> implements Record5<Short, Short, OffsetDateTime, OffsetDateTime, Short> {

    private static final long serialVersionUID = -1475243969;

    /**
     * Setter for <code>public.route_schedule_snapshot.route_id</code>.
     */
    public void setRouteId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.route_schedule_snapshot.route_id</code>.
     */
    public Short getRouteId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>public.route_schedule_snapshot.departure_list_id</code>.
     */
    public void setDepartureListId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.route_schedule_snapshot.departure_list_id</code>.
     */
    public Short getDepartureListId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.route_schedule_snapshot.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.route_schedule_snapshot.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>public.route_schedule_snapshot.ended_at</code>.
     */
    public void setEndedAt(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.route_schedule_snapshot.ended_at</code>.
     */
    public OffsetDateTime getEndedAt() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for <code>public.route_schedule_snapshot.removed</code>.
     */
    public void setRemoved(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.route_schedule_snapshot.removed</code>.
     */
    public Short getRemoved() {
        return (Short) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Short, Short, OffsetDateTime, OffsetDateTime, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Short, Short, OffsetDateTime, OffsetDateTime, Short> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return RouteScheduleSnapshot.ROUTE_SCHEDULE_SNAPSHOT.ROUTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return RouteScheduleSnapshot.ROUTE_SCHEDULE_SNAPSHOT.DEPARTURE_LIST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field3() {
        return RouteScheduleSnapshot.ROUTE_SCHEDULE_SNAPSHOT.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field4() {
        return RouteScheduleSnapshot.ROUTE_SCHEDULE_SNAPSHOT.ENDED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return RouteScheduleSnapshot.ROUTE_SCHEDULE_SNAPSHOT.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component1() {
        return getRouteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getDepartureListId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component3() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component4() {
        return getEndedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getRouteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getDepartureListId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value3() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value4() {
        return getEndedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteScheduleSnapshotRecord value1(Short value) {
        setRouteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteScheduleSnapshotRecord value2(Short value) {
        setDepartureListId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteScheduleSnapshotRecord value3(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteScheduleSnapshotRecord value4(OffsetDateTime value) {
        setEndedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteScheduleSnapshotRecord value5(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteScheduleSnapshotRecord values(Short value1, Short value2, OffsetDateTime value3, OffsetDateTime value4, Short value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RouteScheduleSnapshotRecord
     */
    public RouteScheduleSnapshotRecord() {
        super(RouteScheduleSnapshot.ROUTE_SCHEDULE_SNAPSHOT);
    }

    /**
     * Create a detached, initialised RouteScheduleSnapshotRecord
     */
    public RouteScheduleSnapshotRecord(Short routeId, Short departureListId, OffsetDateTime createdAt, OffsetDateTime endedAt, Short removed) {
        super(RouteScheduleSnapshot.ROUTE_SCHEDULE_SNAPSHOT);

        set(0, routeId);
        set(1, departureListId);
        set(2, createdAt);
        set(3, endedAt);
        set(4, removed);
    }
}
