package com.wang.springcloud.controller;

import com.wang.springcloud.entities.CommonResult;
import com.wang.springcloud.entities.Payment;
import com.wang.springcloud.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author wangyu
 * @date 2021/6/17 21:07
 */
@RestController
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);

        Logger logger = LoggerFactory.getLogger(PaymentController.class);
        logger.info("******插入结果：" + result);

        if(result>0){
            return new CommonResult(200,"插入数据库成功, serverPort: " + serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Integer id){
        Payment payment = paymentService.getPaymentById(id);

        Logger logger = LoggerFactory.getLogger(PaymentController.class);
        logger.info("******查询结果：" + payment);

        if(payment != null){
            return new CommonResult(200,"查询成功! serverPort: " + serverPort,payment);
        }else{
            return new CommonResult(444,"没有对应数据，查询ID:" + id,null);
        }

    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
