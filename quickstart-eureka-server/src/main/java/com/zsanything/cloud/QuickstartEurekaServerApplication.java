package com.zsanything.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QuickstartEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickstartEurekaServerApplication.class, args);
    }
}
