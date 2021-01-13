package com.zx.springcloud.ribbonclient.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

/**
 * @author Nian.Li
 * @version 1.0
 * @date 2018-11-14
 */
@Service
public class DemoService {

    private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

    @Autowired
    private RestTemplate restTemplate;

    public String getData(String id) {
        logger.info("DemoService->getData id:{}",id);
        return restTemplate.getForObject("http://ZX-RIBBON-SERVICE/api/demo/getData?id="+id,String.class);
    }

    public String getMapData(Map<String, Object> map) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            logger.info("DemoService->getMapData map:{}",mapper.writeValueAsString(map));
        } catch (Exception e) {
            logger.error("参数处理异常 e",e);
        }

        ResponseEntity<String> response = restTemplate.postForEntity("http://ZX-RIBBON-SERVICE/api/demo/getMapData", map, String.class);

        return response.getBody();
    }
}
