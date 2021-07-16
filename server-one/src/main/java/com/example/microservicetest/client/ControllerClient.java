package com.example.microservicetest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "server-two", fallbackFactory = FallbackFactoryClient.class)
@RequestMapping("/two")
public interface ControllerClient {
    @GetMapping
    String helloFrom();
}
