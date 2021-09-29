package com.aledev.alba.msbnbinfobusservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TimeDatas {
	private String nameDest;
	private String busId;
	private Integer minutes;
	private String reliability;
	private String refDest;
	private String equipment;
	private String type;
	private String journeyId;
	private String terminus;
	private String time;
	private String event;
	private Integer day;
	private String vehicleStatus;
}
