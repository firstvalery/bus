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

import ru.smartsarov.bus.postgres.tables.RbStateType;


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
public class RbStateTypeRecord extends UpdatableRecordImpl<RbStateTypeRecord> implements Record3<Integer, Short, Short> {

    private static final long serialVersionUID = -2060607989;

    /**
     * Setter for <code>public.rb_state_type.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.rb_state_type.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.rb_state_type.state_type_description</code>.
     */
    public void setStateTypeDescription(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.rb_state_type.state_type_description</code>.
     */
    public Short getStateTypeDescription() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.rb_state_type.removed</code>.
     */
    public void setRemoved(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.rb_state_type.removed</code>.
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
    public Row3<Integer, Short, Short> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Short, Short> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return RbStateType.RB_STATE_TYPE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return RbStateType.RB_STATE_TYPE.STATE_TYPE_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return RbStateType.RB_STATE_TYPE.REMOVED;
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
        return getStateTypeDescription();
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
    public Short value2() {
        return getStateTypeDescription();
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
    public RbStateTypeRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbStateTypeRecord value2(Short value) {
        setStateTypeDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbStateTypeRecord value3(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbStateTypeRecord values(Integer value1, Short value2, Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RbStateTypeRecord
     */
    public RbStateTypeRecord() {
        super(RbStateType.RB_STATE_TYPE);
    }

    /**
     * Create a detached, initialised RbStateTypeRecord
     */
    public RbStateTypeRecord(Integer id, Short stateTypeDescription, Short removed) {
        super(RbStateType.RB_STATE_TYPE);

        set(0, id);
        set(1, stateTypeDescription);
        set(2, removed);
    }
}
