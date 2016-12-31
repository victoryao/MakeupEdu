package com.yaohoo.service.dao.write;

import com.yaohoo.service.domain.model.dos.StudentDormDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

/**
 * Created by yaoqiang on 2016/12/9.
 */
public interface IWriteStudentDormDAO {

    @Insert("insert into `student_dorm_relation` (s_id, d_id, begin_time, created, modified) values (#{sId}, #{dId}, now(), now(), now())")
    @SelectKey(statement = "SELECT LAST_INSERT_ID() as id", keyProperty = "id", before = false, resultType = Integer.class)
    boolean addStudentDormRelation(StudentDormDO sm);

    @Update("update `student_dorm_relation` set  `d_id` = #{dId}, `status` = #{status}, `modified` = now() where s_id = #{sId}")
    boolean updateStudentDormRelation(StudentDormDO sm);
}
