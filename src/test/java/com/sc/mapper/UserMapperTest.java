package com.sc.mapper;

import com.sc.WxWkyApplicationTests;
import com.sc.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest extends WxWkyApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void getUserList(){
        List<User> userList = userMapper.getUserList();
        System.out.println(userList);
    }

    @Test
    public void getUserByOpenId(){
        User user = userMapper.getUserByOpenId("101");
        System.out.println(user);
    }

    @Test
    public void addUser(){
        User user = new User();
        user.setUserName("wanghaha");
        user.setOpenId("123");
        userMapper.addUser(user);
    }




}