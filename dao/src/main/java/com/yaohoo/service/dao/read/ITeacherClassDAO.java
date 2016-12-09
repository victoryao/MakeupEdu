package com.yaohoo.service.dao.read;

import com.yaohoo.service.domain.model.dos.TeacherClassDO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yaoqiang on 2016/12/4.
 */
public interface ITeacherClassDAO {

    @Select("select id, c_id as cId, t_id as tId, type_name as typeName, cur_count as curCount, total, fee from teacher_class_relation ")
    public List<TeacherClassDO> getAllClasses();

}
