/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.bus.postgres.tables.RbFuelType;


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
public class RbFuelTypeRecord extends UpdatableRecordImpl<RbFuelTypeRecord> implements Record3<Integer, String, Short> {

    private static final long serialVersionUID = -1017942161;

    /**
     * Setter for <code>public.rb_fuel_type.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.rb_fuel_type.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.rb_fuel_type.fuel_mark</code>.
     */
    public void setFuelMark(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.rb_fuel_type.fuel_mark</code>.
     */
    public String getFuelMark() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.rb_fuel_type.removed</code>.
     */
    public void setRemoved(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.rb_fuel_type.removed</code>.
     */
    public Short getRemoved() {
        return (Short) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, Short> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return RbFuelType.RB_FUEL_TYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RbFuelType.RB_FUEL_TYPE.FUEL_MARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return RbFuelType.RB_FUEL_TYPE.REMOVED;
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
    public String component2() {
        return getFuelMark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
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
    public String value2() {
        return getFuelMark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbFuelTypeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbFuelTypeRecord value2(String value) {
        setFuelMark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbFuelTypeRecord value3(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbFuelTypeRecord values(Integer value1, String value2, Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RbFuelTypeRecord
     */
    public RbFuelTypeRecord() {
        super(RbFuelType.RB_FUEL_TYPE);
    }

    /**
     * Create a detached, initialised RbFuelTypeRecord
     */
    public RbFuelTypeRecord(Integer id, String fuelMark, Short removed) {
        super(RbFuelType.RB_FUEL_TYPE);

        set(0, id);
        set(1, fuelMark);
        set(2, removed);
    }
}
