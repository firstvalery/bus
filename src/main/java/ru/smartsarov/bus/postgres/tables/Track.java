/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.smartsarov.bus.postgres.Indexes;
import ru.smartsarov.bus.postgres.Keys;
import ru.smartsarov.bus.postgres.Public;
import ru.smartsarov.bus.postgres.tables.records.TrackRecord;


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
public class Track extends TableImpl<TrackRecord> {

    private static final long serialVersionUID = -35216716;

    /**
     * The reference instance of <code>public.track</code>
     */
    public static final Track TRACK = new Track();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrackRecord> getRecordType() {
        return TrackRecord.class;
    }

    /**
     * The column <code>public.track.id</code>.
     */
    public final TableField<TrackRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('track_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.track.lengh</code>.
     */
    public final TableField<TrackRecord, Float> LENGH = createField("lengh", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>public.track.duration</code>.
     */
    public final TableField<TrackRecord, Float> DURATION = createField("duration", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>public.track.removed</code>.
     */
    public final TableField<TrackRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.track</code> table reference
     */
    public Track() {
        this(DSL.name("track"), null);
    }

    /**
     * Create an aliased <code>public.track</code> table reference
     */
    public Track(String alias) {
        this(DSL.name(alias), TRACK);
    }

    /**
     * Create an aliased <code>public.track</code> table reference
     */
    public Track(Name alias) {
        this(alias, TRACK);
    }

    private Track(Name alias, Table<TrackRecord> aliased) {
        this(alias, aliased, null);
    }

    private Track(Name alias, Table<TrackRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Track(Table<O> child, ForeignKey<O, TrackRecord> key) {
        super(child, key, TRACK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PK_TRACK_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TrackRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TRACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TrackRecord> getPrimaryKey() {
        return Keys.PK_TRACK_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TrackRecord>> getKeys() {
        return Arrays.<UniqueKey<TrackRecord>>asList(Keys.PK_TRACK_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Track as(String alias) {
        return new Track(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Track as(Name alias) {
        return new Track(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Track rename(String name) {
        return new Track(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Track rename(Name name) {
        return new Track(name, null);
    }
}
