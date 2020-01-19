package com.onejane.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.onejane.api.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HelloController
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2019/11/21 10:46
 **/
@RestController
public class HelloController {


    @Reference
    HelloService helloService;


    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam String name){
        return helloService.sayHello(name);
    }

}
