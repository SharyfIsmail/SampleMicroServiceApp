package com.example.microservicetest.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateWayController {
    @GetMapping("/fuck")
    public String someMethod() {
        return "fuck OFF";
    }
}
