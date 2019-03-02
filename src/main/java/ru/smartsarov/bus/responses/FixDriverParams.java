package ru.smartsarov.bus.responses;

public class FixDriverParams {

    private Integer driverId;

    private Integer shiftId;

    private String date;

	public Integer getDriverId() {
		return driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
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

	public FixDriverParams(Integer driverId, Integer shiftId, String date) {
		this.driverId = driverId;
		this.shiftId = shiftId;
		this.date = date;
	}
	public FixDriverParams() {
		this.driverId = 0;
		this.shiftId = 0;
		this.date = null;
	}
    
}
