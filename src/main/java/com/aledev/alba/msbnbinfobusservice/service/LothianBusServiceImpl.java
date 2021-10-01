package com.aledev.alba.msbnbinfobusservice.service;

import com.aledev.alba.msbnbinfobusservice.config.LothianApi;
import com.aledev.alba.msbnbinfobusservice.model.BusTimes;
import com.aledev.alba.msbnbinfobusservice.model.BusTimesItem;
import com.aledev.alba.msbnbinfobusservice.utils.LothianFunctions;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LothianBusServiceImpl implements BusService {
    public static final String DRUM_COTTAGES_TO_CITY_ID = "36234989";
    public static final String DRUM_COTTAGES_FROM_CITY_ID = "36235235";

    private final RestTemplate restTemplate;
    private final LothianApi api;
    private final LothianFunctions functions;

    public LothianBusServiceImpl(RestTemplateBuilder restTemplateBuilder, LothianApi api, LothianFunctions functions) {
        this.restTemplate = restTemplateBuilder.build();
        this.api = api;
        this.functions = functions;
    }

    @Override
    public String getBusInfo() {
        return null;
    }

    @Override
    public List<BusTimes> getBusTimes() {
        String url = api.getUrl() + functions.getBusTimes(DRUM_COTTAGES_TO_CITY_ID, DRUM_COTTAGES_FROM_CITY_ID);

        ResponseEntity<BusTimesItem> times = restTemplate.getForEntity(url, BusTimesItem.class);

        if (times.getStatusCode().is2xxSuccessful()) {
            return times.getBody().getBusTimes();
        }
        return null;
    }
}
