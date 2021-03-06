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
import ru.smartsarov.bus.postgres.tables.records.RouteRecord;


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
public class Route extends TableImpl<RouteRecord> {

    private static final long serialVersionUID = 1080742826;

    /**
     * The reference instance of <code>public.route</code>
     */
    public static final Route ROUTE = new Route();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RouteRecord> getRecordType() {
        return RouteRecord.class;
    }

    /**
     * The column <code>public.route.id</code>.
     */
    public final TableField<RouteRecord, Short> ID = createField("id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('route_id_seq'::regclass)", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>public.route.bus_stop_list_id</code>.
     */
    public final TableField<RouteRecord, Short> BUS_STOP_LIST_ID = createField("bus_stop_list_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.route.track_id</code>.
     */
    public final TableField<RouteRecord, Short> TRACK_ID = createField("track_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.route.name</code>.
     */
    public final TableField<RouteRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.route.day_type</code>.
     */
    public final TableField<RouteRecord, Short> DAY_TYPE = createField("day_type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.route.removed</code>.
     */
    public final TableField<RouteRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.route</code> table reference
     */
    public Route() {
        this(DSL.name("route"), null);
    }

    /**
     * Create an aliased <code>public.route</code> table reference
     */
    public Route(String alias) {
        this(DSL.name(alias), ROUTE);
    }

    /**
     * Create an aliased <code>public.route</code> table reference
     */
    public Route(Name alias) {
        this(alias, ROUTE);
    }

    private Route(Name alias, Table<RouteRecord> aliased) {
        this(alias, aliased, null);
    }

    private Route(Name alias, Table<RouteRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Route(Table<O> child, ForeignKey<O, RouteRecord> key) {
        super(child, key, ROUTE);
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
        return Arrays.<Index>asList(Indexes.PK_ROUTE_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RouteRecord, Short> getIdentity() {
        return Keys.IDENTITY_ROUTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RouteRecord> getPrimaryKey() {
        return Keys.PK_ROUTE_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RouteRecord>> getKeys() {
        return Arrays.<UniqueKey<RouteRecord>>asList(Keys.PK_ROUTE_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RouteRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RouteRecord, ?>>asList(Keys.ROUTE__FK_ROUTE_TBL_BUS_STOP_LIST_ID, Keys.ROUTE__FK_ROUTE_TRACK_TBL_ID);
    }

    public BusStopList busStopList() {
        return new BusStopList(this, Keys.ROUTE__FK_ROUTE_TBL_BUS_STOP_LIST_ID);
    }

    public Track track() {
        return new Track(this, Keys.ROUTE__FK_ROUTE_TRACK_TBL_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Route as(String alias) {
        return new Route(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Route as(Name alias) {
        return new Route(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Route rename(String name) {
        return new Route(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Route rename(Name name) {
        return new Route(name, null);
    }
}
