package com.aledev.alba.msbnbinfobusservice.service;

import com.aledev.alba.msbnbinfobusservice.web.model.BusStop;

import java.util.List;

public interface BusService {
    String getBusInfo();
    List<BusStop> getBusTimes();
}
