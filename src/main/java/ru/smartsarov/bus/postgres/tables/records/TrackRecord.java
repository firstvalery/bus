/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.bus.postgres.tables.Track;


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
public class TrackRecord extends UpdatableRecordImpl<TrackRecord> implements Record4<Integer, Float, Float, Short> {

    private static final long serialVersionUID = 239036675;

    /**
     * Setter for <code>public.track.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.track.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.track.lengh</code>.
     */
    public void setLengh(Float value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.track.lengh</code>.
     */
    public Float getLengh() {
        return (Float) get(1);
    }

    /**
     * Setter for <code>public.track.duration</code>.
     */
    public void setDuration(Float value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.track.duration</code>.
     */
    public Float getDuration() {
        return (Float) get(2);
    }

    /**
     * Setter for <code>public.track.removed</code>.
     */
    public void setRemoved(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.track.removed</code>.
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
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Float, Float, Short> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Float, Float, Short> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Track.TRACK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Float> field2() {
        return Track.TRACK.LENGH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Float> field3() {
        return Track.TRACK.DURATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return Track.TRACK.REMOVED;
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
    public Float component2() {
        return getLengh();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float component3() {
        return getDuration();
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
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float value2() {
        return getLengh();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Float value3() {
        return getDuration();
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
    public TrackRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackRecord value2(Float value) {
        setLengh(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackRecord value3(Float value) {
        setDuration(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackRecord value4(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackRecord values(Integer value1, Float value2, Float value3, Short value4) {
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
     * Create a detached TrackRecord
     */
    public TrackRecord() {
        super(Track.TRACK);
    }

    /**
     * Create a detached, initialised TrackRecord
     */
    public TrackRecord(Integer id, Float lengh, Float duration, Short removed) {
        super(Track.TRACK);

        set(0, id);
        set(1, lengh);
        set(2, duration);
        set(3, removed);
    }
}
