package com.zx.springcloud.configclient.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author Nian.Li
 * @version 1.0
 * @date 2018-05-29
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.zx.springcloud.**"})
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
