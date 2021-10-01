package com.aledev.alba.msbnbinfobusservice.service;

import com.aledev.alba.msbnbinfobusservice.model.BusTimes;

import java.util.List;

public interface BusService {
    String getBusInfo();
    List<BusTimes> getBusTimes();
}
