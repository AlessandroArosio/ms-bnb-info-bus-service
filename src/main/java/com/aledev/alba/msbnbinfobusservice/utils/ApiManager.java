package com.aledev.alba.msbnbinfobusservice.utils;

import com.aledev.alba.msbnbinfobusservice.config.LothianApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RequiredArgsConstructor
public class ApiManager {
    private final LothianApi api;
    private final RestTemplate restTemplate;

}
