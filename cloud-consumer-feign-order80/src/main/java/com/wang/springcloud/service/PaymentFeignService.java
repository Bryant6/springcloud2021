package com.wang.springcloud.service;

import com.wang.springcloud.entities.CommonResult;
import com.wang.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author wangyu
 * @date 2021/6/27 14:17
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")   //找哪个微服务
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id);

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
