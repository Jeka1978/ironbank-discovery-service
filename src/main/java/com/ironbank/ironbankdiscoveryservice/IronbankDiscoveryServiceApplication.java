package com.ironbank.ironbankdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class IronbankDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IronbankDiscoveryServiceApplication.class, args);
    }

}
