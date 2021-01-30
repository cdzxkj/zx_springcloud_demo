package com.zx.springcloud.feignclient.demo.feign;

import com.zx.springcloud.feignclient.demo.feign.impl.DemoFeignClientHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "zx-feign-service",fallback = DemoFeignClientHystric.class)
public interface DemoFeignClient {
	
    @GetMapping("/api/demo/getData")
    String getData(@RequestParam("id") String id);


    @GetMapping("/api/demo/getZipkinData")
    String getZipkinData(@RequestParam("id") String id);
}
