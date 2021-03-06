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
import ru.smartsarov.bus.postgres.tables.records.ShiftScheduleSnapshotRecord;


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
public class ShiftScheduleSnapshot extends TableImpl<ShiftScheduleSnapshotRecord> {

    private static final long serialVersionUID = -46879608;

    /**
     * The reference instance of <code>public.shift_schedule_snapshot</code>
     */
    public static final ShiftScheduleSnapshot SHIFT_SCHEDULE_SNAPSHOT = new ShiftScheduleSnapshot();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShiftScheduleSnapshotRecord> getRecordType() {
        return ShiftScheduleSnapshotRecord.class;
    }

    /**
     * The column <code>public.shift_schedule_snapshot.id</code>.
     */
    public final TableField<ShiftScheduleSnapshotRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('shift_schedule_snapshot_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.shift_schedule_snapshot.name</code>.
     */
    public final TableField<ShiftScheduleSnapshotRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.shift_schedule_snapshot.shift_type_id</code>.
     */
    public final TableField<ShiftScheduleSnapshotRecord, Short> SHIFT_TYPE_ID = createField("shift_type_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.shift_schedule_snapshot.shift_departure_list_id</code>.
     */
    public final TableField<ShiftScheduleSnapshotRecord, Short> SHIFT_DEPARTURE_LIST_ID = createField("shift_departure_list_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.shift_schedule_snapshot.from_garage_before_flag</code>.
     */
    public final TableField<ShiftScheduleSnapshotRecord, Boolean> FROM_GARAGE_BEFORE_FLAG = createField("from_garage_before_flag", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.shift_schedule_snapshot.to_garage_after_flag</code>.
     */
    public final TableField<ShiftScheduleSnapshotRecord, Boolean> TO_GARAGE_AFTER_FLAG = createField("to_garage_after_flag", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.shift_schedule_snapshot.garage_between_flag</code>.
     */
    public final TableField<ShiftScheduleSnapshotRecord, Boolean> GARAGE_BETWEEN_FLAG = createField("garage_between_flag", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.shift_schedule_snapshot.created_at</code>.
     */
    public final TableField<ShiftScheduleSnapshotRecord, OffsetDateTime> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * The column <code>public.shift_schedule_snapshot.ended_at</code>.
     */
    public final TableField<ShiftScheduleSnapshotRecord, OffsetDateTime> ENDED_AT = createField("ended_at", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * The column <code>public.shift_schedule_snapshot.removed</code>.
     */
    public final TableField<ShiftScheduleSnapshotRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.shift_schedule_snapshot</code> table reference
     */
    public ShiftScheduleSnapshot() {
        this(DSL.name("shift_schedule_snapshot"), null);
    }

    /**
     * Create an aliased <code>public.shift_schedule_snapshot</code> table reference
     */
    public ShiftScheduleSnapshot(String alias) {
        this(DSL.name(alias), SHIFT_SCHEDULE_SNAPSHOT);
    }

    /**
     * Create an aliased <code>public.shift_schedule_snapshot</code> table reference
     */
    public ShiftScheduleSnapshot(Name alias) {
        this(alias, SHIFT_SCHEDULE_SNAPSHOT);
    }

    private ShiftScheduleSnapshot(Name alias, Table<ShiftScheduleSnapshotRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShiftScheduleSnapshot(Name alias, Table<ShiftScheduleSnapshotRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ShiftScheduleSnapshot(Table<O> child, ForeignKey<O, ShiftScheduleSnapshotRecord> key) {
        super(child, key, SHIFT_SCHEDULE_SNAPSHOT);
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
        return Arrays.<Index>asList(Indexes.PK_SHIFT_SCHEDULE_SNAPSORT_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ShiftScheduleSnapshotRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SHIFT_SCHEDULE_SNAPSHOT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShiftScheduleSnapshotRecord> getPrimaryKey() {
        return Keys.PK_SHIFT_SCHEDULE_SNAPSORT_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShiftScheduleSnapshotRecord>> getKeys() {
        return Arrays.<UniqueKey<ShiftScheduleSnapshotRecord>>asList(Keys.PK_SHIFT_SCHEDULE_SNAPSORT_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ShiftScheduleSnapshotRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ShiftScheduleSnapshotRecord, ?>>asList(Keys.SHIFT_SCHEDULE_SNAPSHOT__FK_SHIFT_SCHEDULE_SNAPSHOT_TBL_SHIFT_TYPE_ID, Keys.SHIFT_SCHEDULE_SNAPSHOT__FK_SHIFT_SCHEDULE_SNAPSHOT_TBL_SHIFT_DEPARTURE_LIST_ID);
    }

    public RbShiftType rbShiftType() {
        return new RbShiftType(this, Keys.SHIFT_SCHEDULE_SNAPSHOT__FK_SHIFT_SCHEDULE_SNAPSHOT_TBL_SHIFT_TYPE_ID);
    }

    public ShiftDepartureList shiftDepartureList() {
        return new ShiftDepartureList(this, Keys.SHIFT_SCHEDULE_SNAPSHOT__FK_SHIFT_SCHEDULE_SNAPSHOT_TBL_SHIFT_DEPARTURE_LIST_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShiftScheduleSnapshot as(String alias) {
        return new ShiftScheduleSnapshot(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShiftScheduleSnapshot as(Name alias) {
        return new ShiftScheduleSnapshot(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShiftScheduleSnapshot rename(String name) {
        return new ShiftScheduleSnapshot(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShiftScheduleSnapshot rename(Name name) {
        return new ShiftScheduleSnapshot(name, null);
    }
}
