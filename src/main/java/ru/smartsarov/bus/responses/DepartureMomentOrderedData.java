package ru.smartsarov.bus.responses;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DepartureMomentOrderedData {
	 @SerializedName("id")
	    @Expose
	    private Integer id;	
	 @SerializedName("order")
	    @Expose
	    private Integer order;
	 @SerializedName("startTime")
	    @Expose
	    private String startTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public DepartureMomentOrderedData(Integer id, Integer order, String startTime) {
		this.id = id;
		this.order = order;
		this.startTime = startTime;
	}
	 
	public DepartureMomentOrderedData() {
		this.id = null;
		this.order = null;
		this.startTime = null;
	}
}
