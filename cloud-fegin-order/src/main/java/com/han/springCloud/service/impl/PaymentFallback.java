package com.han.springCloud.service.impl;

import com.han.springCloud.entity.CommonResult;
import com.han.springCloud.entity.Payment;
import com.han.springCloud.service.PaymentFeignService;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Auther: 12092
 * @Date: 7/3/2023 13:14
 * @Description: com.han.springCloud.service.impl
 */

@Component
public class PaymentFallback implements PaymentFeignService {
    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        return new CommonResult<>(444,"服务访问时间超时");
    }

    @Override
    public CommonResult<Payment> create(Payment payment) {
        return  new CommonResult<>(444,"服务访问时间超时");
    }
}
