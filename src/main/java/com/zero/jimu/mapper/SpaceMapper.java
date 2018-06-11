package com.zero.jimu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;

import com.zero.jimu.entity.Space;

@Mapper
public interface SpaceMapper {
    @Insert("INSERT INTO jm_space(name, address, mobile, title, about, head_pic, is_recommend, follownum,reviewnum) VALUES(#{jm_space.name}, #{jm_space.address}, #{jm_space.mobile}, #{jm_space.title}, #{jm_space.about}, #{jm_space.head_pic}, #{jm_space.is_recommend}, #{jm_space.follownum},#{jm_space.reviewnum})")
    @Options(useGeneratedKeys = true, keyProperty = "jm_space.id")
    void add(@Param("space") Space space);
}
