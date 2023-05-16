package com.practices.loginproject.samplelogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SampleloginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleloginApplication.class, args);
	}

}
