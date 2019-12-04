package com.ylw.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ylw.dubbo.provider.service.UserApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Reference(version = "1.0.0", timeout = 300)
    UserApi userApi;

    @RequestMapping("/getInfo")
    public String getUserInfo() {
        return userApi.getUser(666l);
    }
}
