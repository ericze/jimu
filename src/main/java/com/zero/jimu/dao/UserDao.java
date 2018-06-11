package com.zero.jimu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zero.jimu.entity.User;

@Mapper
public interface UserDao {

    List<User> findAll();
}
