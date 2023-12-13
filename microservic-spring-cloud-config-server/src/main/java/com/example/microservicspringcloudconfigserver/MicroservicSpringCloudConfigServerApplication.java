package com.example.microservicspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MicroservicSpringCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicSpringCloudConfigServerApplication.class, args);
    }

}
