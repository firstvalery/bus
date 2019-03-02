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
import ru.smartsarov.bus.postgres.tables.records.BusStopListRecord;


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
public class BusStopList extends TableImpl<BusStopListRecord> {

    private static final long serialVersionUID = -911824106;

    /**
     * The reference instance of <code>public.bus_stop_list</code>
     */
    public static final BusStopList BUS_STOP_LIST = new BusStopList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BusStopListRecord> getRecordType() {
        return BusStopListRecord.class;
    }

    /**
     * The column <code>public.bus_stop_list.id</code>.
     */
    public final TableField<BusStopListRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('bus_stop_list_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.bus_stop_list.name</code>.
     */
    public final TableField<BusStopListRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.bus_stop_list.removed</code>.
     */
    public final TableField<BusStopListRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.bus_stop_list</code> table reference
     */
    public BusStopList() {
        this(DSL.name("bus_stop_list"), null);
    }

    /**
     * Create an aliased <code>public.bus_stop_list</code> table reference
     */
    public BusStopList(String alias) {
        this(DSL.name(alias), BUS_STOP_LIST);
    }

    /**
     * Create an aliased <code>public.bus_stop_list</code> table reference
     */
    public BusStopList(Name alias) {
        this(alias, BUS_STOP_LIST);
    }

    private BusStopList(Name alias, Table<BusStopListRecord> aliased) {
        this(alias, aliased, null);
    }

    private BusStopList(Name alias, Table<BusStopListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BusStopList(Table<O> child, ForeignKey<O, BusStopListRecord> key) {
        super(child, key, BUS_STOP_LIST);
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
        return Arrays.<Index>asList(Indexes.PK_BUS_STOP_LIST_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BusStopListRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BUS_STOP_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BusStopListRecord> getPrimaryKey() {
        return Keys.PK_BUS_STOP_LIST_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BusStopListRecord>> getKeys() {
        return Arrays.<UniqueKey<BusStopListRecord>>asList(Keys.PK_BUS_STOP_LIST_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusStopList as(String alias) {
        return new BusStopList(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BusStopList as(Name alias) {
        return new BusStopList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BusStopList rename(String name) {
        return new BusStopList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BusStopList rename(Name name) {
        return new BusStopList(name, null);
    }
}