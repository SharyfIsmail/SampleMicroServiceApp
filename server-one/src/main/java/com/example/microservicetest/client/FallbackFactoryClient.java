package com.example.microservicetest.client;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FallbackFactoryClient implements FallbackFactory<ControllerClient> {
    @Override
    public ControllerClient create(Throwable cause) {
        return new ControllerClient() {
            @Override
            public String helloFrom() {
                return "aaaaaaa";
            }
        };
    }
}
