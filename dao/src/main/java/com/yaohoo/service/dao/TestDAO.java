package com.yaohoo.service.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yaoqiang on 16/4/15.
 */
public interface TestDAO {

    @Select("select name from critx  where  id=#{id}")
    String get(@Param("id") int id);
}
