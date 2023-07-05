package com.han.springCloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/4/2023 13:29
 * @Description: com.han.springcCloud.alibaba
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class,args);
    }
}
