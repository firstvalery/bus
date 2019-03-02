package ru.smartsarov.bus.responses;

public class BusData {
	private Integer id;
	private String vin;
	private Short yearOfIssue;
	private String make;
	private String model;
	private String garageNumber;
	private String stateNumber;
	private Short fuelCode;
	private Integer odometerMilage;
	private Integer trackerMilage;
	private String condition;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public Short getYearOfIssue() {
		return yearOfIssue;
	}
	public void setYearOfIssue(Short yearOfIssue) {
		this.yearOfIssue = yearOfIssue;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getGarageNumber() {
		return garageNumber;
	}
	public void setGarageNumber(String garageNumber) {
		this.garageNumber = garageNumber;
	}
	public String getStateNumber() {
		return stateNumber;
	}
	public void setStateNumber(String stateNumber) {
		this.stateNumber = stateNumber;
	}
	public Short getFuelCode() {
		return fuelCode;
	}
	public void setFuelCode(Short fuelCode) {
		this.fuelCode = fuelCode;
	}
	public Integer getOdometerMilage() {
		return odometerMilage;
	}
	public void setOdometerMilage(Integer odometerMilage) {
		this.odometerMilage = odometerMilage;
	}
	public Integer getTrackerMilage() {
		return trackerMilage;
	}
	public void setTrackerMilage(Integer trackerMilage) {
		this.trackerMilage = trackerMilage;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public BusData(Integer id, String vin, Short yearOfIssue, String make, String model, String garageNumber,
			String stateNumber, Short fuelCode, Integer odometerMilage, Integer trackerMilage, String condition) {
		this.id = id;
		this.vin = vin;
		this.yearOfIssue = yearOfIssue;
		this.make = make;
		this.model = model;
		this.garageNumber = garageNumber;
		this.stateNumber = stateNumber;
		this.fuelCode = fuelCode;
		this.odometerMilage = odometerMilage;
		this.trackerMilage = trackerMilage;
		this.condition = condition;
	}
	public BusData() {
		this.id = 0;
		this.vin = "";
		this.yearOfIssue = 0;
		this.make = "";
		this.model = "";
		this.garageNumber = "";
		this.stateNumber = "";
		this.fuelCode = 0;
		this.odometerMilage = 0;
		this.trackerMilage = 0;
		this.condition = "";
	}
	
	
}
