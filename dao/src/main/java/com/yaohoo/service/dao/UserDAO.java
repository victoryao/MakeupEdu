package com.yaohoo.service.dao;

import com.yaohoo.service.domain.model.dos.UserDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public interface UserDAO {

    @Select("select id, user_name as userName, password, type from user  where  user_name=#{username} and password = #{password}")
    UserDO getUserByUserNamePassword(@Param("username") String username, @Param("password") String password);

}
