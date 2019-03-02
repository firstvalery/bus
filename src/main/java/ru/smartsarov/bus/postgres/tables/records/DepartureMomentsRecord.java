/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables.records;


import java.time.OffsetTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.bus.postgres.tables.DepartureMoments;


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
public class DepartureMomentsRecord extends UpdatableRecordImpl<DepartureMomentsRecord> implements Record5<Integer, Short, Short, OffsetTime, Short> {

    private static final long serialVersionUID = -147979796;

    /**
     * Setter for <code>public.departure_moments.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.departure_moments.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.departure_moments.departure_list_id</code>.
     */
    public void setDepartureListId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.departure_moments.departure_list_id</code>.
     */
    public Short getDepartureListId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.departure_moments.order</code>.
     */
    public void setOrder(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.departure_moments.order</code>.
     */
    public Short getOrder() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.departure_moments.start_time</code>.
     */
    public void setStartTime(OffsetTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.departure_moments.start_time</code>.
     */
    public OffsetTime getStartTime() {
        return (OffsetTime) get(3);
    }

    /**
     * Setter for <code>public.departure_moments.removed</code>.
     */
    public void setRemoved(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.departure_moments.removed</code>.
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
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Short, Short, OffsetTime, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Short, Short, OffsetTime, Short> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DepartureMoments.DEPARTURE_MOMENTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return DepartureMoments.DEPARTURE_MOMENTS.DEPARTURE_LIST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return DepartureMoments.DEPARTURE_MOMENTS.ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetTime> field4() {
        return DepartureMoments.DEPARTURE_MOMENTS.START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return DepartureMoments.DEPARTURE_MOMENTS.REMOVED;
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
        return getDepartureListId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetTime component4() {
        return getStartTime();
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
    public Integer value1() {
        return getId();
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
    public Short value3() {
        return getOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetTime value4() {
        return getStartTime();
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
    public DepartureMomentsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartureMomentsRecord value2(Short value) {
        setDepartureListId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartureMomentsRecord value3(Short value) {
        setOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartureMomentsRecord value4(OffsetTime value) {
        setStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartureMomentsRecord value5(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartureMomentsRecord values(Integer value1, Short value2, Short value3, OffsetTime value4, Short value5) {
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
     * Create a detached DepartureMomentsRecord
     */
    public DepartureMomentsRecord() {
        super(DepartureMoments.DEPARTURE_MOMENTS);
    }

    /**
     * Create a detached, initialised DepartureMomentsRecord
     */
    public DepartureMomentsRecord(Integer id, Short departureListId, Short order, OffsetTime startTime, Short removed) {
        super(DepartureMoments.DEPARTURE_MOMENTS);

        set(0, id);
        set(1, departureListId);
        set(2, order);
        set(3, startTime);
        set(4, removed);
    }
}
