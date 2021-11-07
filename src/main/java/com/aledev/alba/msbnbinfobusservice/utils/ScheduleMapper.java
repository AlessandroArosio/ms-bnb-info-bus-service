package com.aledev.alba.msbnbinfobusservice.utils;

import com.aledev.alba.msbnbinfobusservice.model.TimeDatas;
import com.aledev.alba.msbnbinfobusservice.web.model.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ScheduleMapper {
    @Mapping(source = "nameDest", target = "busDestination")
    @Mapping(source = "time", target = "arrivalTime")
    Schedule mapResponse(TimeDatas timeDatas);
}
