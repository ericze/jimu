package com.zero.jimu.controller;

import com.zero.jimu.entity.Space;
import com.zero.jimu.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import com.zero.jimu.service.space.SpaceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(value = "/space")
public class SpaceController {

    @Autowired
    private SpaceService spaceService;

    @ResponseBody
    @PostMapping("/add")
    public int addSpace(Space space){
        System.out.print(space);
        return spaceService.insertSpace(space);
    }

    @ResponseBody
    @GetMapping("/selectAll")
    public List<Space> selectAll(){
        return spaceService.selectAll();
    }

    @ResponseBody
    @PostMapping("/selectSpaceById")
    public Space selectSpaceById(int id){
        return spaceService.selectSpaceById(id);
    }
}
