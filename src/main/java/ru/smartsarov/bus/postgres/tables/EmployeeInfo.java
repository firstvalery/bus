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
import ru.smartsarov.bus.postgres.tables.records.EmployeeInfoRecord;


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
public class EmployeeInfo extends TableImpl<EmployeeInfoRecord> {

    private static final long serialVersionUID = 690582617;

    /**
     * The reference instance of <code>public.employee_info</code>
     */
    public static final EmployeeInfo EMPLOYEE_INFO = new EmployeeInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EmployeeInfoRecord> getRecordType() {
        return EmployeeInfoRecord.class;
    }

    /**
     * The column <code>public.employee_info.id</code>.
     */
    public final TableField<EmployeeInfoRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('employee_info_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.employee_info.personnel_number</code>.
     */
    public final TableField<EmployeeInfoRecord, String> PERSONNEL_NUMBER = createField("personnel_number", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.employee_info.first_name</code>.
     */
    public final TableField<EmployeeInfoRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.employee_info.middle_name</code>.
     */
    public final TableField<EmployeeInfoRecord, String> MIDDLE_NAME = createField("middle_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.employee_info.last_name</code>.
     */
    public final TableField<EmployeeInfoRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.employee_info.employee_type_id</code>.
     */
    public final TableField<EmployeeInfoRecord, Short> EMPLOYEE_TYPE_ID = createField("employee_type_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.employee_info.removed</code>.
     */
    public final TableField<EmployeeInfoRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * Create a <code>public.employee_info</code> table reference
     */
    public EmployeeInfo() {
        this(DSL.name("employee_info"), null);
    }

    /**
     * Create an aliased <code>public.employee_info</code> table reference
     */
    public EmployeeInfo(String alias) {
        this(DSL.name(alias), EMPLOYEE_INFO);
    }

    /**
     * Create an aliased <code>public.employee_info</code> table reference
     */
    public EmployeeInfo(Name alias) {
        this(alias, EMPLOYEE_INFO);
    }

    private EmployeeInfo(Name alias, Table<EmployeeInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private EmployeeInfo(Name alias, Table<EmployeeInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> EmployeeInfo(Table<O> child, ForeignKey<O, EmployeeInfoRecord> key) {
        super(child, key, EMPLOYEE_INFO);
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
        return Arrays.<Index>asList(Indexes.PK_EMPLOYEE_INFO_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EmployeeInfoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EMPLOYEE_INFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EmployeeInfoRecord> getPrimaryKey() {
        return Keys.PK_EMPLOYEE_INFO_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EmployeeInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<EmployeeInfoRecord>>asList(Keys.PK_EMPLOYEE_INFO_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EmployeeInfoRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EmployeeInfoRecord, ?>>asList(Keys.EMPLOYEE_INFO__FK_EMPLOYEE_INFO_EMPLOYEE_TYPE_ID);
    }

    public RbEmployeeType rbEmployeeType() {
        return new RbEmployeeType(this, Keys.EMPLOYEE_INFO__FK_EMPLOYEE_INFO_EMPLOYEE_TYPE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeInfo as(String alias) {
        return new EmployeeInfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeInfo as(Name alias) {
        return new EmployeeInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EmployeeInfo rename(String name) {
        return new EmployeeInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EmployeeInfo rename(Name name) {
        return new EmployeeInfo(name, null);
    }
}
