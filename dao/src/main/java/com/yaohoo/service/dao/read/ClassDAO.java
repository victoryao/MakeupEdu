package com.yaohoo.service.dao.read;

import com.yaohoo.service.domain.model.dos.ClassDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yaoqiang on 2016/12/25.
 */
public interface ClassDAO {

    @Select("select id, name, c_id as cId, type, type_name as typeName, intro from class where id = #{id}")
    public ClassDO getClassById(@Param("id") int id);
}
