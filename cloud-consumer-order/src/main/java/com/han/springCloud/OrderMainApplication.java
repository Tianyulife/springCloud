package com.han.springCloud;

import com.han.springCloud.config.LoadBalancerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/2/2023 13:45
 * @Description: com.han.springCloud
 */
@SpringBootApplication
//调用指定的服务 采取指定的规则
@LoadBalancerClient(name = "CLOUD-PAYMENT-SERVICE", configuration = LoadBalancerConfig.class)
public class OrderMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderMainApplication.class, args);
    }
}
