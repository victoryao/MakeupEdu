package com.yaohoo.service.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public interface UserDAO {

    @Select("select id from user  where  user_name=#{username} and password = #{password}")
    Integer getUserByUserNamePassword(@Param("username") String username, @Param("password") String password);

}
