/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables;


import java.sql.Date;
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
import ru.smartsarov.bus.postgres.tables.records.DriverScheduleRecord;


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
public class DriverSchedule extends TableImpl<DriverScheduleRecord> {

    private static final long serialVersionUID = -1555997682;

    /**
     * The reference instance of <code>public.driver_schedule</code>
     */
    public static final DriverSchedule DRIVER_SCHEDULE = new DriverSchedule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DriverScheduleRecord> getRecordType() {
        return DriverScheduleRecord.class;
    }

    /**
     * The column <code>public.driver_schedule.employee_id</code>.
     */
    public final TableField<DriverScheduleRecord, Short> EMPLOYEE_ID = createField("employee_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.driver_schedule.date</code>.
     */
    public final TableField<DriverScheduleRecord, Date> DATE = createField("date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

    /**
     * The column <code>public.driver_schedule.schedule_type_id</code>.
     */
    public final TableField<DriverScheduleRecord, Short> SCHEDULE_TYPE_ID = createField("schedule_type_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.driver_schedule.removed</code>.
     */
    public final TableField<DriverScheduleRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.driver_schedule</code> table reference
     */
    public DriverSchedule() {
        this(DSL.name("driver_schedule"), null);
    }

    /**
     * Create an aliased <code>public.driver_schedule</code> table reference
     */
    public DriverSchedule(String alias) {
        this(DSL.name(alias), DRIVER_SCHEDULE);
    }

    /**
     * Create an aliased <code>public.driver_schedule</code> table reference
     */
    public DriverSchedule(Name alias) {
        this(alias, DRIVER_SCHEDULE);
    }

    private DriverSchedule(Name alias, Table<DriverScheduleRecord> aliased) {
        this(alias, aliased, null);
    }

    private DriverSchedule(Name alias, Table<DriverScheduleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DriverSchedule(Table<O> child, ForeignKey<O, DriverScheduleRecord> key) {
        super(child, key, DRIVER_SCHEDULE);
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
        return Arrays.<Index>asList(Indexes.PK_DRIVER_SCHEDULE_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DriverScheduleRecord> getPrimaryKey() {
        return Keys.PK_DRIVER_SCHEDULE_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DriverScheduleRecord>> getKeys() {
        return Arrays.<UniqueKey<DriverScheduleRecord>>asList(Keys.PK_DRIVER_SCHEDULE_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<DriverScheduleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DriverScheduleRecord, ?>>asList(Keys.DRIVER_SCHEDULE__FK_DRIVER_SCHEDULE_TBL_EMPLOYEE_ID_FK, Keys.DRIVER_SCHEDULE__FK_DRIVER_SCHEDULE_TBL_SHIFT_TYPE_ID);
    }

    public Driver driver() {
        return new Driver(this, Keys.DRIVER_SCHEDULE__FK_DRIVER_SCHEDULE_TBL_EMPLOYEE_ID_FK);
    }

    public ShiftType shiftType() {
        return new ShiftType(this, Keys.DRIVER_SCHEDULE__FK_DRIVER_SCHEDULE_TBL_SHIFT_TYPE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverSchedule as(String alias) {
        return new DriverSchedule(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DriverSchedule as(Name alias) {
        return new DriverSchedule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DriverSchedule rename(String name) {
        return new DriverSchedule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DriverSchedule rename(Name name) {
        return new DriverSchedule(name, null);
    }
}