/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables;


import java.time.OffsetDateTime;
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
import ru.smartsarov.bus.postgres.tables.records.RaceRecord;


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
public class Race extends TableImpl<RaceRecord> {

    private static final long serialVersionUID = -1739834587;

    /**
     * The reference instance of <code>public.race</code>
     */
    public static final Race RACE = new Race();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RaceRecord> getRecordType() {
        return RaceRecord.class;
    }

    /**
     * The column <code>public.race.id</code>.
     */
    public final TableField<RaceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('race_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.race.driver_id</code>.
     */
    public final TableField<RaceRecord, Short> DRIVER_ID = createField("driver_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.race.conductor_id</code>.
     */
    public final TableField<RaceRecord, Short> CONDUCTOR_ID = createField("conductor_id", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.race.bus_id</code>.
     */
    public final TableField<RaceRecord, Short> BUS_ID = createField("bus_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.race.ts_start</code>.
     */
    public final TableField<RaceRecord, OffsetDateTime> TS_START = createField("ts_start", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * The column <code>public.race.done</code>.
     */
    public final TableField<RaceRecord, Boolean> DONE = createField("done", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.race.incidend_id</code>.
     */
    public final TableField<RaceRecord, Short> INCIDEND_ID = createField("incidend_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.race.removed</code>.
     */
    public final TableField<RaceRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * Create a <code>public.race</code> table reference
     */
    public Race() {
        this(DSL.name("race"), null);
    }

    /**
     * Create an aliased <code>public.race</code> table reference
     */
    public Race(String alias) {
        this(DSL.name(alias), RACE);
    }

    /**
     * Create an aliased <code>public.race</code> table reference
     */
    public Race(Name alias) {
        this(alias, RACE);
    }

    private Race(Name alias, Table<RaceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Race(Name alias, Table<RaceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Race(Table<O> child, ForeignKey<O, RaceRecord> key) {
        super(child, key, RACE);
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
        return Arrays.<Index>asList(Indexes.PK_RACE_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RaceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RaceRecord> getPrimaryKey() {
        return Keys.PK_RACE_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RaceRecord>> getKeys() {
        return Arrays.<UniqueKey<RaceRecord>>asList(Keys.PK_RACE_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RaceRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RaceRecord, ?>>asList(Keys.RACE__FK_RACE_TBL_DRIVER_ID, Keys.RACE__FK_RACE_TBL_CONDUCTOR_ID, Keys.RACE__FK_RACE_TBL_BUS_ID, Keys.RACE__FK_RACE_TBL_INCIDENT_ID_FK);
    }

    public Driver driver() {
        return new Driver(this, Keys.RACE__FK_RACE_TBL_DRIVER_ID);
    }

    public Conductor conductor() {
        return new Conductor(this, Keys.RACE__FK_RACE_TBL_CONDUCTOR_ID);
    }

    public Bus bus() {
        return new Bus(this, Keys.RACE__FK_RACE_TBL_BUS_ID);
    }

    public Incident incident() {
        return new Incident(this, Keys.RACE__FK_RACE_TBL_INCIDENT_ID_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Race as(String alias) {
        return new Race(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Race as(Name alias) {
        return new Race(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Race rename(String name) {
        return new Race(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Race rename(Name name) {
        return new Race(name, null);
    }
}
