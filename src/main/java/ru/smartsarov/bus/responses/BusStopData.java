package ru.smartsarov.bus.responses;

import java.math.BigDecimal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BusStopData {
	 @SerializedName("id")
	    @Expose
	    private Integer id;
	 @SerializedName("name")
	    @Expose
	    private String name;
	 @SerializedName("lon")
	    @Expose
	    private BigDecimal longitude;
	 @SerializedName("lat")
	    @Expose
	    private BigDecimal latitude;
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getLongitude() {
		return longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public BigDecimal getLatitude() {
		return latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public BusStopData(Integer id, String name, BigDecimal longitude, BigDecimal latitude) {
		this.id = id;
		this.name = name;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public BusStopData() {
		this.id = null;
		this.name = "";
		this.longitude = null;
		this.latitude = null;
	}
	 
	 
}
