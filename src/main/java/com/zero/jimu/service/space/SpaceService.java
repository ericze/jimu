package com.zero.jimu.service.space;

import com.zero.jimu.entity.Space;

import java.util.List;
public interface SpaceService {
    //添加新空间
    int insertSpace(Space space);
    //查询所有新空间
    List<Space> selectAll();
    //根据id查询对应的空间详情
    Space selectSpaceById(int id);
}