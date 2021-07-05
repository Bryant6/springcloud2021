package com.wang.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangyu
 * @date 2021/7/5 15:12
 */
@RestController
public class FlowLimitController {

    @GetMapping(value = "/testA")
    public String testA(){
        return "------------test A .";
    }

    @GetMapping(value = "/testB")
    public String testB(){
        return "------------test B .";
    }
}
