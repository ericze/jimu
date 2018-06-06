package com.zero.jimu.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import com.zero.jimu.mapper.UserMapper;
import com.zero.jimu.entity.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired UserMapper userMapper;

    @RequestMapping("/userList")
    public List<User> listUser() throws Exception{
        List<User> users = userMapper.findAll();
        return users;
    }
}
