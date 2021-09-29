package com.aledev.alba.msbnbinfobusservice.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Response{
	private List<BusTimes> busTimes;
}
