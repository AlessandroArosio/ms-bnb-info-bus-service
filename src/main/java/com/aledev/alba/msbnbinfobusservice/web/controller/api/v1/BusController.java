package com.aledev.alba.msbnbinfobusservice.web.controller.api.v1;

import com.aledev.alba.msbnbinfobusservice.service.BusService;
import com.aledev.alba.msbnbinfobusservice.web.model.BusInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/busInfo")
@RequiredArgsConstructor
public class BusController {
    private final BusService busService;

    @GetMapping("/busTimes")
    public ResponseEntity<Map<String, List<BusInfo>>> getBusTimes() {
        return new ResponseEntity<>(busService.getBusTimes(), HttpStatus.OK);
    }
}
