package com.airretailer.flight.amenity.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.airretailer.flight.amenity.service.dataaccess" })
@EntityScan(basePackages = { "om.airretailer.flight.amenity.service.dataaccess"})
@SpringBootApplication(scanBasePackages = "com.airretailer")
public class FlightAmenityServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlightAmenityServiceApplication.class, args);
    }
}

