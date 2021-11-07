package com.aledev.alba.msbnbinfobusservice.service;

import com.aledev.alba.msbnbinfobusservice.web.model.BusInfo;

import java.util.List;
import java.util.Map;

public interface BusService {
    String getBusInfo();
    Map<String, List<BusInfo>> getBusTimes();
}
