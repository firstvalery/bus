package ru.smartsarov.bus.responses;

import java.util.ArrayList;
import java.util.List;

public class OrderData {
	private String stage;
	private String date;
	private List<FixedShiftData> FixedShiftDataList;
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<FixedShiftData> getFixedShiftDataList() {
		return FixedShiftDataList;
	}
	public void setFixedShiftDataList(List<FixedShiftData> fixedShiftDataList) {
		FixedShiftDataList = fixedShiftDataList;
	}
	public OrderData(String stage, String date, List<FixedShiftData> fixedShiftDataList) {
		this.stage = stage;
		this.date = date;
		FixedShiftDataList = fixedShiftDataList;
	}
	public OrderData() {
		this.stage = "";
		this.date = "";
		FixedShiftDataList = new ArrayList<>();
	}
	

}
