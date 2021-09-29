package com.aledev.alba.msbnbinfobusservice.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BusTimes {
	private Boolean globalDisruption;
	private Boolean busStopDisruption;
	private String nameService;
	private List<TimeDatas> timeDatas;
	private Boolean serviceDisruption;
	private String stopId;
	private String refService;
	private Boolean serviceDiversion;
	private String mnemoService;
	private String operatorId;
	private String stopName;
}
