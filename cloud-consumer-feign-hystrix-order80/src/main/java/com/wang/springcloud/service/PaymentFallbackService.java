package com.wang.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author wangyu
 * @date 2021/6/28 16:46
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----- PaymentFallbackService fall back - paymentInfo_OK, o(╥﹏╥)o ";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "----- PaymentFallbackService fall back - paymentInfo_Timeout, o(╥﹏╥)o ";
    }
}
