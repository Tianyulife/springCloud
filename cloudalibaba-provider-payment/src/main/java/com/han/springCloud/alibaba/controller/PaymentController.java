package com.han.springCloud.alibaba.controller;


import com.han.springCloud.entity.CommonResult;
import com.han.springCloud.entity.Payment;
import com.han.springCloud.alibaba.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private Integer port;

    @PostMapping("/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        log.info("输入参数是{}",payment.toString());
        boolean save = paymentService.save(payment);
        log.info("插入结果是{}",save);
        if (save){
            return new CommonResult<>(200,"插入数据成功",payment);
        }
        else {
            return new CommonResult<>(444,"插入数据失败");
        }

    }

    @GetMapping("/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")
    Long id ){
//        try {
//            TimeUnit.SECONDS.sleep(15);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        Payment payment =  paymentService.getById(id);
        log.info("查询结果是{}",payment);
        if (payment == null){

            return new CommonResult<>(444,"没有对应的记录,查询id为:"+id);
        }
        else {
            return new CommonResult<>(200,"在端口号为"+ port+" 处查询成功",payment);
        }
    }

}
