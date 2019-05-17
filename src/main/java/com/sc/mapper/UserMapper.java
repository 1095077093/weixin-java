package com.sc.mapper;

import com.sc.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getUserList();

    User getUserByOpenId(String openId);

    void addUser(User user);
}
