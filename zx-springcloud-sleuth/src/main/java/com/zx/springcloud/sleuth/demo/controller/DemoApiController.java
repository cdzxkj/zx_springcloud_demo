package com.zx.springcloud.sleuth.demo.controller;

import com.zx.springcloud.sleuth.demo.feign.DemoFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private DemoFeignClient demoFeignClient;

    @GetMapping("/getData/{id}")
    public String getData(@PathVariable("id") String id) {
        logger.info("/api/demo/getData id:{}",id);

        String result = demoFeignClient.getZipkinData(id);
        logger.info("/demo/getZipkinData 调用feign服务方的结果:{}",result);

        return "调用服务:"+applicationName+",端口:"+port+",参数id:"+id+"; >>>>>> feign调用返回的结果:"+result;
    }
}
