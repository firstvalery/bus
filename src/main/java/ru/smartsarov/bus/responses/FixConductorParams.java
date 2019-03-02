package ru.smartsarov.bus.responses;

public class FixConductorParams {
    private Integer conductorId;
    private Integer shiftId;
    private String date;
	public Integer getConductorId() {
		return conductorId;
	}
	public void setConductorId(Integer conductorId) {
		this.conductorId = conductorId;
	}
	public Integer getShiftId() {
		return shiftId;
	}
	public void setShiftId(Integer shiftId) {
		this.shiftId = shiftId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public FixConductorParams(Integer conductorId, Integer shiftId, String date) {
		this.conductorId = conductorId;
		this.shiftId = shiftId;
		this.date = date;
	}
	public FixConductorParams() {
		this.conductorId = 0;
		this.shiftId = 0;
		this.date = "";
	}
	
}
