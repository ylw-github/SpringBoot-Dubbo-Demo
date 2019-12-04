package com.ylw.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ylw.dubbo.provider.service.UserApi;

@Service(version = "1.0.0", timeout = 3000)
public class UserApiImpl implements UserApi {
    @Override
    public String getUser(Long userId) {
        System.out.println("调用getUser接口");
        return "name->yanglinwei && userId->" + userId;
    }
}
