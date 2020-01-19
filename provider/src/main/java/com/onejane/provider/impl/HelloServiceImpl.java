package com.onejane.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.onejane.api.service.HelloService;

/**
 * @ClassName: HelloServiceImpl
 * @Create By: chenxihua
 * @Author: Administrator
 * @Date: 2019/11/21 10:39
 **/
@Service()
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
