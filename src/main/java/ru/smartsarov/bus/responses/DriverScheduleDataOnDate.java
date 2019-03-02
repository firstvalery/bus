package ru.smartsarov.bus.responses;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DriverScheduleDataOnDate {
	@SerializedName("date")
    @Expose
    private String date;
	@SerializedName("driverScheduleList")
    @Expose
    private List<DriverScheduleData> driverScheduleList;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<DriverScheduleData> getDriverScheduleList() {
		return driverScheduleList;
	}
	public void setDriverScheduleList(List<DriverScheduleData> driverScheduleList) {
		this.driverScheduleList = driverScheduleList;
	}
	public DriverScheduleDataOnDate(String date, List<DriverScheduleData> driverScheduleList) {
		this.date = date;
		this.driverScheduleList = driverScheduleList;
	}
	public DriverScheduleDataOnDate() {
		this.date = null;
		this.driverScheduleList = new ArrayList<>();
	}
	
}
