package com.bqla.eurekasub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekasubApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekasubApplication.class, args);
    }

}
