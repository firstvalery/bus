package ru.smartsarov.bus.responses;

import java.util.ArrayList;
import java.util.List;

public class AvailableBusesOnDate {
	private String date;
	private List<BusData>busDataList;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<BusData> getBusDataList() {
		return busDataList;
	}
	public void setBusDataList(List<BusData> busDataList) {
		this.busDataList = busDataList;
	}
	public AvailableBusesOnDate(String date, List<BusData> busDataList) {
		this.date = date;
		this.busDataList = busDataList;
	}
	public AvailableBusesOnDate() {
		this.date = "";
		this.busDataList = new ArrayList<>();
	}
	

}
