package com.yaohoo.service.dao.write;

import com.yaohoo.service.domain.model.StudentModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public interface IWriteStudentDAO {

    @Insert("INSERT INTO `student` (`name`, `gender`, `age`, `phone`,  `qq`, `is_work`, `job_sort`, `created`, `modified`) VALUES " +
            "(#{name}, #{gender}, #{age}, #{phone},  #{qq}, #{isWork}, #{jobSort,typeHandler=com.yaohoo.service.dao.provider.RemarkHandler}, now(), now())")
    @SelectKey(statement = "SELECT LAST_INSERT_ID() as id", keyProperty = "id", before = false, resultType = Integer.class)
    boolean addStudent(StudentModel sm);

}
