package com.aledev.alba.msbnbinfobusservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Schedule {
    private String busDestination;
    private Integer minutes;
    private String arrivalTime;

}
