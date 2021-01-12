package com.zx.springcloud.feignclient.demo.controller;

import com.zx.springcloud.feignclient.demo.feign.DemoFeignClient;
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
@RequestMapping("/demo")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

	@Autowired
    private DemoFeignClient demoFeignClient;

    @GetMapping("getData")
    public String getData(String id) {
        logger.info("/demo/getData id:{}",id);
        String result = demoFeignClient.getData(id);
        logger.info("调用feign服务方的结果:{}",result);

        return "调用feign服务方的数据是："+result;
    }
}
