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

import ru.smartsarov.bus.postgres.tables.FuelCode;


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
public class FuelCodeRecord extends UpdatableRecordImpl<FuelCodeRecord> implements Record6<Short, Short, Float, Float, Float, Short> {

    private static final long serialVersionUID = -851784304;

    /**
     * Setter for <code>public.fuel_code.id</code>.
     */
    public void setId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.fuel_code.id</code>.
     */
    public Short getId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>public.fuel_code.fuel_type_id</code>.
     */
    public void setFuelTypeId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.fuel_code.fuel_type_id</code>.
     */
    public Short getFuelTypeId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.fuel_code.winter_consumption</code>.
     */
    public void setWinterConsumption(Float value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.fuel_code.winter_consumption</code>.
     */
    public Float getWinterConsumption() {
        return (Float) get(2);
    }

    /**
     * Setter for <code>public.fuel_code.summer_consumption</code>.
     */
    public void setSummerConsumption(Float value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.fuel_code.summer_consumption</code>.
     */
    public Float getSummerConsumption() {
        return (Float) get(3);
    }

    /**
     * Setter for <code>public.fuel_code.heating_addition</code>.
     */
    public void setHeatingAddition(Float value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.fuel_code.heating_addition</code>.
     */
    public Float getHeatingAddition() {
        return (Float) get(4);
    }

    /**
     * Setter for <code>public.fuel_code.removed</code>.
     */
    public void setRemoved(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.fuel_code.removed</code>.
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
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Short, Short, Float, Float, Float, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Short, Short, Float, Float, Float, Short> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return FuelCode.FUEL_CODE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return FuelCode.FUEL_CODE.FUEL_TYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Float> field3() {
        return FuelCode.FUEL_CODE.WINTER_CONSUMPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Float> field4() {
        return FuelCode.FUEL_CODE.SUMMER_CONSUMPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Float> field5() {
        return FuelCode.FUEL_CODE.HEATING_ADDITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return FuelCode.FUEL_CODE.REMOVED;
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
        return getFuelTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float component3() {
        return getWinterConsumption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float component4() {
        return getSummerConsumption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float component5() {
        return getHeatingAddition();
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
    public Short value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getFuelTypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float value3() {
        return getWinterConsumption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float value4() {
        return getSummerConsumption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float value5() {
        return getHeatingAddition();
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
    public FuelCodeRecord value1(Short value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FuelCodeRecord value2(Short value) {
        setFuelTypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FuelCodeRecord value3(Float value) {
        setWinterConsumption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FuelCodeRecord value4(Float value) {
        setSummerConsumption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FuelCodeRecord value5(Float value) {
        setHeatingAddition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FuelCodeRecord value6(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FuelCodeRecord values(Short value1, Short value2, Float value3, Float value4, Float value5, Short value6) {
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
     * Create a detached FuelCodeRecord
     */
    public FuelCodeRecord() {
        super(FuelCode.FUEL_CODE);
    }

    /**
     * Create a detached, initialised FuelCodeRecord
     */
    public FuelCodeRecord(Short id, Short fuelTypeId, Float winterConsumption, Float summerConsumption, Float heatingAddition, Short removed) {
        super(FuelCode.FUEL_CODE);

        set(0, id);
        set(1, fuelTypeId);
        set(2, winterConsumption);
        set(3, summerConsumption);
        set(4, heatingAddition);
        set(5, removed);
    }
}
