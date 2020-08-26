package com.louie.mapper;

import com.louie.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> getUser();

    int addUser(User user);

    int deleteUser(@Param("id") int id);
}
