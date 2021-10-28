package com.igorivkin.jaegerdemo.api;

import com.igorivkin.jaegerdemo.model.SimpleModel;
import com.igorivkin.jaegerdemo.service.ExternalSystemInteractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final ExternalSystemInteractionService externalSystemInteractionService;

    @Autowired
    public TestController(ExternalSystemInteractionService externalSystemInteractionService) {
        this.externalSystemInteractionService = externalSystemInteractionService;
    }

    @GetMapping("/access-external-system")
    public SimpleModel hello() {
        return externalSystemInteractionService.getSimpleModel();
    }
}
