/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.bus.postgres.tables.TrackCoordinates;


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
public class TrackCoordinatesRecord extends UpdatableRecordImpl<TrackCoordinatesRecord> implements Record6<Integer, Short, Short, BigDecimal, BigDecimal, Short> {

    private static final long serialVersionUID = -68482139;

    /**
     * Setter for <code>public.track_coordinates.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.track_coordinates.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.track_coordinates.track_id</code>.
     */
    public void setTrackId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.track_coordinates.track_id</code>.
     */
    public Short getTrackId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.track_coordinates.order</code>.
     */
    public void setOrder(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.track_coordinates.order</code>.
     */
    public Short getOrder() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>public.track_coordinates.lon</code>.
     */
    public void setLon(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.track_coordinates.lon</code>.
     */
    public BigDecimal getLon() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.track_coordinates.lat</code>.
     */
    public void setLat(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.track_coordinates.lat</code>.
     */
    public BigDecimal getLat() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.track_coordinates.removed</code>.
     */
    public void setRemoved(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.track_coordinates.removed</code>.
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
    public Row6<Integer, Short, Short, BigDecimal, BigDecimal, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Short, Short, BigDecimal, BigDecimal, Short> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TrackCoordinates.TRACK_COORDINATES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return TrackCoordinates.TRACK_COORDINATES.TRACK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TrackCoordinates.TRACK_COORDINATES.ORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TrackCoordinates.TRACK_COORDINATES.LON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return TrackCoordinates.TRACK_COORDINATES.LAT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return TrackCoordinates.TRACK_COORDINATES.REMOVED;
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
        return getTrackId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getLon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getLat();
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
        return getTrackId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getOrder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getLon();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getLat();
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
    public TrackCoordinatesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackCoordinatesRecord value2(Short value) {
        setTrackId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackCoordinatesRecord value3(Short value) {
        setOrder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackCoordinatesRecord value4(BigDecimal value) {
        setLon(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackCoordinatesRecord value5(BigDecimal value) {
        setLat(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackCoordinatesRecord value6(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TrackCoordinatesRecord values(Integer value1, Short value2, Short value3, BigDecimal value4, BigDecimal value5, Short value6) {
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
     * Create a detached TrackCoordinatesRecord
     */
    public TrackCoordinatesRecord() {
        super(TrackCoordinates.TRACK_COORDINATES);
    }

    /**
     * Create a detached, initialised TrackCoordinatesRecord
     */
    public TrackCoordinatesRecord(Integer id, Short trackId, Short order, BigDecimal lon, BigDecimal lat, Short removed) {
        super(TrackCoordinates.TRACK_COORDINATES);

        set(0, id);
        set(1, trackId);
        set(2, order);
        set(3, lon);
        set(4, lat);
        set(5, removed);
    }
}
