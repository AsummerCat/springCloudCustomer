package com.linjing.basiccustomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author cxc
 * @date 2019/1/10 11:12
 */
@RestController
public class BasicController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/consumer")
    public String consumer() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("test-server");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/test";
        System.out.println(url);
        return restTemplate.getForObject(url, String.class);
    }

}
