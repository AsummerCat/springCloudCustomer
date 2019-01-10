package com.linjing.registerserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @Autowired
    DiscoveryClient discoveryClient;

    @RequestMapping("test")
    public String info(HttpServletRequest request) {
        int port = request.getLocalPort();
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services + ",当前端口号:" + port;
    }
}