package com.xinput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xinput
 * @date 2018-11-28 22:38
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaClientApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApp.class, args);
    }
}
