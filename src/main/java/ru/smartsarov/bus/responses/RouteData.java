package ru.smartsarov.bus.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RouteData {
	@SerializedName("id")
    @Expose
    private Integer id;
	@SerializedName("busStopListId")
    @Expose
    private Integer busStopListId;
	@SerializedName("trackId")
    @Expose
    private Integer trackId;
	@SerializedName("name")
    @Expose
    private String name;
	@SerializedName("dayType")
    @Expose
    private String dayType;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBusStopListId() {
		return busStopListId;
	}
	public void setBusStopListId(Integer busStopListId) {
		this.busStopListId = busStopListId;
	}
	public Integer getTrackId() {
		return trackId;
	}
	public void setTrackId(Integer trackId) {
		this.trackId = trackId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDayType() {
		return dayType;
	}
	public void setDayType(String dayType) {
		this.dayType = dayType;
	}
	public RouteData(Integer id, Integer busStopListId, Integer trackId, String name, String dayType) {
		this.id = id;
		this.busStopListId = busStopListId;
		this.trackId = trackId;
		this.name = name;
		this.dayType = dayType;
	}
	public RouteData() {
		this.id = null;
		this.busStopListId = null;
		this.trackId = null;
		this.name = "";
		this.dayType = "";
	}
	
	
}
