package ru.smartsarov.bus.responses;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BusTechAvailabilityDataOnDate {
	@SerializedName("date")
    @Expose
    private String date;
	@SerializedName("busTechAvailabilityList")
    @Expose
    private List<BusTechAvailabilityData> busTechAvailabilityList;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<BusTechAvailabilityData> getBusTechAvailabilityList() {
		return busTechAvailabilityList;
	}
	public void setBusTechAvailabilityList(List<BusTechAvailabilityData> busTechAvailabilityList) {
		this.busTechAvailabilityList = busTechAvailabilityList;
	}
	public BusTechAvailabilityDataOnDate(String date, List<BusTechAvailabilityData> busTechAvailabilityList) {
		this.date = date;
		this.busTechAvailabilityList = busTechAvailabilityList;
	}
	public BusTechAvailabilityDataOnDate() {
		this.date = null;
		this.busTechAvailabilityList = new ArrayList<BusTechAvailabilityData>();
	}
	
}
