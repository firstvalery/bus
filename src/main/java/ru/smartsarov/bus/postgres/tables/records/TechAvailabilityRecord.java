/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.bus.postgres.tables.TechAvailability;


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
public class TechAvailabilityRecord extends UpdatableRecordImpl<TechAvailabilityRecord> implements Record4<Short, Date, Short, Short> {

    private static final long serialVersionUID = -1797851543;

    /**
     * Setter for <code>public.tech_availability.bus_id</code>.
     */
    public void setBusId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.tech_availability.bus_id</code>.
     */
    public Short getBusId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>public.tech_availability.date</code>.
     */
    public void setDate(Date value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.tech_availability.date</code>.
     */
    public Date getDate() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>public.tech_availability.bus_condition_id</code>.
     */
    public void setBusConditionId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.tech_availability.bus_condition_id</code>.
     */
    public Short getBusConditionId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.tech_availability.removed</code>.
     */
    public void setRemoved(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.tech_availability.removed</code>.
     */
    public Short getRemoved() {
        return (Short) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Short, Date> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, Date, Short, Short> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Short, Date, Short, Short> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return TechAvailability.TECH_AVAILABILITY.BUS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field2() {
        return TechAvailability.TECH_AVAILABILITY.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TechAvailability.TECH_AVAILABILITY.BUS_CONDITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return TechAvailability.TECH_AVAILABILITY.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component1() {
        return getBusId();
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
    public Short component3() {
        return getBusConditionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getBusId();
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
    public Short value3() {
        return getBusConditionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TechAvailabilityRecord value1(Short value) {
        setBusId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TechAvailabilityRecord value2(Date value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TechAvailabilityRecord value3(Short value) {
        setBusConditionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TechAvailabilityRecord value4(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TechAvailabilityRecord values(Short value1, Date value2, Short value3, Short value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TechAvailabilityRecord
     */
    public TechAvailabilityRecord() {
        super(TechAvailability.TECH_AVAILABILITY);
    }

    /**
     * Create a detached, initialised TechAvailabilityRecord
     */
    public TechAvailabilityRecord(Short busId, Date date, Short busConditionId, Short removed) {
        super(TechAvailability.TECH_AVAILABILITY);

        set(0, busId);
        set(1, date);
        set(2, busConditionId);
        set(3, removed);
    }
}
