package ru.smartsarov.bus.responses;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RouteShiftData {
	    @SerializedName("id")
	    @Expose
	    private Integer id;
	    @SerializedName("name")
	    @Expose
	    private String name;
	    @SerializedName("shiftType")
	    @Expose
	    private String shiftType;
	    @SerializedName("shiftDepartureList")
	    @Expose
	    private List<DepartureMomentOrderedData> shiftDepartureListId;
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
		public List<DepartureMomentOrderedData> getShiftDepartureListId() {
			return shiftDepartureListId;
		}
		public void setShiftDepartureListId(List<DepartureMomentOrderedData> shiftDepartureListId) {
			this.shiftDepartureListId = shiftDepartureListId;
		}
		public RouteShiftData(Integer id, String name, String shiftType,
				List<DepartureMomentOrderedData> shiftDepartureListId) {
			this.id = id;
			this.name = name;
			this.shiftType = shiftType;
			this.shiftDepartureListId = shiftDepartureListId;
		}
		
		public RouteShiftData() {
			this.id = 0;
			this.name = "";
			this.shiftType = "";
			this.shiftDepartureListId = null;
		}
	    
	    
	     
}
