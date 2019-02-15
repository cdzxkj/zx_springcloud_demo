package com.zx.springcloud.sleuth.demo.feign.impl;

import com.zx.springcloud.sleuth.demo.feign.DemoFeignClient;
import org.springframework.stereotype.Component;

@Component
public class DemoFeignClientHystric implements DemoFeignClient {
	
	@Override
    public String getData(String id) {
        return "熔断"+id;
    }
}
