package com.aledev.alba.msbnbinfobusservice.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Services {
	private List<String> dests;
	private String ref;
	private String mnemo;
	private String name;
	private String equipment;
	private String type;
	private String operatorId;
}
