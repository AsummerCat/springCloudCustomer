package com.linjing.feigncustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author cxc
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeignCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignCustomerApplication.class, args);
    }

}

