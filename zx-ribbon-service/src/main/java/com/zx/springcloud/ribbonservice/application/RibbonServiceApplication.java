package com.zx.springcloud.ribbonservice.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 服务提供
 * @author Nian.Li
 * @version 1.0
 * @date 2018-05-29
 */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.zx.springcloud.**"})
public class RibbonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonServiceApplication.class, args);
    }
}
