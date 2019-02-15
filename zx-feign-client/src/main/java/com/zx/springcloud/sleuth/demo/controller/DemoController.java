package com.zx.springcloud.sleuth.demo.controller;

import com.zx.springcloud.sleuth.demo.feign.DemoFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * demo示例
 * @author Nian.Li
 * @version 1.0
 * @date 2018-05-29
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

	@Autowired
    private DemoFeignClient demoFeignClient;
	
    @RequestMapping(value = "/getData", method = RequestMethod.GET)
    @ResponseBody
    public String getData(String id) {
        logger.info("/demo/getData id:{}",id);
        String result = demoFeignClient.getData(id);
        return result;
    }
}
