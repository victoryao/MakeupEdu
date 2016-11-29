package com.yaohoo.service.dao.read;

import com.yaohoo.service.dao.fieldhandler.RemarkFieldHandler;
import com.yaohoo.service.domain.model.StudentModel;
import org.apache.ibatis.annotations.*;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public interface IStudentDAO {

    @Select("select `name`, `gender`, `age`, `phone`,  `qq`, `is_work` as isWork, `job_sort` as jobSort, `created`, `modified`  from student where id = #{id}")
    @Results(value = {
            @Result(column = "jobSort", property = "jobSort", typeHandler = RemarkFieldHandler.class)
    })
    StudentModel getStudentById(int id);


}
