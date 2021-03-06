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

import ru.smartsarov.bus.postgres.tables.RbBusModel;


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
public class RbBusModelRecord extends UpdatableRecordImpl<RbBusModelRecord> implements Record3<Short, String, Short> {

    private static final long serialVersionUID = -2094587049;

    /**
     * Setter for <code>public.rb_bus_model.id</code>.
     */
    public void setId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.rb_bus_model.id</code>.
     */
    public Short getId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>public.rb_bus_model.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.rb_bus_model.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.rb_bus_model.removed</code>.
     */
    public void setRemoved(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.rb_bus_model.removed</code>.
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
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Short, String, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Short, String, Short> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return RbBusModel.RB_BUS_MODEL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RbBusModel.RB_BUS_MODEL.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return RbBusModel.RB_BUS_MODEL.REMOVED;
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
    public String component2() {
        return getName();
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
    public Short value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
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
    public RbBusModelRecord value1(Short value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbBusModelRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbBusModelRecord value3(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbBusModelRecord values(Short value1, String value2, Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RbBusModelRecord
     */
    public RbBusModelRecord() {
        super(RbBusModel.RB_BUS_MODEL);
    }

    /**
     * Create a detached, initialised RbBusModelRecord
     */
    public RbBusModelRecord(Short id, String name, Short removed) {
        super(RbBusModel.RB_BUS_MODEL);

        set(0, id);
        set(1, name);
        set(2, removed);
    }
}
