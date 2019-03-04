/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
import ru.smartsarov.bus.postgres.tables.records.RbShiftTypeRecord;


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
public class RbShiftType extends TableImpl<RbShiftTypeRecord> {

    private static final long serialVersionUID = 1113212630;

    /**
     * The reference instance of <code>public.rb_shift_type</code>
     */
    public static final RbShiftType RB_SHIFT_TYPE = new RbShiftType();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RbShiftTypeRecord> getRecordType() {
        return RbShiftTypeRecord.class;
    }

    /**
     * The column <code>public.rb_shift_type.id</code>.
     */
    public final TableField<RbShiftTypeRecord, Short> ID = createField("id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.rb_shift_type.name</code>.
     */
    public final TableField<RbShiftTypeRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.rb_shift_type.removed</code>.
     */
    public final TableField<RbShiftTypeRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.rb_shift_type</code> table reference
     */
    public RbShiftType() {
        this(DSL.name("rb_shift_type"), null);
    }

    /**
     * Create an aliased <code>public.rb_shift_type</code> table reference
     */
    public RbShiftType(String alias) {
        this(DSL.name(alias), RB_SHIFT_TYPE);
    }

    /**
     * Create an aliased <code>public.rb_shift_type</code> table reference
     */
    public RbShiftType(Name alias) {
        this(alias, RB_SHIFT_TYPE);
    }

    private RbShiftType(Name alias, Table<RbShiftTypeRecord> aliased) {
        this(alias, aliased, null);
    }

    private RbShiftType(Name alias, Table<RbShiftTypeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RbShiftType(Table<O> child, ForeignKey<O, RbShiftTypeRecord> key) {
        super(child, key, RB_SHIFT_TYPE);
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
        return Arrays.<Index>asList(Indexes.PK_SHIFT_TYPE_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RbShiftTypeRecord> getPrimaryKey() {
        return Keys.PK_SHIFT_TYPE_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RbShiftTypeRecord>> getKeys() {
        return Arrays.<UniqueKey<RbShiftTypeRecord>>asList(Keys.PK_SHIFT_TYPE_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbShiftType as(String alias) {
        return new RbShiftType(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RbShiftType as(Name alias) {
        return new RbShiftType(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RbShiftType rename(String name) {
        return new RbShiftType(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RbShiftType rename(Name name) {
        return new RbShiftType(name, null);
    }
}