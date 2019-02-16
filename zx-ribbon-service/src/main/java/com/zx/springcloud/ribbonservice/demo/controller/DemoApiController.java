package com.zx.springcloud.ribbonservice.demo.controller;

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

    @GetMapping("getData")
    public String getData(String id) {
        logger.info("/api/demo/getData id:{}",id);

        return "api_demo_"+id+">>>>>>>port:"+port;
    }
}
