package ru.smartsarov.bus.responses;


import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RouteScheduleData {
	    @SerializedName("departureListId")
	    @Expose
	    private Integer departureListId;	
	 
	    @SerializedName("orderedDepartureMomentList")
	    @Expose
	    private List<DepartureMomentOrderedData> orderedDepartureMomentList;

		public Integer getDepartureListId() {
			return departureListId;
		}

		public void setDepartureListId(Integer departureListId) {
			this.departureListId = departureListId;
		}

		public List<DepartureMomentOrderedData> getStartTime() {
			return orderedDepartureMomentList;
		}

		public void setStartTime(List<DepartureMomentOrderedData> startTime) {
			this.orderedDepartureMomentList = startTime;
		}

		public RouteScheduleData(Integer departureListId, List<DepartureMomentOrderedData> orderedDepartureMomentList) {
			this.departureListId = departureListId;
			this.orderedDepartureMomentList = orderedDepartureMomentList;
		}	
		public RouteScheduleData() {
			this.departureListId = null;
			this.orderedDepartureMomentList = null;
		}

		     
}
