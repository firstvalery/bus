package ru.smartsarov.bus.responses;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConductorScheduleDataOnDate {
	@SerializedName("date")
    @Expose
    private String date;
	@SerializedName("conductorScheduleList")
    @Expose
    private List<ConductorScheduleData> conductorScheduleList;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<ConductorScheduleData> getConductorScheduleList() {
		return conductorScheduleList;
	}
	public void setConductorScheduleList(List<ConductorScheduleData> conductorScheduleList) {
		this.conductorScheduleList = conductorScheduleList;
	}
	public ConductorScheduleDataOnDate(String date, List<ConductorScheduleData> conductorScheduleList) {
		this.date = date;
		this.conductorScheduleList = conductorScheduleList;
	}
	public ConductorScheduleDataOnDate() {
		this.date = null;
		this.conductorScheduleList = new ArrayList<>();
	}
}
