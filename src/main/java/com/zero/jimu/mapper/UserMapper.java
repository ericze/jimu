package com.zero.jimu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.zero.jimu.entity.User;

@Mapper
public interface UserMapper {

    @Select("select * from jm_user")
    List<User> findAll();
}
