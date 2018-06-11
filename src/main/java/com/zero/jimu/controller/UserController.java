package com.zero.jimu.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import com.zero.jimu.dao.UserDao;
import com.zero.jimu.entity.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/userList")
    public List<User> listUser() throws Exception{
        List<User> users = userDao.findAll();
        return users;
    }
}
