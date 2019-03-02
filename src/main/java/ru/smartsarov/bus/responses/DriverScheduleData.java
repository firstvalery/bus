package ru.smartsarov.bus.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DriverScheduleData {
	 @SerializedName("driverData")
	    @Expose
	    private DriverData driverData;
	 @SerializedName("shiftType")
	    @Expose
	    private String shiftType;
	 @SerializedName("readyType")
	    @Expose
	    private String readyType;
	public DriverData getDriverData() {
		return driverData;
	}
	public void setDriverData(DriverData driverData) {
		this.driverData = driverData;
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
	public DriverScheduleData(DriverData driverData, String shiftType, String readyType) {
		this.driverData = driverData;
		this.shiftType = shiftType;
		this.readyType = readyType;
	}
	public DriverScheduleData() {
		this.driverData = new DriverData();
		this.shiftType = "";
		this.readyType = "";
	}
	 
}
