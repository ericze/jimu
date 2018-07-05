package com.zero.jimu.service.user.impl;

import com.zero.jimu.dao.UserDao;
import com.zero.jimu.entity.User;
import com.zero.jimu.service.user.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAllUser(){
        List<User> users = userDao.findAll();.
        return users;
    }

    @Override
    public User findByOpenIdLike(String openid){
        return userDao.findByOpenIdLike(openid);
    }

    @Override
    public int insertUser(@Param("user")User user){
        if(1==userDao.insertUser(user)){
            return user.getId();
        }else {
            return 0;
        }
    }
}
