package ru.smartsarov.bus.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrderedBusStop {
	@SerializedName("order")
    @Expose
    private Integer order;
	@SerializedName("busStopData")
    @Expose
	private BusStopData busStopData;
	@SerializedName("elapsedTime")
    @Expose
    private Integer elapsedTime;
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public BusStopData getBusStopData() {
		return busStopData;
	}
	public void setBusStopData(BusStopData busStopData) {
		this.busStopData = busStopData;
	}
	public Integer getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(Integer elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	
	public OrderedBusStop(Integer order, BusStopData busStopData, Integer elapsedTime) {
		this.order = order;
		this.busStopData = busStopData;
		this.elapsedTime = elapsedTime;
	}
	public OrderedBusStop() {
		this.order = null;
		this.busStopData = null;
		this.elapsedTime = null;
	}
	
}
