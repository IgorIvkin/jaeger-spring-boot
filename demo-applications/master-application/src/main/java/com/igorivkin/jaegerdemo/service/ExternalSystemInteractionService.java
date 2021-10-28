package com.igorivkin.jaegerdemo.service;

import com.igorivkin.jaegerdemo.model.SimpleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalSystemInteractionService {

    private final RestTemplate restTemplate;

    @Autowired
    public ExternalSystemInteractionService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${app.external-service.host}")
    private String externalServiceHost;

    public SimpleModel getSimpleModel() {
        return restTemplate.getForObject(
                externalServiceHost + "/get-simple-model",
                SimpleModel.class
        );
    }
}
