package com.ylw.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ylw.dubbo.service.UserApi;
import com.ylw.dubbo.service.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Reference(version = "${application.version}")
    UserApi userApi;

    @RequestMapping("/addUser")
    public String addUser(User user) {
        return userApi.addUser(user);
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(String userId) {
        return userApi.deleteUser(userId);
    }

    @RequestMapping("/updateUser")
    public String updateUser(User user) {
        return userApi.updateUser(user);
    }

    @RequestMapping("/getUser")
    public User getUser(String userId) {
        return userApi.getUser(userId);
    }
}
