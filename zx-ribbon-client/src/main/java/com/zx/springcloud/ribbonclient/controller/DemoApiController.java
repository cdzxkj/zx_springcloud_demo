package com.zx.springcloud.ribbonclient.controller;

import com.zx.springcloud.ribbonclient.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private DemoService demoService;

    @GetMapping("getData")
    public String getData(@RequestParam("id") String id) {
        logger.info("/api/demo/getData id:{}",id);

        return demoService.getData(id);
    }
}
