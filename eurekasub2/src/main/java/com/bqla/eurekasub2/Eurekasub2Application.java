package com.bqla.eurekasub2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurekasub2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekasub2Application.class, args);
    }

}
