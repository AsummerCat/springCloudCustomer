package com.linjing.registerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author cxc
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RegisterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegisterServerApplication.class, args);
    }

}

