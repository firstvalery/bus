/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables;


import java.time.OffsetDateTime;
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
import ru.smartsarov.bus.postgres.tables.records.ConductorSnapshotRecord;


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
public class ConductorSnapshot extends TableImpl<ConductorSnapshotRecord> {

    private static final long serialVersionUID = 354343051;

    /**
     * The reference instance of <code>public.conductor_snapshot</code>
     */
    public static final ConductorSnapshot CONDUCTOR_SNAPSHOT = new ConductorSnapshot();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConductorSnapshotRecord> getRecordType() {
        return ConductorSnapshotRecord.class;
    }

    /**
     * The column <code>public.conductor_snapshot.id</code>.
     */
    public final TableField<ConductorSnapshotRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('conductor_snapshot_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.conductor_snapshot.employee_data_id</code>.
     */
    public final TableField<ConductorSnapshotRecord, Short> EMPLOYEE_DATA_ID = createField("employee_data_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.conductor_snapshot.schedule_type</code>.
     */
    public final TableField<ConductorSnapshotRecord, Short> SCHEDULE_TYPE = createField("schedule_type", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.conductor_snapshot.ready_type_id</code>.
     */
    public final TableField<ConductorSnapshotRecord, Short> READY_TYPE_ID = createField("ready_type_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.conductor_snapshot.state_id</code>.
     */
    public final TableField<ConductorSnapshotRecord, Short> STATE_ID = createField("state_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.conductor_snapshot.created_at</code>.
     */
    public final TableField<ConductorSnapshotRecord, OffsetDateTime> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * The column <code>public.conductor_snapshot.ended_at</code>.
     */
    public final TableField<ConductorSnapshotRecord, OffsetDateTime> ENDED_AT = createField("ended_at", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * The column <code>public.conductor_snapshot.removed</code>.
     */
    public final TableField<ConductorSnapshotRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.conductor_snapshot</code> table reference
     */
    public ConductorSnapshot() {
        this(DSL.name("conductor_snapshot"), null);
    }

    /**
     * Create an aliased <code>public.conductor_snapshot</code> table reference
     */
    public ConductorSnapshot(String alias) {
        this(DSL.name(alias), CONDUCTOR_SNAPSHOT);
    }

    /**
     * Create an aliased <code>public.conductor_snapshot</code> table reference
     */
    public ConductorSnapshot(Name alias) {
        this(alias, CONDUCTOR_SNAPSHOT);
    }

    private ConductorSnapshot(Name alias, Table<ConductorSnapshotRecord> aliased) {
        this(alias, aliased, null);
    }

    private ConductorSnapshot(Name alias, Table<ConductorSnapshotRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ConductorSnapshot(Table<O> child, ForeignKey<O, ConductorSnapshotRecord> key) {
        super(child, key, CONDUCTOR_SNAPSHOT);
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
        return Arrays.<Index>asList(Indexes.PK_CONDUCTOR_SNAPSHOT_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ConductorSnapshotRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CONDUCTOR_SNAPSHOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ConductorSnapshotRecord> getPrimaryKey() {
        return Keys.PK_CONDUCTOR_SNAPSHOT_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ConductorSnapshotRecord>> getKeys() {
        return Arrays.<UniqueKey<ConductorSnapshotRecord>>asList(Keys.PK_CONDUCTOR_SNAPSHOT_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ConductorSnapshotRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ConductorSnapshotRecord, ?>>asList(Keys.CONDUCTOR_SNAPSHOT__FK_CONDUCTOR_SNAPSHOT_TBL_SCHEDULE_TYPE_ID, Keys.CONDUCTOR_SNAPSHOT__FK_CONDUCTOR_SNAPSHOT_TBL_EMPLOYEE_DATA_ID, Keys.CONDUCTOR_SNAPSHOT__FK_CONDUCTOR_SNAPSHOT_TBL_READY_TYPE_ID, Keys.CONDUCTOR_SNAPSHOT__FK_CONDUCTOR_SNAPSHOT_TBL_STATE_ID);
    }

    public RbEmployeeScheduleType rbEmployeeScheduleType() {
        return new RbEmployeeScheduleType(this, Keys.CONDUCTOR_SNAPSHOT__FK_CONDUCTOR_SNAPSHOT_TBL_SCHEDULE_TYPE_ID);
    }

    public EmployeeData employeeData() {
        return new EmployeeData(this, Keys.CONDUCTOR_SNAPSHOT__FK_CONDUCTOR_SNAPSHOT_TBL_EMPLOYEE_DATA_ID);
    }

    public RbReadyType rbReadyType() {
        return new RbReadyType(this, Keys.CONDUCTOR_SNAPSHOT__FK_CONDUCTOR_SNAPSHOT_TBL_READY_TYPE_ID);
    }

    public RbStateType rbStateType() {
        return new RbStateType(this, Keys.CONDUCTOR_SNAPSHOT__FK_CONDUCTOR_SNAPSHOT_TBL_STATE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorSnapshot as(String alias) {
        return new ConductorSnapshot(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConductorSnapshot as(Name alias) {
        return new ConductorSnapshot(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ConductorSnapshot rename(String name) {
        return new ConductorSnapshot(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ConductorSnapshot rename(Name name) {
        return new ConductorSnapshot(name, null);
    }
}
