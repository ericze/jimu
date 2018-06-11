package com.zero.jimu.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import com.zero.jimu.mapper.SpaceMapper;
import com.zero.jimu.entity.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceController {
    @Autowired SpaceMapper spaceMapper;

//    @RequestMapping("/addSpace")
//    public List<User> listUser() throws Exception{
//
//        return users;
//    }
}
