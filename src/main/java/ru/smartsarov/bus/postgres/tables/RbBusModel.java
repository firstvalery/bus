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
import ru.smartsarov.bus.postgres.tables.records.RbBusModelRecord;


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
public class RbBusModel extends TableImpl<RbBusModelRecord> {

    private static final long serialVersionUID = -1811171672;

    /**
     * The reference instance of <code>public.rb_bus_model</code>
     */
    public static final RbBusModel RB_BUS_MODEL = new RbBusModel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RbBusModelRecord> getRecordType() {
        return RbBusModelRecord.class;
    }

    /**
     * The column <code>public.rb_bus_model.id</code>.
     */
    public final TableField<RbBusModelRecord, Short> ID = createField("id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('rb_bus_model_id_seq'::regclass)", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>public.rb_bus_model.name</code>.
     */
    public final TableField<RbBusModelRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.rb_bus_model.removed</code>.
     */
    public final TableField<RbBusModelRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.rb_bus_model</code> table reference
     */
    public RbBusModel() {
        this(DSL.name("rb_bus_model"), null);
    }

    /**
     * Create an aliased <code>public.rb_bus_model</code> table reference
     */
    public RbBusModel(String alias) {
        this(DSL.name(alias), RB_BUS_MODEL);
    }

    /**
     * Create an aliased <code>public.rb_bus_model</code> table reference
     */
    public RbBusModel(Name alias) {
        this(alias, RB_BUS_MODEL);
    }

    private RbBusModel(Name alias, Table<RbBusModelRecord> aliased) {
        this(alias, aliased, null);
    }

    private RbBusModel(Name alias, Table<RbBusModelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RbBusModel(Table<O> child, ForeignKey<O, RbBusModelRecord> key) {
        super(child, key, RB_BUS_MODEL);
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
        return Arrays.<Index>asList(Indexes.PK_RB_BUS_MODEL_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RbBusModelRecord, Short> getIdentity() {
        return Keys.IDENTITY_RB_BUS_MODEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RbBusModelRecord> getPrimaryKey() {
        return Keys.PK_RB_BUS_MODEL_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RbBusModelRecord>> getKeys() {
        return Arrays.<UniqueKey<RbBusModelRecord>>asList(Keys.PK_RB_BUS_MODEL_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbBusModel as(String alias) {
        return new RbBusModel(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbBusModel as(Name alias) {
        return new RbBusModel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RbBusModel rename(String name) {
        return new RbBusModel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RbBusModel rename(Name name) {
        return new RbBusModel(name, null);
    }
}
