package com.aledev.alba.msbnbinfobusservice.utils;

import com.aledev.alba.msbnbinfobusservice.model.BusTimes;
import com.aledev.alba.msbnbinfobusservice.web.model.BusInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {ScheduleMapper.class})
public interface BusInfoMapper {

    @Mapping(source = "nameService", target = "busRoute")
    @Mapping(source = "timeDatas", target = "busTimes")
    @Mapping(source = "mnemoService", target = "busNumber")
    BusInfo mapResponse(BusTimes busTimes);
}
