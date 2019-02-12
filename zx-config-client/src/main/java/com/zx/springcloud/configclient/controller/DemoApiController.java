package com.zx.springcloud.configclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @Value("${my.data.name}")
    private String myDataName;

    @GetMapping("/getMyDataName")
    public String getMyDataName() {
        logger.info("/api/demo/getName myDataName:{}",myDataName);

        return myDataName;
    }
}
