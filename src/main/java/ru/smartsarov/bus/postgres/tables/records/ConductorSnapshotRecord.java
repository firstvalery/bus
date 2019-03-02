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

import ru.smartsarov.bus.postgres.tables.ConductorSnapshot;


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
public class ConductorSnapshotRecord extends UpdatableRecordImpl<ConductorSnapshotRecord> implements Record8<Integer, Short, Short, Short, Short, OffsetDateTime, OffsetDateTime, Short> {

    private static final long serialVersionUID = 2021297313;

    /**
     * Setter for <code>public.conductor_snapshot.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.conductor_snapshot.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.conductor_snapshot.employee_data_id</code>.
     */
    public void setEmployeeDataId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.conductor_snapshot.employee_data_id</code>.
     */
    public Short getEmployeeDataId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.conductor_snapshot.schedule_type</code>.
     */
    public void setScheduleType(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.conductor_snapshot.schedule_type</code>.
     */
    public Short getScheduleType() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.conductor_snapshot.ready_type_id</code>.
     */
    public void setReadyTypeId(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.conductor_snapshot.ready_type_id</code>.
     */
    public Short getReadyTypeId() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>public.conductor_snapshot.state_id</code>.
     */
    public void setStateId(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.conductor_snapshot.state_id</code>.
     */
    public Short getStateId() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>public.conductor_snapshot.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.conductor_snapshot.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>public.conductor_snapshot.ended_at</code>.
     */
    public void setEndedAt(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.conductor_snapshot.ended_at</code>.
     */
    public OffsetDateTime getEndedAt() {
        return (OffsetDateTime) get(6);
    }

    /**
     * Setter for <code>public.conductor_snapshot.removed</code>.
     */
    public void setRemoved(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.conductor_snapshot.removed</code>.
     */
    public Short getRemoved() {
        return (Short) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, OffsetDateTime> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Short, Short, Short, Short, OffsetDateTime, OffsetDateTime, Short> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Short, Short, Short, Short, OffsetDateTime, OffsetDateTime, Short> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ConductorSnapshot.CONDUCTOR_SNAPSHOT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return ConductorSnapshot.CONDUCTOR_SNAPSHOT.EMPLOYEE_DATA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return ConductorSnapshot.CONDUCTOR_SNAPSHOT.SCHEDULE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return ConductorSnapshot.CONDUCTOR_SNAPSHOT.READY_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return ConductorSnapshot.CONDUCTOR_SNAPSHOT.STATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field6() {
        return ConductorSnapshot.CONDUCTOR_SNAPSHOT.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field7() {
        return ConductorSnapshot.CONDUCTOR_SNAPSHOT.ENDED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field8() {
        return ConductorSnapshot.CONDUCTOR_SNAPSHOT.REMOVED;
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
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorSnapshotRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorSnapshotRecord value2(Short value) {
        setEmployeeDataId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorSnapshotRecord value3(Short value) {
        setScheduleType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorSnapshotRecord value4(Short value) {
        setReadyTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorSnapshotRecord value5(Short value) {
        setStateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorSnapshotRecord value6(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorSnapshotRecord value7(OffsetDateTime value) {
        setEndedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorSnapshotRecord value8(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorSnapshotRecord values(Integer value1, Short value2, Short value3, Short value4, Short value5, OffsetDateTime value6, OffsetDateTime value7, Short value8) {
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
     * Create a detached ConductorSnapshotRecord
     */
    public ConductorSnapshotRecord() {
        super(ConductorSnapshot.CONDUCTOR_SNAPSHOT);
    }

    /**
     * Create a detached, initialised ConductorSnapshotRecord
     */
    public ConductorSnapshotRecord(Integer id, Short employeeDataId, Short scheduleType, Short readyTypeId, Short stateId, OffsetDateTime createdAt, OffsetDateTime endedAt, Short removed) {
        super(ConductorSnapshot.CONDUCTOR_SNAPSHOT);

        set(0, id);
        set(1, employeeDataId);
        set(2, scheduleType);
        set(3, readyTypeId);
        set(4, stateId);
        set(5, createdAt);
        set(6, endedAt);
        set(7, removed);
    }
}
