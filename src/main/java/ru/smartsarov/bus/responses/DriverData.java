package ru.smartsarov.bus.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DriverData {
	 @SerializedName("id")
	    @Expose
	    private Integer id;
	 @SerializedName("personalNumber")
	    @Expose
	    private String personalNumber;
	 @SerializedName("firstName")
	    @Expose
	    private String firstName;
	 @SerializedName("middleName")
	    @Expose
	    private String middleName;
	 @SerializedName("lastName")
	    @Expose
	    private String lastName;
	 @SerializedName("busGarageNumber")
	    @Expose
	    private String busGarageNumber;
	 @SerializedName("groupId")
	    @Expose
	    private Short groupId;
	 @SerializedName("brigadeId")
	    @Expose
	    private Short brigadeId;
	 @SerializedName("briadireFlag")
	    @Expose
	    private Boolean briadireFlag;
	 @SerializedName("stateType")
	    @Expose
	    private String stateType;
	 @SerializedName("ticketFlag")
	    @Expose
	    private Boolean ticketFlag;
	public DriverData(Integer id, String personalNumber, String firstName, String middleName, String lastName,
			String busGarageNumber, Short groupId, Short brigadeId, Boolean briadireFlag, String stateType,
			Boolean ticketFlag) {
		this.id = id;
		this.personalNumber = personalNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.busGarageNumber = busGarageNumber;
		this.groupId = groupId;
		this.brigadeId = brigadeId;
		this.briadireFlag = briadireFlag;
		this.stateType = stateType;
		this.ticketFlag = ticketFlag;
	}
	public DriverData() {
		this.id = 0;
		this.personalNumber = "";
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.busGarageNumber = "";
		this.groupId = 0;
		this.brigadeId = 0;
		this.briadireFlag = false;
		this.stateType = "";
		this.ticketFlag = false;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPersonalNumber() {
		return personalNumber;
	}
	public void setPersonalNumber(String personalNumber) {
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
	public String getBusGarageNumber() {
		return busGarageNumber;
	}
	public void setBusGarageNumber(String busGarageNumber) {
		this.busGarageNumber = busGarageNumber;
	}
	public Short getGroupId() {
		return groupId;
	}
	public void setGroupId(Short groupId) {
		this.groupId = groupId;
	}
	public Boolean isBriadireFlag() {
		return briadireFlag;
	}
	public void setBriadireFlag(Boolean briadireFlag) {
		this.briadireFlag = briadireFlag;
	}
	public String getStateType() {
		return stateType;
	}
	public void setStateType(String stateType) {
		this.stateType = stateType;
	}
	public Boolean isTicketFlag() {
		return ticketFlag;
	}
	public void setTicketFlag(Boolean ticketFlag) {
		this.ticketFlag = ticketFlag;
	}
	public Short getBrigadeId() {
		return brigadeId;
	}
	public void setBrigadeId(Short brigadeId) {
		this.brigadeId = brigadeId;
	}
	
	 
}
