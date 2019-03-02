package ru.smartsarov.bus.responses;

import java.util.ArrayList;
import java.util.List;

public class FixedShiftData {
	private String routeName;
	private DriverData driverData;
	private ConductorData conductorData;
	private List<DepartureMomentOrderedData> shiftDepartureListId;
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
	public List<DepartureMomentOrderedData> getShiftDepartureListId() {
		return shiftDepartureListId;
	}
	public void setShiftDepartureListId(List<DepartureMomentOrderedData> shiftDepartureListId) {
		this.shiftDepartureListId = shiftDepartureListId;
	}
	public FixedShiftData(String routeName, DriverData driverData, ConductorData conductorData,
			List<DepartureMomentOrderedData> shiftDepartureListId) {
		this.routeName = routeName;
		this.driverData = driverData;
		this.conductorData = conductorData;
		this.shiftDepartureListId = shiftDepartureListId;
	}
	public FixedShiftData() {
		this.routeName = "";
		this.driverData = new DriverData();
		this.conductorData = new ConductorData();
		this.shiftDepartureListId = new ArrayList<>();
	}
}
