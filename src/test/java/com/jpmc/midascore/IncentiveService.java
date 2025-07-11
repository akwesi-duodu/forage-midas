package com.jpmc.midascore;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class IncentiveService {
    private final RestTemplate restTemplate;

    public IncentiveService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public double getIncentiveAmount(Transaction transaction) {
        String apiUrl = "http://localhost:8080/incentive";
        Incentive incentive = restTemplate.postForObject(apiUrl, transaction, Incentive.class);
        return incentive != null ? incentive.getAmount() : 0.0;
    }
}