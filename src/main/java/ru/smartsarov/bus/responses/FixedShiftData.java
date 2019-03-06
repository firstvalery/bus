package ru.smartsarov.bus.responses;

import java.util.ArrayList;
import java.util.List;

public class FixedShiftData {
	private String routeName;
	private DriverData driverData;
	private ConductorData conductorData;
	private List<DepartureMomentOrderedData> shiftDepartureList;
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public DriverData getDriverData() {
		return driverData;
	}
	public void setDriverData(DriverData driverData) {
		this.driverData = driverData;
	}
	public ConductorData getConductorData() {
		return conductorData;
	}
	public void setConductorData(ConductorData conductorData) {
		this.conductorData = conductorData;
	}
	public List<DepartureMomentOrderedData> getShiftDepartureList() {
		return shiftDepartureList;
	}
	public void setShiftDepartureList(List<DepartureMomentOrderedData> shiftDepartureList) {
		this.shiftDepartureList = shiftDepartureList;
	}
	public FixedShiftData(String routeName, DriverData driverData, ConductorData conductorData,
			List<DepartureMomentOrderedData> shiftDepartureList) {
		this.routeName = routeName;
		this.driverData = driverData;
		this.conductorData = conductorData;
		this.shiftDepartureList = shiftDepartureList;
	}
	public FixedShiftData() {
		this.routeName = "";
		this.driverData = new DriverData();
		this.conductorData = new ConductorData();
		this.shiftDepartureList = new ArrayList<>();
	}
}
