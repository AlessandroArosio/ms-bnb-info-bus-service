package com.aledev.alba.msbnbinfobusservice.utils;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
public class LothianFunctions {
    private static final String FUNCTION = "&function=";

    public String getGetBusStops() {
        return FUNCTION + "getBusStops";
    }

    public String getServices() {
        return FUNCTION + "getServices";
    }

    public String getBusTimes(@NotNull String stopId) {
        return FUNCTION + "getBusTimes&stopId=" + stopId;
    }

    public String getBusTimes(@NotNull String... stopIds) {
        var sb = new StringBuilder();
        for (int i = 0; i < stopIds.length; i++) {
            sb.append("stopId");
            sb.append(i+1);
            sb.append("=");
            sb.append(stopIds[i]);
            sb.append("&");
        }

        return FUNCTION + "getBusTimes&" + sb.substring(0, sb.length() -1);
    }
}
