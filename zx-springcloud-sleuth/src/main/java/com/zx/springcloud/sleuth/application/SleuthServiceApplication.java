package com.zx.springcloud.sleuth.application;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 * @author Nian.Li
 * @version 1.0
 * @date 2018-05-29
 */
@SpringCloudApplication
@EnableHystrix
@ComponentScan(basePackages = {"com.zx.springcloud.**"})
@EnableFeignClients(basePackages = {"com.zx.springcloud.sleuth.**"})
public class SleuthServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthServiceApplication.class, args);
    }
}
