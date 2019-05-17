package com.sc.service;

import com.sc.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUserList();

    User getUserByOpenId(String openId);

    void addUser(User user);

}
