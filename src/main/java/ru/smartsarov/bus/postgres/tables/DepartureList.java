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
import ru.smartsarov.bus.postgres.tables.records.DepartureListRecord;


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
public class DepartureList extends TableImpl<DepartureListRecord> {

    private static final long serialVersionUID = 496391011;

    /**
     * The reference instance of <code>public.departure_list</code>
     */
    public static final DepartureList DEPARTURE_LIST = new DepartureList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DepartureListRecord> getRecordType() {
        return DepartureListRecord.class;
    }

    /**
     * The column <code>public.departure_list.id</code>.
     */
    public final TableField<DepartureListRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('departure_list_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.departure_list.description</code>.
     */
    public final TableField<DepartureListRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.departure_list.removed</code>.
     */
    public final TableField<DepartureListRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * Create a <code>public.departure_list</code> table reference
     */
    public DepartureList() {
        this(DSL.name("departure_list"), null);
    }

    /**
     * Create an aliased <code>public.departure_list</code> table reference
     */
    public DepartureList(String alias) {
        this(DSL.name(alias), DEPARTURE_LIST);
    }

    /**
     * Create an aliased <code>public.departure_list</code> table reference
     */
    public DepartureList(Name alias) {
        this(alias, DEPARTURE_LIST);
    }

    private DepartureList(Name alias, Table<DepartureListRecord> aliased) {
        this(alias, aliased, null);
    }

    private DepartureList(Name alias, Table<DepartureListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DepartureList(Table<O> child, ForeignKey<O, DepartureListRecord> key) {
        super(child, key, DEPARTURE_LIST);
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
        return Arrays.<Index>asList(Indexes.PK_DEPARTURE_LIST_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DepartureListRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DEPARTURE_LIST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DepartureListRecord> getPrimaryKey() {
        return Keys.PK_DEPARTURE_LIST_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DepartureListRecord>> getKeys() {
        return Arrays.<UniqueKey<DepartureListRecord>>asList(Keys.PK_DEPARTURE_LIST_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartureList as(String alias) {
        return new DepartureList(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DepartureList as(Name alias) {
        return new DepartureList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DepartureList rename(String name) {
        return new DepartureList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DepartureList rename(Name name) {
        return new DepartureList(name, null);
    }
}
