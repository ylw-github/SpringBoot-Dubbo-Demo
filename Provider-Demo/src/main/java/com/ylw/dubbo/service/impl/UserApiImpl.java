package com.ylw.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ylw.dubbo.service.UserApi;
import com.ylw.dubbo.service.entity.User;

import java.util.UUID;

@Service(version = "${application.version}")
public class UserApiImpl implements UserApi {

    @Override
    public String addUser(User user) {
        return "添加用户成功";
    }

    @Override
    public String deleteUser(String userId) {
        return "删除用户成功";
    }

    @Override
    public String updateUser(User user) {
        return "更新用户成功";
    }

    @Override
    public User getUser(String userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("ylw");
        user.setAge(10000);
        user.setSex("male");
        user.setBlog("https://blog.csdn.net/qq_20042935");
        return user;
    }
}
