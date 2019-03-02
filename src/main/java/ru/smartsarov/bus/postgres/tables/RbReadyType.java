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
import ru.smartsarov.bus.postgres.tables.records.RbReadyTypeRecord;


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
public class RbReadyType extends TableImpl<RbReadyTypeRecord> {

    private static final long serialVersionUID = -2134910136;

    /**
     * The reference instance of <code>public.rb_ready_type</code>
     */
    public static final RbReadyType RB_READY_TYPE = new RbReadyType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RbReadyTypeRecord> getRecordType() {
        return RbReadyTypeRecord.class;
    }

    /**
     * The column <code>public.rb_ready_type.id</code>.
     */
    public final TableField<RbReadyTypeRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('rb_ready_type_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.rb_ready_type.ready_type_description</code>.
     */
    public final TableField<RbReadyTypeRecord, String> READY_TYPE_DESCRIPTION = createField("ready_type_description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.rb_ready_type.removed</code>.
     */
    public final TableField<RbReadyTypeRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.rb_ready_type</code> table reference
     */
    public RbReadyType() {
        this(DSL.name("rb_ready_type"), null);
    }

    /**
     * Create an aliased <code>public.rb_ready_type</code> table reference
     */
    public RbReadyType(String alias) {
        this(DSL.name(alias), RB_READY_TYPE);
    }

    /**
     * Create an aliased <code>public.rb_ready_type</code> table reference
     */
    public RbReadyType(Name alias) {
        this(alias, RB_READY_TYPE);
    }

    private RbReadyType(Name alias, Table<RbReadyTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private RbReadyType(Name alias, Table<RbReadyTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RbReadyType(Table<O> child, ForeignKey<O, RbReadyTypeRecord> key) {
        super(child, key, RB_READY_TYPE);
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
        return Arrays.<Index>asList(Indexes.PK_RB_READY_TYPE_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RbReadyTypeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RB_READY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RbReadyTypeRecord> getPrimaryKey() {
        return Keys.PK_RB_READY_TYPE_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RbReadyTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<RbReadyTypeRecord>>asList(Keys.PK_RB_READY_TYPE_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbReadyType as(String alias) {
        return new RbReadyType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbReadyType as(Name alias) {
        return new RbReadyType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RbReadyType rename(String name) {
        return new RbReadyType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RbReadyType rename(Name name) {
        return new RbReadyType(name, null);
    }
}
