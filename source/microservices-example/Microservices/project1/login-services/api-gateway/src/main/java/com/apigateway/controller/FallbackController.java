package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    
    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){
        return "User service is currently down";
    }

    @GetMapping("/propertyServiceFallback")
    public String propertyServiceFallback(){
        return "Property service is currently down";
    }
}
