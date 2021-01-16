package com.zx.springboot.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * 启动类
 * @author Nian.Li
 * @version 1.0
 * @date 2019-10-10
 */
@SpringCloudApplication
public class GatewayRunnerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayRunnerApiApplication.class, args);
    }

}
