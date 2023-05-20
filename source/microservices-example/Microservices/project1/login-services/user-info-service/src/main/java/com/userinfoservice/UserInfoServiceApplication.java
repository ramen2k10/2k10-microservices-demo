package com.userinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserInfoServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
