/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.bus.postgres.tables.ShiftFixed;


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
public class ShiftFixedRecord extends UpdatableRecordImpl<ShiftFixedRecord> implements Record5<Integer, Date, Integer, Integer, Short> {

    private static final long serialVersionUID = -1601702950;

    /**
     * Setter for <code>public.shift_fixed.shift_schedule_id</code>.
     */
    public void setShiftScheduleId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.shift_fixed.shift_schedule_id</code>.
     */
    public Integer getShiftScheduleId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.shift_fixed.date</code>.
     */
    public void setDate(Date value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.shift_fixed.date</code>.
     */
    public Date getDate() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>public.shift_fixed.driver_id</code>.
     */
    public void setDriverId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.shift_fixed.driver_id</code>.
     */
    public Integer getDriverId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.shift_fixed.conductor_id</code>.
     */
    public void setConductorId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.shift_fixed.conductor_id</code>.
     */
    public Integer getConductorId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.shift_fixed.removed</code>.
     */
    public void setRemoved(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.shift_fixed.removed</code>.
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
    public Record2<Integer, Date> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Date, Integer, Integer, Short> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Date, Integer, Integer, Short> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ShiftFixed.SHIFT_FIXED.SHIFT_SCHEDULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field2() {
        return ShiftFixed.SHIFT_FIXED.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ShiftFixed.SHIFT_FIXED.DRIVER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ShiftFixed.SHIFT_FIXED.CONDUCTOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return ShiftFixed.SHIFT_FIXED.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getShiftScheduleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component2() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getDriverId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getConductorId();
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
        return getShiftScheduleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value2() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getDriverId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getConductorId();
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
    public ShiftFixedRecord value1(Integer value) {
        setShiftScheduleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShiftFixedRecord value2(Date value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShiftFixedRecord value3(Integer value) {
        setDriverId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShiftFixedRecord value4(Integer value) {
        setConductorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShiftFixedRecord value5(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShiftFixedRecord values(Integer value1, Date value2, Integer value3, Integer value4, Short value5) {
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
     * Create a detached ShiftFixedRecord
     */
    public ShiftFixedRecord() {
        super(ShiftFixed.SHIFT_FIXED);
    }

    /**
     * Create a detached, initialised ShiftFixedRecord
     */
    public ShiftFixedRecord(Integer shiftScheduleId, Date date, Integer driverId, Integer conductorId, Short removed) {
        super(ShiftFixed.SHIFT_FIXED);

        set(0, shiftScheduleId);
        set(1, date);
        set(2, driverId);
        set(3, conductorId);
        set(4, removed);
    }
}
