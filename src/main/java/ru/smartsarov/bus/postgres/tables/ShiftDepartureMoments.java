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
import ru.smartsarov.bus.postgres.tables.records.ShiftDepartureMomentsRecord;


/**
 * Оператор наполняет смену маршрута из списка моментов отправления для данного 
 * маршрута. 
 * Триггером проверяется приналдежность всех записей одному маршруту при INSERT. 
 * На уровне внешнего приложения проверяется group() ==1
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ShiftDepartureMoments extends TableImpl<ShiftDepartureMomentsRecord> {

    private static final long serialVersionUID = 2008200559;

    /**
     * The reference instance of <code>public.shift_departure_moments</code>
     */
    public static final ShiftDepartureMoments SHIFT_DEPARTURE_MOMENTS = new ShiftDepartureMoments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ShiftDepartureMomentsRecord> getRecordType() {
        return ShiftDepartureMomentsRecord.class;
    }

    /**
     * The column <code>public.shift_departure_moments.id</code>.
     */
    public final TableField<ShiftDepartureMomentsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('shift_departure_moments_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.shift_departure_moments.shift_departure_list_id</code>.
     */
    public final TableField<ShiftDepartureMomentsRecord, Short> SHIFT_DEPARTURE_LIST_ID = createField("shift_departure_list_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.shift_departure_moments.departure_moments_id</code>.
     */
    public final TableField<ShiftDepartureMomentsRecord, Integer> DEPARTURE_MOMENTS_ID = createField("departure_moments_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.shift_departure_moments.order</code>.
     */
    public final TableField<ShiftDepartureMomentsRecord, Short> ORDER = createField("order", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.shift_departure_moments.removed</code>.
     */
    public final TableField<ShiftDepartureMomentsRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.shift_departure_moments</code> table reference
     */
    public ShiftDepartureMoments() {
        this(DSL.name("shift_departure_moments"), null);
    }

    /**
     * Create an aliased <code>public.shift_departure_moments</code> table reference
     */
    public ShiftDepartureMoments(String alias) {
        this(DSL.name(alias), SHIFT_DEPARTURE_MOMENTS);
    }

    /**
     * Create an aliased <code>public.shift_departure_moments</code> table reference
     */
    public ShiftDepartureMoments(Name alias) {
        this(alias, SHIFT_DEPARTURE_MOMENTS);
    }

    private ShiftDepartureMoments(Name alias, Table<ShiftDepartureMomentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ShiftDepartureMoments(Name alias, Table<ShiftDepartureMomentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Оператор наполняет смену маршрута из списка моментов отправления для данного маршрута. \nТриггером проверяется приналдежность всех записей одному маршруту при INSERT. На уровне внешнего приложения проверяется group() ==1"));
    }

    public <O extends Record> ShiftDepartureMoments(Table<O> child, ForeignKey<O, ShiftDepartureMomentsRecord> key) {
        super(child, key, SHIFT_DEPARTURE_MOMENTS);
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
        return Arrays.<Index>asList(Indexes.PK_SHIFT_DEPARTURE_MOMENTS_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ShiftDepartureMomentsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SHIFT_DEPARTURE_MOMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ShiftDepartureMomentsRecord> getPrimaryKey() {
        return Keys.PK_SHIFT_DEPARTURE_MOMENTS_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ShiftDepartureMomentsRecord>> getKeys() {
        return Arrays.<UniqueKey<ShiftDepartureMomentsRecord>>asList(Keys.PK_SHIFT_DEPARTURE_MOMENTS_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ShiftDepartureMomentsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ShiftDepartureMomentsRecord, ?>>asList(Keys.SHIFT_DEPARTURE_MOMENTS__FK_SHIFT_DEPARTURE_MOMENTS_TBL_SHIFT_ID, Keys.SHIFT_DEPARTURE_MOMENTS__FK_SHIFT_DEPARTURE_MOMENTS_TBL_MOMENTS_ID);
    }

    public ShiftDepartureList shiftDepartureList() {
        return new ShiftDepartureList(this, Keys.SHIFT_DEPARTURE_MOMENTS__FK_SHIFT_DEPARTURE_MOMENTS_TBL_SHIFT_ID);
    }

    public DepartureMoments departureMoments() {
        return new DepartureMoments(this, Keys.SHIFT_DEPARTURE_MOMENTS__FK_SHIFT_DEPARTURE_MOMENTS_TBL_MOMENTS_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShiftDepartureMoments as(String alias) {
        return new ShiftDepartureMoments(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShiftDepartureMoments as(Name alias) {
        return new ShiftDepartureMoments(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ShiftDepartureMoments rename(String name) {
        return new ShiftDepartureMoments(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ShiftDepartureMoments rename(Name name) {
        return new ShiftDepartureMoments(name, null);
    }
}
