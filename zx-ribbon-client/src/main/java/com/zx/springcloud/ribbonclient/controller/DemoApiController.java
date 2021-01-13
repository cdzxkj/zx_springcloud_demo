package com.zx.springcloud.ribbonclient.controller;

import com.zx.springcloud.ribbonclient.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * demo示例
 * @author Nian.Li
 * @version 1.0
 * @date 2018-05-29
 */
@RestController
@RequestMapping("/demo")
public class DemoApiController {

    private static final Logger logger = LoggerFactory.getLogger(DemoApiController.class);

    @Autowired
    private DemoService demoService;

    @GetMapping("getData")
    public String getData(@RequestParam("id") String id) {
        logger.info("into /demo/getData id:{}",id);

        String result = demoService.getData(id);
        logger.info("/demo/getData 结果 result:{}",result);
        return result;
    }

    @GetMapping("getMapData")
    public String getMapData() {
        Map<String, Object> map= new HashMap<>();
        map.put("id", 1L);
        map.put("name", "测试一把");

        String result = demoService.getMapData(map);
        logger.info("/demo/getMapData 结果 result:{}",result);

        return result;
    }
}
