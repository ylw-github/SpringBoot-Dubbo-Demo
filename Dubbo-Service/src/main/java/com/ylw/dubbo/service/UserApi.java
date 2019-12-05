package com.ylw.dubbo.service;

import com.ylw.dubbo.service.entity.User;

public interface UserApi {

    String addUser(User user);

    String deleteUser(String userId);

    String updateUser(User user);

    User getUser(String userId);
}
