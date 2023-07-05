package com.han.springCloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.han.springCloud.alibaba.handler.FallbackAndBlockerHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/4/2023 18:46
 * @Description: com.han.springCloud.alibaba.controller
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public Object testA(){
        return "testA......";
    }

    @GetMapping("/testB")
    public Object testB(){
        return "testB......";
    }
    @GetMapping("/testHotKey/{username}")
    @SentinelResource(value = "selectUserByName", blockHandler = "selectUserByNameBlockHandler",blockHandlerClass = FallbackAndBlockerHandler.class, fallback = "selectUserByNameFallback",fallbackClass = FallbackAndBlockerHandler.class)
    public String selectUserByName(@PathVariable("username") String username) {

        if ("Tom".equalsIgnoreCase(username)){
            throw new RuntimeException("Tom要太大了，需要降级");
        }

        return "{\"userName\": " + username + ", \"age\": 25}";
    }




}
