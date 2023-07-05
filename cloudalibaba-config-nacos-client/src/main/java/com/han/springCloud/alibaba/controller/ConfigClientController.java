package com.han.springCloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/4/2023 15:06
 * @Description: com.han.springCloud.alibaba.controller
 */
@RestController
@RefreshScope  //自动获取最新的配置
public class ConfigClientController {

    @Value("${config.info}")
    private String info;

    @GetMapping("/config/info")
    public String info(){
        return info;
    }

}
