package com.zero.jimu.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zero.jimu.entity.Space;

import java.util.List;

@Mapper
public interface SpaceDao {
    int insertSpace(@Param("space")Space space);
    List<Space> selectAll();
    Space selectSpaceById(int id);
}
