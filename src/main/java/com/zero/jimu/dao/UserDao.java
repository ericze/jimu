package com.zero.jimu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zero.jimu.entity.User;

@Mapper
public interface UserDao {

    List<User> findAll();

    User findByOpenIdLike(String openId);

    int insertUser(@Param("user")User user);
}
