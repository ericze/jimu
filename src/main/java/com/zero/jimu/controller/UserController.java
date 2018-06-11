package com.zero.jimu.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import com.zero.jimu.dao.UserDao;
import com.zero.jimu.entity.User;
import org.springframework.web.bind.annotation.RestController;

import com.zero.jimu.service.user.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public List<User> listUser() throws Exception{
        return userService.findAllUser();
    }
}
