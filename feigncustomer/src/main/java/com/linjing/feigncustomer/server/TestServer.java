package com.linjing.feigncustomer.server;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author cxc
 * @date 2019/1/10 14:47
 */
@Component
//服务名称 注解只能放在类上
@FeignClient("test-server")
public interface TestServer {

    //服务的接口名称映射
    @GetMapping("/test")
    String test();
}
