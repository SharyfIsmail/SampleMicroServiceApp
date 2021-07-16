package com.example.microservicetest.controller;

import com.example.microservicetest.client.ControllerClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/fuckone")
@Slf4j
public class HelloController {
    private final ControllerClient controllerClient;

    @GetMapping
    public String helloFromOne() {
        return "Hello from One";
    }
    @GetMapping(    "/fromtwo")
    public ResponseEntity<String> helloFromTwo() {
        log.info("in controller 1");
        return new ResponseEntity<>(controllerClient.helloFrom()+ " " +"fuck from one", HttpStatus.OK);
    }
}
