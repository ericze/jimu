package com.zero.jimu.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.zero.jimu.dao.SpaceDao;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceController {
    @Autowired
    SpaceDao spaceDao;

//    @RequestMapping("/addSpace")
//    public List<User> listUser() throws Exception{
//
//        return users;
//    }
}
