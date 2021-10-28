package com.igorivkin.serviceapplication.api;

import com.igorivkin.serviceapplication.model.SimpleModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalSystemController {

    @GetMapping("/get-simple-model")
    public SimpleModel accessExternalSystem() {
        return SimpleModel.builder()
                .firstName("Igor")
                .lastName("Ivkin")
                .build();
    }
}
