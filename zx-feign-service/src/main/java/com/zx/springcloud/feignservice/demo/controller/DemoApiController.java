package com.zx.springcloud.feignservice.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * demo示例
 * @author Nian.Li
 * @version 1.0
 * @date 2018-05-29
 */
@RestController
@RequestMapping("/api/demo")
public class DemoApiController {

    private static final Logger logger = LoggerFactory.getLogger(DemoApiController.class);

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("getData")
    public String getData(String id) {
        logger.info("/api/demo/getData id:{}",id);

        return applicationName+":"+port+",接收到参数id:"+id;
    }

    /**
     * 用于测试zipkin的
     * @param id
     * @return
     */
    @GetMapping("getZipkinData")
    public String getZipkinData(String id) {
        logger.info("/api/demo/getZipkinData id:{}",id);

        return "调用服务:"+applicationName+",端口:"+port+",参数id:"+id;
    }
}
