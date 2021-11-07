package com.aledev.alba.msbnbinfobusservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BusInfo {
    private String busNumber;
    private String stopId;
    private String stopName;
    private String busRoute;
    private List<Schedule> busTimes;
}
