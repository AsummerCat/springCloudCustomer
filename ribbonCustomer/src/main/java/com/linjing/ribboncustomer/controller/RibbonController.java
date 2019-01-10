package com.linjing.ribboncustomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cxc
 * @date 2019/1/10 11:12
 */
@RestController
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String consumer() {
        String url = "http://test-server/test";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }

}
