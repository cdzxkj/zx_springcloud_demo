package com.zx.springcloud.ribbonservice.demo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @PostMapping("getMapData")
    public String getMapData(@RequestBody Map<String,Object> map) {
        ObjectMapper mapper = new ObjectMapper();
        String mapStr = "";
        try {
            mapStr = mapper.writeValueAsString(map);
            logger.info("/api/demo/getMapData map:{}", mapStr);
        } catch (Exception e) {
            logger.error("参数处理异常 e",e);
        }

        return applicationName+":"+port+",接收到参数 map:"+mapStr;
    }
}
