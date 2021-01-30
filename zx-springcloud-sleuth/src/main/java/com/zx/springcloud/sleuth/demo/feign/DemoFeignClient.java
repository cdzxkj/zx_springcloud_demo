package com.zx.springcloud.sleuth.demo.feign;

import com.zx.springcloud.sleuth.demo.feign.impl.DemoFeignClientHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "zx-feign-client",fallback = DemoFeignClientHystric.class)
public interface DemoFeignClient {

    @GetMapping("/demo/getZipkinData")
    String getZipkinData(@RequestParam("id") String id);
}
