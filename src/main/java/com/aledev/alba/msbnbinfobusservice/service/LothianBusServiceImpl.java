package com.aledev.alba.msbnbinfobusservice.service;

import com.aledev.alba.msbnbinfobusservice.config.LothianApi;
import com.aledev.alba.msbnbinfobusservice.model.BusTimes;
import com.aledev.alba.msbnbinfobusservice.model.BusTimesItem;
import com.aledev.alba.msbnbinfobusservice.model.stops.Stop;
import com.aledev.alba.msbnbinfobusservice.utils.LothianFunctions;
import com.aledev.alba.msbnbinfobusservice.utils.ResponseMapper;
import com.aledev.alba.msbnbinfobusservice.web.model.BusStop;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class LothianBusServiceImpl implements BusService {

    private final RestTemplate restTemplate;
    private final LothianApi api;
    private final LothianFunctions functions;
    private final ResponseMapper responseMapper;

    private Set<Stop> lothianStops;

    public LothianBusServiceImpl(
            RestTemplateBuilder restTemplateBuilder,
            LothianApi api,
            LothianFunctions functions,
            ResponseMapper responseMapper,
            Set<Stop> lothianStops) {
        this.restTemplate = restTemplateBuilder.build();
        this.api = api;
        this.functions = functions;
        this.responseMapper = responseMapper;
        this.lothianStops = lothianStops;
    }

    @Override
    public String getBusInfo() {
        return null;
    }

    @Override
    public List<BusStop> getBusTimes() {
        String url = api.getUrl() + functions.getBusTimes(extractStops(this.lothianStops));

        ResponseEntity<BusTimesItem> times = restTemplate.getForEntity(url, BusTimesItem.class);

        if (times.getStatusCode().is2xxSuccessful() && times.getBody() != null) {
            List<BusTimes> busTimes = times.getBody().getBusTimes();

            return responseMapper.map(busTimes);
        }

        return Collections.emptyList();
    }

    private String[] extractStops(Set<Stop> stops) {
        var string = stops.stream()
                .map(Stop::getStopId)
                .toList();
        return string.toArray(new String[0]);
    }
}
