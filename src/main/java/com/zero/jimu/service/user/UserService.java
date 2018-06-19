package com.zero.jimu.service.user;

import com.zero.jimu.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

     List<User> findAllUser();

     User findByOpenIdLike(String openid);

     int insertUser(@Param("user")User user);
}
