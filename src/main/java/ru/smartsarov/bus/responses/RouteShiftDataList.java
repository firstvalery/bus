package ru.smartsarov.bus.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RouteShiftDataList {
	@SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("shiftType")
    @Expose
    private String shiftType;
    @SerializedName("shiftDepartureListid")
    @Expose
    private Integer shiftDepartureListId;
	public Integer getId() {
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
	public String getShiftType() {
		return shiftType;
	}
	public void setShiftType(String shiftType) {
		this.shiftType = shiftType;
	}
	public Integer getShiftDepartureListId() {
		return shiftDepartureListId;
	}
	public void setShiftDepartureListId(Integer shiftDepartureListId) {
		this.shiftDepartureListId = shiftDepartureListId;
	}
	public RouteShiftDataList(Integer id, String name, String shiftType, Integer shiftDepartureListId) {
		this.id = id;
		this.name = name;
		this.shiftType = shiftType;
		this.shiftDepartureListId = shiftDepartureListId;
	}
	public RouteShiftDataList() {
		this.id = 0;
		this.name = "";
		this.shiftType = "";
		this.shiftDepartureListId = 0;
	}
    
    
}
