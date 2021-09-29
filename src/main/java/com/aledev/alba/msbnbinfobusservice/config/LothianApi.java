package com.aledev.alba.msbnbinfobusservice.config;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class LothianApi {

    @Value("${lothian.apikey}")
    private String apiKey;

    @Value("${lothian.bus.base-url}")
    private String baseUrl;

    @Scheduled(cron = "@hourly")
    public String getUrl() {
        return baseUrl + encryptKeyWithDate();
    }

    private String encryptKeyWithDate() {
        var formatter = DateTimeFormatter.ofPattern("yyyyMMddHH");
        String timestamp = LocalDateTime.now().format(formatter);

        return DigestUtils.md5Hex(System.getenv(apiKey) + timestamp);
    }
}
