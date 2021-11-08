package com.aledev.alba.msbnbinfobusservice.model.stops;

import org.springframework.stereotype.Component;

@Component
public class GilmertonCrossRoadToAirport implements Stop {
    @Override
    public String getStopName() {
        return "Gilmerton CrossRd (To city - Fort Kinnaird)";
    }

    @Override
    public String getStopId() {
        return "36235237";
    }
}
