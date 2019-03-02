package ru.smartsarov.bus.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DriverData {
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
	 @SerializedName("busGarageNumber")
	    @Expose
	    private String busGarageNumber;
	 @SerializedName("groupId")
	    @Expose
	    private Integer groupId;
	 @SerializedName("briadireFlag")
	    @Expose
	    private boolean briadireFlag;
	 @SerializedName("readyType")
	    @Expose
	    private String readyType;
	 @SerializedName("stateType")
	    @Expose
	    private String stateType;
	 @SerializedName("ticketFlag")
	    @Expose
	    private boolean ticketFlag;
	public DriverData(Integer id, Integer personalNumber, String firstName, String middleName, String lastName,
			String busGarageNumber, Integer groupId, boolean briadireFlag, String readyType, String stateType,
			boolean ticketFlag) {
		this.id = id;
		this.personalNumber = personalNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.busGarageNumber = busGarageNumber;
		this.groupId = groupId;
		this.briadireFlag = briadireFlag;
		this.readyType = readyType;
		this.stateType = stateType;
		this.ticketFlag = ticketFlag;
	}
	public DriverData() {
		this.id = 0;
		this.personalNumber = 0;
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.busGarageNumber = "";
		this.groupId = 0;
		this.briadireFlag = false;
		this.readyType = "";
		this.stateType = "";
		this.ticketFlag = false;
	}
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
	public String getBusGarageNumber() {
		return busGarageNumber;
	}
	public void setBusGarageNumber(String busGarageNumber) {
		this.busGarageNumber = busGarageNumber;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public boolean isBriadireFlag() {
		return briadireFlag;
	}
	public void setBriadireFlag(boolean briadireFlag) {
		this.briadireFlag = briadireFlag;
	}
	public String getReadyType() {
		return readyType;
	}
	public void setReadyType(String readyType) {
		this.readyType = readyType;
	}
	public String getStateType() {
		return stateType;
	}
	public void setStateType(String stateType) {
		this.stateType = stateType;
	}
	public boolean isTicketFlag() {
		return ticketFlag;
	}
	public void setTicketFlag(boolean ticketFlag) {
		this.ticketFlag = ticketFlag;
	}
	
	 
}
