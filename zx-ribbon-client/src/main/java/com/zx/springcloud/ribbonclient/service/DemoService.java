package com.zx.springcloud.ribbonclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Nian.Li
 * @version 1.0
 * @date 2018-11-14
 */
@Service
public class DemoService {

    @Autowired
    private RestTemplate restTemplate;

    public String getData(String id) {
        return restTemplate.getForObject("http://ZX-RIBBON-SERVICE/api/demo/getData?id="+id,String.class);
    }
}
