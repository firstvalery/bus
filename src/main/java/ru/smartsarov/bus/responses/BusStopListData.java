package ru.smartsarov.bus.responses;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BusStopListData {
	@SerializedName("busStopListId")
    @Expose
    private Integer busStopListId;
	@SerializedName("orderedBusStop")
    @Expose
    private List<OrderedBusStop> orderedBusStop;
	public Integer getBusStopListId() {
		return busStopListId;
	}
	public void setBusStopListId(Integer busStopListId) {
		this.busStopListId = busStopListId;
	}
	public List<OrderedBusStop> getOrderedBusStop() {
		return orderedBusStop;
	}
	public void setOrderedBusStop(List<OrderedBusStop> orderedBusStop) {
		this.orderedBusStop = orderedBusStop;
	}
	public BusStopListData(Integer busStopListId, List<OrderedBusStop> orderedBusStop) {
		this.busStopListId = busStopListId;
		this.orderedBusStop = orderedBusStop;
	}
	public BusStopListData() {
		this.busStopListId = null;
		this.orderedBusStop = null;
	}
	
}
