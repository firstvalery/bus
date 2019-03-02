/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables.records;


import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Record2;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.bus.postgres.tables.BusSnapshot;


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
public class BusSnapshotRecord extends UpdatableRecordImpl<BusSnapshotRecord> implements Record11<Integer, Short, String, String, Short, Integer, Integer, Short, OffsetDateTime, OffsetDateTime, Short> {

    private static final long serialVersionUID = 2089374110;

    /**
     * Setter for <code>public.bus_snapshot.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.bus_snapshot.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.bus_snapshot.bus_id</code>.
     */
    public void setBusId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.bus_snapshot.bus_id</code>.
     */
    public Short getBusId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.bus_snapshot.garage_number_id</code>.
     */
    public void setGarageNumberId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.bus_snapshot.garage_number_id</code>.
     */
    public String getGarageNumberId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.bus_snapshot.state_number_id</code>.
     */
    public void setStateNumberId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.bus_snapshot.state_number_id</code>.
     */
    public String getStateNumberId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.bus_snapshot.fuel_code_id</code>.
     */
    public void setFuelCodeId(Short value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.bus_snapshot.fuel_code_id</code>.
     */
    public Short getFuelCodeId() {
        return (Short) get(4);
    }

    /**
     * Setter for <code>public.bus_snapshot.odometer_mileage</code>.
     */
    public void setOdometerMileage(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.bus_snapshot.odometer_mileage</code>.
     */
    public Integer getOdometerMileage() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.bus_snapshot.tracker_mileage</code>.
     */
    public void setTrackerMileage(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.bus_snapshot.tracker_mileage</code>.
     */
    public Integer getTrackerMileage() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.bus_snapshot.condition_id</code>.
     */
    public void setConditionId(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.bus_snapshot.condition_id</code>.
     */
    public Short getConditionId() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>public.bus_snapshot.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.bus_snapshot.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for <code>public.bus_snapshot.ended_at</code>.
     */
    public void setEndedAt(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.bus_snapshot.ended_at</code>.
     */
    public OffsetDateTime getEndedAt() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for <code>public.bus_snapshot.removed</code>.
     */
    public void setRemoved(Short value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.bus_snapshot.removed</code>.
     */
    public Short getRemoved() {
        return (Short) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Short, String, String, Short, Integer, Integer, Short, OffsetDateTime, OffsetDateTime, Short> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, Short, String, String, Short, Integer, Integer, Short, OffsetDateTime, OffsetDateTime, Short> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return BusSnapshot.BUS_SNAPSHOT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return BusSnapshot.BUS_SNAPSHOT.BUS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return BusSnapshot.BUS_SNAPSHOT.GARAGE_NUMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return BusSnapshot.BUS_SNAPSHOT.STATE_NUMBER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field5() {
        return BusSnapshot.BUS_SNAPSHOT.FUEL_CODE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return BusSnapshot.BUS_SNAPSHOT.ODOMETER_MILEAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return BusSnapshot.BUS_SNAPSHOT.TRACKER_MILEAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field8() {
        return BusSnapshot.BUS_SNAPSHOT.CONDITION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field9() {
        return BusSnapshot.BUS_SNAPSHOT.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field10() {
        return BusSnapshot.BUS_SNAPSHOT.ENDED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field11() {
        return BusSnapshot.BUS_SNAPSHOT.REMOVED;
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
        return getBusId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getGarageNumberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getStateNumberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component5() {
        return getFuelCodeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getOdometerMileage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getTrackerMileage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component8() {
        return getConditionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component9() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component10() {
        return getEndedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component11() {
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
        return getBusId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getGarageNumberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getStateNumberId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value5() {
        return getFuelCodeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getOdometerMileage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getTrackerMileage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value8() {
        return getConditionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value9() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value10() {
        return getEndedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value11() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusSnapshotRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusSnapshotRecord value2(Short value) {
        setBusId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusSnapshotRecord value3(String value) {
        setGarageNumberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusSnapshotRecord value4(String value) {
        setStateNumberId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusSnapshotRecord value5(Short value) {
        setFuelCodeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusSnapshotRecord value6(Integer value) {
        setOdometerMileage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusSnapshotRecord value7(Integer value) {
        setTrackerMileage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusSnapshotRecord value8(Short value) {
        setConditionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusSnapshotRecord value9(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusSnapshotRecord value10(OffsetDateTime value) {
        setEndedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusSnapshotRecord value11(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusSnapshotRecord values(Integer value1, Short value2, String value3, String value4, Short value5, Integer value6, Integer value7, Short value8, OffsetDateTime value9, OffsetDateTime value10, Short value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BusSnapshotRecord
     */
    public BusSnapshotRecord() {
        super(BusSnapshot.BUS_SNAPSHOT);
    }

    /**
     * Create a detached, initialised BusSnapshotRecord
     */
    public BusSnapshotRecord(Integer id, Short busId, String garageNumberId, String stateNumberId, Short fuelCodeId, Integer odometerMileage, Integer trackerMileage, Short conditionId, OffsetDateTime createdAt, OffsetDateTime endedAt, Short removed) {
        super(BusSnapshot.BUS_SNAPSHOT);

        set(0, id);
        set(1, busId);
        set(2, garageNumberId);
        set(3, stateNumberId);
        set(4, fuelCodeId);
        set(5, odometerMileage);
        set(6, trackerMileage);
        set(7, conditionId);
        set(8, createdAt);
        set(9, endedAt);
        set(10, removed);
    }
}
