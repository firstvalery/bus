package ru.smartsarov.bus.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConductorData {
	 @SerializedName("id")
	    @Expose
	    private Integer id;
	 @SerializedName("personalNumber")
	    @Expose
	    private Integer personalNumber;
	 @SerializedName("firstName")
	    @Expose
	    private String firstName;
	 @SerializedName("middleName")
	    @Expose
	    private String middleName;
	 @SerializedName("lastName")
	    @Expose
	    private String lastName;
	 @SerializedName("stateType")
	    @Expose
	    private String stateType;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(Integer personalNumber) {
		this.personalNumber = personalNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStateType() {
		return stateType;
	}
	public void setStateType(String stateType) {
		this.stateType = stateType;
	}
	public ConductorData(Integer id, Integer personalNumber, String firstName, String middleName, String lastName,
			 String stateType) {
		this.id = id;
		this.personalNumber = personalNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.stateType = stateType;
	}
	public ConductorData() {
		this.id = 0;
		this.personalNumber = 0;
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.stateType = "";
	}
	 
	
}
