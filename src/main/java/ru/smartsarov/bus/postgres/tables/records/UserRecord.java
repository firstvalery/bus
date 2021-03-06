/*
 * This file is generated by jOOQ.
 */
package ru.smartsarov.bus.postgres.tables.records;


import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;

import ru.smartsarov.bus.postgres.tables.User;


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
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record12<Integer, String, String, String, String, String, Boolean, String, String, OffsetDateTime, OffsetDateTime, Short> {

    private static final long serialVersionUID = -1469669802;

    /**
     * Setter for <code>public.user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.user.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.user.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.user.middle_name</code>.
     */
    public void setMiddleName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.user.middle_name</code>.
     */
    public String getMiddleName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.user.last_name</code>.
     */
    public void setLastName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.user.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.user.login</code>.
     */
    public void setLogin(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.user.login</code>.
     */
    public String getLogin() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.user.psw</code>.
     */
    public void setPsw(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.user.psw</code>.
     */
    public String getPsw() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.user.psw_change_required</code>.
     */
    public void setPswChangeRequired(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.user.psw_change_required</code>.
     */
    public Boolean getPswChangeRequired() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.user.position</code>.
     */
    public void setPosition(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.user.position</code>.
     */
    public String getPosition() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.user.phone</code>.
     */
    public void setPhone(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.user.phone</code>.
     */
    public String getPhone() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.user.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.user.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for <code>public.user.updated_at</code>.
     */
    public void setUpdatedAt(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.user.updated_at</code>.
     */
    public OffsetDateTime getUpdatedAt() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for <code>public.user.removed</code>.
     */
    public void setRemoved(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.user.removed</code>.
     */
    public Short getRemoved() {
        return (Short) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, String, String, Boolean, String, String, OffsetDateTime, OffsetDateTime, Short> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, String, String, Boolean, String, String, OffsetDateTime, OffsetDateTime, Short> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return User.USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return User.USER.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return User.USER.MIDDLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return User.USER.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return User.USER.LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return User.USER.PSW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return User.USER.PSW_CHANGE_REQUIRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return User.USER.POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return User.USER.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field10() {
        return User.USER.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field11() {
        return User.USER.UPDATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return User.USER.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getMiddleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPsw();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getPswChangeRequired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component10() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component11() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component12() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getMiddleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPsw();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getPswChangeRequired();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value10() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value11() {
        return getUpdatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value3(String value) {
        setMiddleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value4(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value5(String value) {
        setLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value6(String value) {
        setPsw(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value7(Boolean value) {
        setPswChangeRequired(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value8(String value) {
        setPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value9(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value10(OffsetDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value11(OffsetDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord value12(Short value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, Boolean value7, String value8, String value9, OffsetDateTime value10, OffsetDateTime value11, Short value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer id, String firstName, String middleName, String lastName, String login, String psw, Boolean pswChangeRequired, String position, String phone, OffsetDateTime createdAt, OffsetDateTime updatedAt, Short removed) {
        super(User.USER);

        set(0, id);
        set(1, firstName);
        set(2, middleName);
        set(3, lastName);
        set(4, login);
        set(5, psw);
        set(6, pswChangeRequired);
        set(7, position);
        set(8, phone);
        set(9, createdAt);
        set(10, updatedAt);
        set(11, removed);
    }
}
