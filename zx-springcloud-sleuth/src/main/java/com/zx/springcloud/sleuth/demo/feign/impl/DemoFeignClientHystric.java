package com.zx.springcloud.sleuth.demo.feign.impl;

import com.zx.springcloud.sleuth.demo.feign.DemoFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DemoFeignClientHystric implements DemoFeignClient {

    private static final Logger logger = LoggerFactory.getLogger(DemoFeignClientHystric.class);

    @Override
    public String getZipkinData(String id) {
        logger.info("DemoFeignClientHystric->getZipkinData熔断了");
        return "";
    }
}
