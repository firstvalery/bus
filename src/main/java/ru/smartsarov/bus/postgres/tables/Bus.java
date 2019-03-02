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
import ru.smartsarov.bus.postgres.tables.records.BusRecord;


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
public class Bus extends TableImpl<BusRecord> {

    private static final long serialVersionUID = -1946549358;

    /**
     * The reference instance of <code>public.bus</code>
     */
    public static final Bus BUS = new Bus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BusRecord> getRecordType() {
        return BusRecord.class;
    }

    /**
     * The column <code>public.bus.id</code>.
     */
    public final TableField<BusRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('bus_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.bus.bus_id</code>.
     */
    public final TableField<BusRecord, Short> BUS_ID = createField("bus_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.bus.garage_number_id</code>.
     */
    public final TableField<BusRecord, String> GARAGE_NUMBER_ID = createField("garage_number_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.bus.state_number_id</code>.
     */
    public final TableField<BusRecord, String> STATE_NUMBER_ID = createField("state_number_id", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.bus.fuel_code_id</code>.
     */
    public final TableField<BusRecord, Short> FUEL_CODE_ID = createField("fuel_code_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.bus.odometer_mileage</code>.
     */
    public final TableField<BusRecord, Integer> ODOMETER_MILEAGE = createField("odometer_mileage", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.bus.tracker_mileage</code>.
     */
    public final TableField<BusRecord, Integer> TRACKER_MILEAGE = createField("tracker_mileage", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.bus.condition_id</code>.
     */
    public final TableField<BusRecord, Short> CONDITION_ID = createField("condition_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.bus.removed</code>.
     */
    public final TableField<BusRecord, Short> REMOVED = createField("removed", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>public.bus</code> table reference
     */
    public Bus() {
        this(DSL.name("bus"), null);
    }

    /**
     * Create an aliased <code>public.bus</code> table reference
     */
    public Bus(String alias) {
        this(DSL.name(alias), BUS);
    }

    /**
     * Create an aliased <code>public.bus</code> table reference
     */
    public Bus(Name alias) {
        this(alias, BUS);
    }

    private Bus(Name alias, Table<BusRecord> aliased) {
        this(alias, aliased, null);
    }

    private Bus(Name alias, Table<BusRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Bus(Table<O> child, ForeignKey<O, BusRecord> key) {
        super(child, key, BUS);
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
        return Arrays.<Index>asList(Indexes.PK_BUS_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BusRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BusRecord> getPrimaryKey() {
        return Keys.PK_BUS_TBL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BusRecord>> getKeys() {
        return Arrays.<UniqueKey<BusRecord>>asList(Keys.PK_BUS_TBL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BusRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BusRecord, ?>>asList(Keys.BUS__FK_BUS_TBL_BUS_ID, Keys.BUS__FK_BUS_TBL_FUEL_CODE_ID, Keys.BUS__FK_BUS_TBL_CONDITION_ID);
    }

    public BusData busData() {
        return new BusData(this, Keys.BUS__FK_BUS_TBL_BUS_ID);
    }

    public FuelCode fuelCode() {
        return new FuelCode(this, Keys.BUS__FK_BUS_TBL_FUEL_CODE_ID);
    }

    public BusCondition busCondition() {
        return new BusCondition(this, Keys.BUS__FK_BUS_TBL_CONDITION_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bus as(String alias) {
        return new Bus(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Bus as(Name alias) {
        return new Bus(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Bus rename(String name) {
        return new Bus(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Bus rename(Name name) {
        return new Bus(name, null);
    }
}