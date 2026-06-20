package com.library.repository.app.elibrary.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "custom")
public class MyCustomEndPoint {
    @ReadOperation
    public Map<String, String> customEndpoint() {
        Map<String, String> result = new HashMap<>();
        result.put("key", "value");
        return result;
    }
}
