package com.han.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/2/2023 22:38
 * @Description: com.han.springCloud
 */
@SpringBootApplication
@EnableFeignClients
public class OpenFeignApplication {
    public static void main(String[] args) {

        SpringApplication.run(OpenFeignApplication.class, args);
    }
}