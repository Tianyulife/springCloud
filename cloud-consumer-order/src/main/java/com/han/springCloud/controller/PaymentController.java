package com.han.springCloud.controller;

import com.han.springCloud.entity.CommonResult;
import com.han.springCloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 12092
 * @since 2023-07-02
 */
@RestController
@Slf4j
@RequestMapping("/springCloud")
public class PaymentController {

//    @Autowired
//    private PaymentService paymentService;
//
//    @PostMapping("/payment/create")
//    public CommonResult<Payment> create(Payment payment){
//
//        boolean save = paymentService.save(payment);
//        log.info("插入结果是{}",save);
//        if (save){
//            return new CommonResult<>(200,"插入数据成功",payment);
//        }
//        else {
//            return new CommonResult<>(444,"插入数据失败");
//        }
//
//    }
//
//    @GetMapping("/payment/get/{id}")
//    public CommonResult<Payment> getPaymentById(@PathVariable("id")
//    Long id ){
//        Payment payment = paymentService.getById(id);
//        log.info("查询结果是{}",payment);
//        if (payment == null){
//
//            return new CommonResult<>(444,"没有对应的记录,查询id为:"+id);
//        }
//        else {
//            return new CommonResult<>(200,"查询成功",payment);
//        }
//    }

    /**
     * 基于restTemplate进行远程调用
     * 面向模板类的
     */

    private static final String PATH = "http://CLOUD-PAYMENT-SERVICE";  //从7001订阅服务

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")
    Long id ){
            CommonResult<Payment> commonResult = restTemplate.getForObject(PATH + "/payment/get/" + id, CommonResult.class);

        log.info("查询结果是{}",commonResult);

        return commonResult;
    }

    @PostMapping("/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        log.info("输入参数是{}",payment.toString());
        CommonResult commonResult = restTemplate.postForObject(PATH + "/payment/create", payment, CommonResult.class);

        log.info("插入结果是{}",commonResult);
        return commonResult;
    }


}
