package ru.smartsarov.bus.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BusTechAvailabilityData {
	 @SerializedName("busData")
	    @Expose
	    private BusData busData;
	 @SerializedName("busConditionType")
	    @Expose
	    private String busConditionType;
	public BusData getBusData() {
		return busData;
	}
	public void setBusData(BusData busData) {
		this.busData = busData;
	}
	public String getBusConditionType() {
		return busConditionType;
	}
	public void setBusConditionType(String busConditionType) {
		this.busConditionType = busConditionType;
	}
	public BusTechAvailabilityData(BusData busData, String busConditionType) {
		this.busData = busData;
		this.busConditionType = busConditionType;
	}
	public BusTechAvailabilityData() {
		this.busData = new BusData();
		this.busConditionType = "";
	}
}
