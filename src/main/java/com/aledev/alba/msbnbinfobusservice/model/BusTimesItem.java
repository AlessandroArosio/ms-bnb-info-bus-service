package com.aledev.alba.msbnbinfobusservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
//@Builder
@NoArgsConstructor
public class BusTimesItem {
    private List<BusTimes> busTimes;
}
