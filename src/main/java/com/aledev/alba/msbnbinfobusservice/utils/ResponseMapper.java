package com.aledev.alba.msbnbinfobusservice.utils;

import com.aledev.alba.msbnbinfobusservice.model.BusTimes;
import com.aledev.alba.msbnbinfobusservice.web.model.BusStop;

import java.util.List;

public interface ResponseMapper {
    List<BusStop> map(List<BusTimes> times);
}
