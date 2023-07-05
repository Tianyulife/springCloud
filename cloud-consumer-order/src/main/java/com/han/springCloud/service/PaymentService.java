package com.han.springCloud.service;


import com.han.springCloud.entity.Payment;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 12092
 * @since 2023-07-02
 */
public interface PaymentService  {

    public boolean save(Payment payment);

    public Payment getById(Long id);
}
