package com.han.springCloud.alibaba.service;

import com.han.springCloud.alibaba.service.impl.PaymentFallback;
import com.han.springCloud.entity.CommonResult;
import com.han.springCloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/2/2023 22:59
 * @Description: com.han.springCloud.service
 */
@Component
@FeignClient(name = "cloud-payment-service",fallback = PaymentFallback.class)
public interface  PaymentFeignService {
    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id );

    @PostMapping("/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment);
}
