package ru.smartsarov.bus.responses;

import java.util.ArrayList;
import java.util.List;

public class AvailableDriversOnDate {
	private String date;
	private List<DriverScheduleData> driverScheduleDataList;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<DriverScheduleData> getDriverScheduleDataList() {
		return driverScheduleDataList;
	}
	public void setDriverScheduleDataList(List<DriverScheduleData> driverScheduleDataList) {
		this.driverScheduleDataList = driverScheduleDataList;
	}
	public AvailableDriversOnDate(String date, List<DriverScheduleData> driverScheduleDataList) {
		this.date = date;
		this.driverScheduleDataList = driverScheduleDataList;
	}
	public AvailableDriversOnDate() {
		this.date = "";
		this.driverScheduleDataList = new ArrayList<>();
	}
}
