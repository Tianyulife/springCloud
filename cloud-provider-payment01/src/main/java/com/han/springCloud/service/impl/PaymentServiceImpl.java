package com.han.springCloud.service.impl;


import com.han.springCloud.entity.Payment;
import com.han.springCloud.mapper.PaymentMapper;
import com.han.springCloud.service.PaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 12092
 * @since 2023-07-02
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {

}
