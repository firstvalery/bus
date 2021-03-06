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

import ru.smartsarov.bus.postgres.tables.DepartureList;


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
public class DepartureListRecord extends UpdatableRecordImpl<DepartureListRecord> implements Record3<Short, String, Short> {

    private static final long serialVersionUID = 1975893719;

    /**
     * Setter for <code>public.departure_list.id</code>.
     */
    public void setId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.departure_list.id</code>.
     */
    public Short getId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>public.departure_list.description</code>.
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.departure_list.description</code>.
     */
    public String getDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.departure_list.removed</code>.
     */
    public void setRemoved(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.departure_list.removed</code>.
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
        return DepartureList.DEPARTURE_LIST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DepartureList.DEPARTURE_LIST.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return DepartureList.DEPARTURE_LIST.REMOVED;
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
        return getDescription();
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
        return getDescription();
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
    public DepartureListRecord value1(Short value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartureListRecord value2(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartureListRecord value3(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartureListRecord values(Short value1, String value2, Short value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DepartureListRecord
     */
    public DepartureListRecord() {
        super(DepartureList.DEPARTURE_LIST);
    }

    /**
     * Create a detached, initialised DepartureListRecord
     */
    public DepartureListRecord(Short id, String description, Short removed) {
        super(DepartureList.DEPARTURE_LIST);

        set(0, id);
        set(1, description);
        set(2, removed);
    }
}
