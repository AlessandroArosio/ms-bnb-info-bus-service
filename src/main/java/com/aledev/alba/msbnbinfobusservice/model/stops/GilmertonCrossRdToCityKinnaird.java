package com.aledev.alba.msbnbinfobusservice.model.stops;

import org.springframework.stereotype.Component;

@Component
public class GilmertonCrossRdToCityKinnaird implements Stop {
    @Override
    public String getStopName() {
        return "Gilmerton CrossRd (To airport";
    }

    @Override
    public String getStopId() {
        return "36234987";
    }
}
