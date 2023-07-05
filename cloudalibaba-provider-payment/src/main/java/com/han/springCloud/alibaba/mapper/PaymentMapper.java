package com.han.springCloud.alibaba.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.han.springCloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 12092
 * @since 2023-07-02
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

}
