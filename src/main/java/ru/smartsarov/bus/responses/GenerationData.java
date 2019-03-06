package ru.smartsarov.bus.responses;

import ru.smartsarov.bus.Constants;

public class GenerationData {
	private String date;
	private String status;
	private Boolean availability;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getAvailability() {
		return availability;
	}
	public void setAvailability(Boolean availability) {
		this.availability = availability;
	}
	public GenerationData(String date, String status, Boolean availability) {
		this.date = date;
		this.status = status;
		this.availability = availability;
	}
	public GenerationData() {
		this.date = "";
		this.status = "";
		this.availability = false;
	}
}
