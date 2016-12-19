package com.yaohoo.service.dao.read;

import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yaoqiang on 2016/12/9.
 */
public interface IStudentClassDAO {

    @Select("select `tc_id` as tcId from `student_class_relation` where s_id  = #{sId}")
    public List<Integer> getStudentClassRelations(int sId);

}
