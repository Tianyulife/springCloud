package com.han.springCloud.alibaba.controller;

import com.han.springCloud.entity.CommonResult;
import com.han.springCloud.entity.Payment;
import com.han.springCloud.alibaba.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/2/2023 23:15
 * @Description: com.han.springCloud.controller
 */
@RestController
public class OrderFeignController {
    @Autowired
    PaymentFeignService paymentFeignService;


    @GetMapping("consumer/payment/get/{id}")
//    @CircuitBreaker(name = "default",fallbackMethod = "GlobalFallBack")
    public CommonResult<Payment> get(@PathVariable("id") Long id){
        CommonResult<Payment> commonResult = paymentFeignService.getPaymentById(id);
        return commonResult;
    }

//    public CommonResult<Payment> GlobalFallBack(Exception exception){
//
//        return new CommonResult<>(444,"触发的全局降级处理");
//    }


}
