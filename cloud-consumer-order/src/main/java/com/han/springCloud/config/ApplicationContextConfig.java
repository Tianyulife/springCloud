package com.han.springCloud.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/2/2023 13:49
 * @Description: com.han.springCloud.config
 */
@SpringBootConfiguration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced // restTemplate + loadbalancer 开启轮询 负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
