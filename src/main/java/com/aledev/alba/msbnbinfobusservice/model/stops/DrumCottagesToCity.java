package com.aledev.alba.msbnbinfobusservice.model.stops;

import org.springframework.stereotype.Component;

@Component
public class DrumCottagesToCity implements Stop {

    @Override
    public String getStopName() {
        return "Drum Cottages (to city)";
    }

    @Override
    public String getStopId() {
        return "36234989";
    }
}
