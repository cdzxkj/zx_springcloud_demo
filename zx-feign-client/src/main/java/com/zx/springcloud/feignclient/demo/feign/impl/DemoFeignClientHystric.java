package com.zx.springcloud.feignclient.demo.feign.impl;

import com.zx.springcloud.feignclient.demo.feign.DemoFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoFeignClientHystric implements DemoFeignClient {

    private static final Logger logger = LoggerFactory.getLogger(DemoFeignClientHystric.class);

    @Override
    public String getData(String id) {
        logger.info("DemoFeignClientHystric->getData熔断了");
        return "";
    }
}
