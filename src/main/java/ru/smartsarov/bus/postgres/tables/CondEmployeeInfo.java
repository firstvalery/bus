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
import ru.smartsarov.bus.postgres.tables.records.CondEmployeeInfoRecord;


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
public class CondEmployeeInfo extends TableImpl<CondEmployeeInfoRecord> {

    private static final long serialVersionUID = 1507465734;

    /**
     * The reference instance of <code>public.cond_employee_info</code>
     */
    public static final CondEmployeeInfo COND_EMPLOYEE_INFO = new CondEmployeeInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CondEmployeeInfoRecord> getRecordType() {
        return CondEmployeeInfoRecord.class;
    }

    /**
     * The column <code>public.cond_employee_info.id</code>.
     */
    public final TableField<CondEmployeeInfoRecord, Short> ID = createField("id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('cond_employee_info_id_seq'::regclass)", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>public.cond_employee_info.personnel_number</code>.
     */
    public final TableField<CondEmployeeInfoRecord, String> PERSONNEL_NUMBER = createField("personnel_number", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.cond_employee_info.first_name</code>.
     */
    public final TableField<CondEmployeeInfoRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.cond_employee_info.middle_name</code>.
     */
    public final TableField<CondEmployeeInfoRecord, String> MIDDLE_NAME = createField("middle_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.cond_employee_info.last_name</code>.
     */
    public final TableField<CondEmployeeInfoRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.cond_employee_info.removed</code>.
     */
    public final TableField<CondEmployeeInfoRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * Create a <code>public.cond_employee_info</code> table reference
     */
    public CondEmployeeInfo() {
        this(DSL.name("cond_employee_info"), null);
    }

    /**
     * Create an aliased <code>public.cond_employee_info</code> table reference
     */
    public CondEmployeeInfo(String alias) {
        this(DSL.name(alias), COND_EMPLOYEE_INFO);
    }

    /**
     * Create an aliased <code>public.cond_employee_info</code> table reference
     */
    public CondEmployeeInfo(Name alias) {
        this(alias, COND_EMPLOYEE_INFO);
    }

    private CondEmployeeInfo(Name alias, Table<CondEmployeeInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private CondEmployeeInfo(Name alias, Table<CondEmployeeInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CondEmployeeInfo(Table<O> child, ForeignKey<O, CondEmployeeInfoRecord> key) {
        super(child, key, COND_EMPLOYEE_INFO);
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
        return Arrays.<Index>asList(Indexes.PK_COND_EMPLOYEE_INFO_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CondEmployeeInfoRecord, Short> getIdentity() {
        return Keys.IDENTITY_COND_EMPLOYEE_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CondEmployeeInfoRecord> getPrimaryKey() {
        return Keys.PK_COND_EMPLOYEE_INFO_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CondEmployeeInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<CondEmployeeInfoRecord>>asList(Keys.PK_COND_EMPLOYEE_INFO_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CondEmployeeInfo as(String alias) {
        return new CondEmployeeInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CondEmployeeInfo as(Name alias) {
        return new CondEmployeeInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CondEmployeeInfo rename(String name) {
        return new CondEmployeeInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CondEmployeeInfo rename(Name name) {
        return new CondEmployeeInfo(name, null);
    }
}
