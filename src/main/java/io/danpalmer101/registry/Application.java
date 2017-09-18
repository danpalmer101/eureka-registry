package io.danpalmer101.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Boot based Eureka Service Registry
 */
@EnableEurekaServer
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "io.danpalmer101.registry")
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
