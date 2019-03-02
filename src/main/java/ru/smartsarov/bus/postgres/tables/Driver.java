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
import ru.smartsarov.bus.postgres.tables.records.DriverRecord;


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
public class Driver extends TableImpl<DriverRecord> {

    private static final long serialVersionUID = -185986915;

    /**
     * The reference instance of <code>public.driver</code>
     */
    public static final Driver DRIVER = new Driver();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DriverRecord> getRecordType() {
        return DriverRecord.class;
    }

    /**
     * The column <code>public.driver.id</code>.
     */
    public final TableField<DriverRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('driver_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.driver.employee_data_id</code>.
     */
    public final TableField<DriverRecord, Short> EMPLOYEE_DATA_ID = createField("employee_data_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.driver.bus_id</code>.
     */
    public final TableField<DriverRecord, Short> BUS_ID = createField("bus_id", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.driver.brigadier_flag</code>.
     */
    public final TableField<DriverRecord, Boolean> BRIGADIER_FLAG = createField("brigadier_flag", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.driver.group_id</code>.
     */
    public final TableField<DriverRecord, Short> GROUP_ID = createField("group_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.driver.schedule_type</code>.
     */
    public final TableField<DriverRecord, Short> SCHEDULE_TYPE = createField("schedule_type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.driver.ready_type_id</code>.
     */
    public final TableField<DriverRecord, Short> READY_TYPE_ID = createField("ready_type_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.driver.state_id</code>.
     */
    public final TableField<DriverRecord, Short> STATE_ID = createField("state_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.driver.ticket_flag</code>.
     */
    public final TableField<DriverRecord, Boolean> TICKET_FLAG = createField("ticket_flag", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.driver.removed</code>.
     */
    public final TableField<DriverRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * Create a <code>public.driver</code> table reference
     */
    public Driver() {
        this(DSL.name("driver"), null);
    }

    /**
     * Create an aliased <code>public.driver</code> table reference
     */
    public Driver(String alias) {
        this(DSL.name(alias), DRIVER);
    }

    /**
     * Create an aliased <code>public.driver</code> table reference
     */
    public Driver(Name alias) {
        this(alias, DRIVER);
    }

    private Driver(Name alias, Table<DriverRecord> aliased) {
        this(alias, aliased, null);
    }

    private Driver(Name alias, Table<DriverRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Driver(Table<O> child, ForeignKey<O, DriverRecord> key) {
        super(child, key, DRIVER);
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
        return Arrays.<Index>asList(Indexes.PK_DRIVER_TBL_EMPLOYEE_SNAPSHOT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DriverRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DRIVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DriverRecord> getPrimaryKey() {
        return Keys.PK_DRIVER_TBL_EMPLOYEE_SNAPSHOT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DriverRecord>> getKeys() {
        return Arrays.<UniqueKey<DriverRecord>>asList(Keys.PK_DRIVER_TBL_EMPLOYEE_SNAPSHOT_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DriverRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DriverRecord, ?>>asList(Keys.DRIVER__FK_DRIVER_TBL_EMPLOYEE_DATA_ID, Keys.DRIVER__FK_DRIVER_TBL_BUS_ID, Keys.DRIVER__FK_DRIVER_TBL_GROUP_ID, Keys.DRIVER__FK_DRIVER_TBL_SCHEDULE_TYPE, Keys.DRIVER__FK_DRIVER_TBL_READY_TYPE_ID, Keys.DRIVER__FK_DRIVER_TBL_STATE_ID);
    }

    public EmployeeData employeeData() {
        return new EmployeeData(this, Keys.DRIVER__FK_DRIVER_TBL_EMPLOYEE_DATA_ID);
    }

    public Bus bus() {
        return new Bus(this, Keys.DRIVER__FK_DRIVER_TBL_BUS_ID);
    }

    public DriverGroup driverGroup() {
        return new DriverGroup(this, Keys.DRIVER__FK_DRIVER_TBL_GROUP_ID);
    }

    public RbEmployeeScheduleType rbEmployeeScheduleType() {
        return new RbEmployeeScheduleType(this, Keys.DRIVER__FK_DRIVER_TBL_SCHEDULE_TYPE);
    }

    public RbReadyType rbReadyType() {
        return new RbReadyType(this, Keys.DRIVER__FK_DRIVER_TBL_READY_TYPE_ID);
    }

    public RbStateType rbStateType() {
        return new RbStateType(this, Keys.DRIVER__FK_DRIVER_TBL_STATE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Driver as(String alias) {
        return new Driver(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Driver as(Name alias) {
        return new Driver(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Driver rename(String name) {
        return new Driver(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Driver rename(Name name) {
        return new Driver(name, null);
    }
}
