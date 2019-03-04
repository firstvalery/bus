package ru.smartsarov.bus.responses;

import java.util.ArrayList;
import java.util.List;

public class AvailableConductorsOnDate {
	private String date;
	private List<ConductorScheduleData> conductorScheduleDataList;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<ConductorScheduleData> getConductorScheduleDataList() {
		return conductorScheduleDataList;
	}
	public void setConductorScheduleDataList(List<ConductorScheduleData> conductorScheduleDataList) {
		this.conductorScheduleDataList = conductorScheduleDataList;
	}
	public AvailableConductorsOnDate(String date, List<ConductorScheduleData> conductorScheduleDataList) {
		this.date = date;
		this.conductorScheduleDataList = conductorScheduleDataList;
	}
	public AvailableConductorsOnDate() {
		this.date = "";
		this.conductorScheduleDataList = new ArrayList<>();
	}
	
}
