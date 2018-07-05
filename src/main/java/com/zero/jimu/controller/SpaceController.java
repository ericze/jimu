package com.zero.jimu.controller;

import com.zero.jimu.entity.Space;

import org.springframework.beans.factory.annotation.Autowired;

import com.zero.jimu.service.space.SpaceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping(value = "/space")
public class SpaceController {

    @Autowired
    private SpaceService spaceService;

    @ResponseBody
    @PostMapping("/add")
    public Map<String,Object> addSpace(Space space){
        Map<String,Object> map=new HashMap<>();
        map.put("code","0");
        map.put("spaceId",spaceService.insertSpace(space));
        System.out.print(space);
        return map;
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
