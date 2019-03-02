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

import ru.smartsarov.bus.postgres.tables.Conductor;


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
public class ConductorRecord extends UpdatableRecordImpl<ConductorRecord> implements Record6<Integer, Short, Short, Short, Short, Short> {

    private static final long serialVersionUID = 1421182023;

    /**
     * Setter for <code>public.conductor.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.conductor.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.conductor.employee_data_id</code>.
     */
    public void setEmployeeDataId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.conductor.employee_data_id</code>.
     */
    public Short getEmployeeDataId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.conductor.schedule_type</code>.
     */
    public void setScheduleType(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.conductor.schedule_type</code>.
     */
    public Short getScheduleType() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.conductor.ready_type_id</code>.
     */
    public void setReadyTypeId(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.conductor.ready_type_id</code>.
     */
    public Short getReadyTypeId() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>public.conductor.state_id</code>.
     */
    public void setStateId(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.conductor.state_id</code>.
     */
    public Short getStateId() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>public.conductor.removed</code>.
     */
    public void setRemoved(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.conductor.removed</code>.
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
    public Row6<Integer, Short, Short, Short, Short, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Short, Short, Short, Short, Short> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Conductor.CONDUCTOR.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return Conductor.CONDUCTOR.EMPLOYEE_DATA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Conductor.CONDUCTOR.SCHEDULE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return Conductor.CONDUCTOR.READY_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return Conductor.CONDUCTOR.STATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Conductor.CONDUCTOR.REMOVED;
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
        return getEmployeeDataId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getScheduleType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getReadyTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getStateId();
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
        return getEmployeeDataId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getScheduleType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getReadyTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getStateId();
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
    public ConductorRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorRecord value2(Short value) {
        setEmployeeDataId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorRecord value3(Short value) {
        setScheduleType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorRecord value4(Short value) {
        setReadyTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorRecord value5(Short value) {
        setStateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorRecord value6(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorRecord values(Integer value1, Short value2, Short value3, Short value4, Short value5, Short value6) {
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
     * Create a detached ConductorRecord
     */
    public ConductorRecord() {
        super(Conductor.CONDUCTOR);
    }

    /**
     * Create a detached, initialised ConductorRecord
     */
    public ConductorRecord(Integer id, Short employeeDataId, Short scheduleType, Short readyTypeId, Short stateId, Short removed) {
        super(Conductor.CONDUCTOR);

        set(0, id);
        set(1, employeeDataId);
        set(2, scheduleType);
        set(3, readyTypeId);
        set(4, stateId);
        set(5, removed);
    }
}