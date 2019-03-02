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
import ru.smartsarov.bus.postgres.tables.records.RouteScheduleSnapshotRecord;


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
public class RouteScheduleSnapshot extends TableImpl<RouteScheduleSnapshotRecord> {

    private static final long serialVersionUID = -1365261393;

    /**
     * The reference instance of <code>public.route_schedule_snapshot</code>
     */
    public static final RouteScheduleSnapshot ROUTE_SCHEDULE_SNAPSHOT = new RouteScheduleSnapshot();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RouteScheduleSnapshotRecord> getRecordType() {
        return RouteScheduleSnapshotRecord.class;
    }

    /**
     * The column <code>public.route_schedule_snapshot.route_id</code>.
     */
    public final TableField<RouteScheduleSnapshotRecord, Short> ROUTE_ID = createField("route_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.route_schedule_snapshot.departure_list_id</code>.
     */
    public final TableField<RouteScheduleSnapshotRecord, Short> DEPARTURE_LIST_ID = createField("departure_list_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.route_schedule_snapshot.created_at</code>.
     */
    public final TableField<RouteScheduleSnapshotRecord, OffsetDateTime> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * The column <code>public.route_schedule_snapshot.ended_at</code>.
     */
    public final TableField<RouteScheduleSnapshotRecord, OffsetDateTime> ENDED_AT = createField("ended_at", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * The column <code>public.route_schedule_snapshot.removed</code>.
     */
    public final TableField<RouteScheduleSnapshotRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.route_schedule_snapshot</code> table reference
     */
    public RouteScheduleSnapshot() {
        this(DSL.name("route_schedule_snapshot"), null);
    }

    /**
     * Create an aliased <code>public.route_schedule_snapshot</code> table reference
     */
    public RouteScheduleSnapshot(String alias) {
        this(DSL.name(alias), ROUTE_SCHEDULE_SNAPSHOT);
    }

    /**
     * Create an aliased <code>public.route_schedule_snapshot</code> table reference
     */
    public RouteScheduleSnapshot(Name alias) {
        this(alias, ROUTE_SCHEDULE_SNAPSHOT);
    }

    private RouteScheduleSnapshot(Name alias, Table<RouteScheduleSnapshotRecord> aliased) {
        this(alias, aliased, null);
    }

    private RouteScheduleSnapshot(Name alias, Table<RouteScheduleSnapshotRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RouteScheduleSnapshot(Table<O> child, ForeignKey<O, RouteScheduleSnapshotRecord> key) {
        super(child, key, ROUTE_SCHEDULE_SNAPSHOT);
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
        return Arrays.<Index>asList(Indexes.PK_ROUTE_SCHEDULE_SNAPSHOT_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RouteScheduleSnapshotRecord> getPrimaryKey() {
        return Keys.PK_ROUTE_SCHEDULE_SNAPSHOT_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RouteScheduleSnapshotRecord>> getKeys() {
        return Arrays.<UniqueKey<RouteScheduleSnapshotRecord>>asList(Keys.PK_ROUTE_SCHEDULE_SNAPSHOT_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<RouteScheduleSnapshotRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<RouteScheduleSnapshotRecord, ?>>asList(Keys.ROUTE_SCHEDULE_SNAPSHOT__FK_ROUTE_SCHEDULE_SNAPSHOT_TBL_ROUTE_ID, Keys.ROUTE_SCHEDULE_SNAPSHOT__FK_ROUTE_SCHEDULE_SNAPSHOT_TBL_DEPARTURE_LIST_ID);
    }

    public Route route() {
        return new Route(this, Keys.ROUTE_SCHEDULE_SNAPSHOT__FK_ROUTE_SCHEDULE_SNAPSHOT_TBL_ROUTE_ID);
    }

    public DepartureList departureList() {
        return new DepartureList(this, Keys.ROUTE_SCHEDULE_SNAPSHOT__FK_ROUTE_SCHEDULE_SNAPSHOT_TBL_DEPARTURE_LIST_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteScheduleSnapshot as(String alias) {
        return new RouteScheduleSnapshot(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RouteScheduleSnapshot as(Name alias) {
        return new RouteScheduleSnapshot(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RouteScheduleSnapshot rename(String name) {
        return new RouteScheduleSnapshot(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RouteScheduleSnapshot rename(Name name) {
        return new RouteScheduleSnapshot(name, null);
    }
}