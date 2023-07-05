package com.han.springCloud.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/3/2023 11:16
 * @Description: com.han.springCloud.config
 */
@Configuration
public class openfeignConfig {
    @Bean
    public Retryer retryer(){
        return new Retryer.Default();
    }


}
