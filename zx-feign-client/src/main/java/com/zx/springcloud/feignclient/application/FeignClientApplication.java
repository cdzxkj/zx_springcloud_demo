package com.zx.springcloud.feignclient.application;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 服务消费
 * @author Nian.Li
 * @version 1.0
 * @date 2018-05-29
 */
@SpringCloudApplication
@EnableHystrix
@ComponentScan(basePackages = {"com.zx.springcloud.**"})
@EnableFeignClients(basePackages = {"com.zx.springcloud.feignclient.**"})
public class FeignClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientApplication.class, args);
    }
}
