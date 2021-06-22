package com.wang.springcloud.service;

import com.wang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangyu
 * @date 2021/6/17 21:00
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Integer id);
}
