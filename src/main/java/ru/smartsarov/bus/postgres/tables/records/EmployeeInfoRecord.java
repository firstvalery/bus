/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.bus.postgres.tables.EmployeeInfo;


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
public class EmployeeInfoRecord extends UpdatableRecordImpl<EmployeeInfoRecord> implements Record6<Short, String, String, String, String, Short> {

    private static final long serialVersionUID = 126716927;

    /**
     * Setter for <code>public.employee_info.id</code>.
     */
    public void setId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.employee_info.id</code>.
     */
    public Short getId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>public.employee_info.personnel_number</code>.
     */
    public void setPersonnelNumber(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.employee_info.personnel_number</code>.
     */
    public String getPersonnelNumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.employee_info.first_name</code>.
     */
    public void setFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.employee_info.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.employee_info.middle_name</code>.
     */
    public void setMiddleName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.employee_info.middle_name</code>.
     */
    public String getMiddleName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.employee_info.last_name</code>.
     */
    public void setLastName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.employee_info.last_name</code>.
     */
    public String getLastName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.employee_info.removed</code>.
     */
    public void setRemoved(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.employee_info.removed</code>.
     */
    public Short getRemoved() {
        return (Short) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Short> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Short, String, String, String, String, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Short, String, String, String, String, Short> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return EmployeeInfo.EMPLOYEE_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return EmployeeInfo.EMPLOYEE_INFO.PERSONNEL_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return EmployeeInfo.EMPLOYEE_INFO.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return EmployeeInfo.EMPLOYEE_INFO.MIDDLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return EmployeeInfo.EMPLOYEE_INFO.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return EmployeeInfo.EMPLOYEE_INFO.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPersonnelNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMiddleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPersonnelNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMiddleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeInfoRecord value1(Short value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeInfoRecord value2(String value) {
        setPersonnelNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeInfoRecord value3(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeInfoRecord value4(String value) {
        setMiddleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeInfoRecord value5(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeInfoRecord value6(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmployeeInfoRecord values(Short value1, String value2, String value3, String value4, String value5, Short value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmployeeInfoRecord
     */
    public EmployeeInfoRecord() {
        super(EmployeeInfo.EMPLOYEE_INFO);
    }

    /**
     * Create a detached, initialised EmployeeInfoRecord
     */
    public EmployeeInfoRecord(Short id, String personnelNumber, String firstName, String middleName, String lastName, Short removed) {
        super(EmployeeInfo.EMPLOYEE_INFO);

        set(0, id);
        set(1, personnelNumber);
        set(2, firstName);
        set(3, middleName);
        set(4, lastName);
        set(5, removed);
    }
}
