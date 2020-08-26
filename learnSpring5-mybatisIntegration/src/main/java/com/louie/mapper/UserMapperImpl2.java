package com.louie.mapper;

import com.louie.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;


import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    public List<User> getUser() {
        User user = new User(8,"Frank","1231");
        addUser(user);
        deleteUser(8);
        return getSqlSession().getMapper(UserMapper.class).getUser();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
