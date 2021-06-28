package com.wang.springcloud.service;

/**
 * @author wangyu
 * @date 2021/6/28 14:36
 */
public interface PaymentService {
    public String paymentInfo_OK(Integer id);

    public String paymentInfo_Timeout(Integer id);

    public String paymentCircuitBreaker(Integer id);
}
