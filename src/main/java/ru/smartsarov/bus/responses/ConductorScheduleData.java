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
	public ConductorScheduleData(ConductorData conductorData, String shiftType) {
		this.conductorData = conductorData;
		this.shiftType = shiftType;
	} 
	public ConductorScheduleData() {
		this.conductorData = new ConductorData();
		this.shiftType = "";
	}  
}
