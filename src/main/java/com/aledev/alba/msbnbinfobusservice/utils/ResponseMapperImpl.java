package com.aledev.alba.msbnbinfobusservice.utils;

import com.aledev.alba.msbnbinfobusservice.model.BusTimes;
import com.aledev.alba.msbnbinfobusservice.web.model.BusInfo;
import com.aledev.alba.msbnbinfobusservice.web.model.BusStop;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class ResponseMapperImpl implements ResponseMapper {
    private final BusInfoMapper busInfoMapper;

    @Override
    public List<BusStop> map(List<BusTimes> times) {
        Map<String, List<BusTimes>> stopsMap = times.stream()
                .collect(Collectors.groupingBy(BusTimes::getStopId));

        return stopsMap.entrySet()
                .stream()
                .map(entry -> {
                    List<BusTimes> value = entry.getValue();
                    List<BusInfo> busInfos = value.stream().map(busInfoMapper::mapResponse).toList();
                    return BusStop.builder()
                            .stopId(entry.getKey())
                            .stopName(getBusStopName(entry.getKey(), value))
                            .busRoute(getBusRoute(entry.getKey(), value))
                            .busInfos(busInfos)
                            .build();
                })
                .toList();
    }

    private String getBusStopName(String id, List<BusTimes> value) {
        return value.stream()
                .filter(stopName -> stopName.getStopId().equals(id))
                .map(BusTimes::getStopName)
                .findFirst()
                .orElse("");
    }

    private String getBusRoute(String route, List<BusTimes> value) {
        return value.stream()
                .filter(bus -> bus.getStopId().equals(route))
                .map(BusTimes::getNameService)
                .findFirst()
                .orElse("");
    }
}
