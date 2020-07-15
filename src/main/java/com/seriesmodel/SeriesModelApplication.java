package com.seriesmodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SeriesModelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeriesModelApplication.class, args);
	}

}
