package com.aledev.alba.msbnbinfobusservice.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class LothianApiTest {

    @Autowired
    LothianApi lothianApi;

    @Test
    void name() {
        String url = lothianApi.getUrl();

        assertThat(url).contains("http://ws.mybustracker.co.uk/?module=json");
    }
}
