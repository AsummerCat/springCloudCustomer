package com.linjing.feigncustomer.controller;

import com.linjing.feigncustomer.server.TestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cxc
 * @date 2019/1/10 14:49
 */
@RestController
public class TestController {
    @Autowired
    private TestServer testServer;

    @RequestMapping("test")
    public String test() {
        return testServer.test();
    }
}
