package com.zero.jimu.service.user.impl;

import com.zero.jimu.dao.UserDao;
import com.zero.jimu.entity.User;
import com.zero.jimu.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAllUser(){
        List<User> users = userDao.findAll();
        return users;
    }
}
