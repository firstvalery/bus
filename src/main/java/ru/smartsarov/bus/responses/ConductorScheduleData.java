package ru.smartsarov.bus.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConductorScheduleData {
	 @SerializedName("conductorData")
	    @Expose
	    private ConductorData conductorData;
	 @SerializedName("shiftType")
	    @Expose
	    private String shiftType;
	 @SerializedName("readyType")
	    @Expose
	    private String readyType;
	public ConductorData getConductorData() {
		return conductorData;
	}
	public void setConductorData(ConductorData conductorData) {
		this.conductorData = conductorData;
	}
	public String getShiftType() {
		return shiftType;
	}
	public void setShiftType(String shiftType) {
		this.shiftType = shiftType;
	}
	public String getReadyType() {
		return readyType;
	}
	public void setReadyType(String readyType) {
		this.readyType = readyType;
	}
	public ConductorScheduleData(ConductorData conductorData, String shiftType, String readyType) {
		this.conductorData = conductorData;
		this.shiftType = shiftType;
		this.readyType = readyType;
	}
	public ConductorScheduleData() {
		this.conductorData = new ConductorData();
		this.shiftType = "";
		this.readyType = "";
	}
	  
}
