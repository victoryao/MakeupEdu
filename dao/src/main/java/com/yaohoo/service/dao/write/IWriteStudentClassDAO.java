package com.yaohoo.service.dao.write;

import com.yaohoo.service.domain.model.dos.StudentClassDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

/**
 * Created by yaoqiang on 2016/12/9.
 */
public interface IWriteStudentClassDAO {

    @Insert("INSERT INTO `student_class_relation` (`s_id`, `tc_id`, `created`, `modified`) VALUES " +
            "(#{sId}, #{tcId},  now(), now())")
    @SelectKey(statement = "SELECT LAST_INSERT_ID() as id", keyProperty = "id", before = false, resultType = Integer.class)
    boolean addStudentClassRelation(StudentClassDO sm);

    @Update("update `student_class_relation` set  `tc_id` = #{tcId}, `status` = #{status}, `modified` = now() where s_id = #{sId}")
    boolean updateStudentClassRelation(StudentClassDO sm);


}
