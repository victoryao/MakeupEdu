package com.yaohoo.service.dao.write;

import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.DormDO;
import com.yaohoo.service.domain.model.dos.StudentClassDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

/**
 * Created by yaoqiang on 2016/11/29.
 */
public interface IWriteDormDAO {

    @Insert("INSERT INTO `dorm` (`address`, `type`, `fee`, `created`, `modified`) VALUES " +
            "(#{address}, #{type}, #{fee}, now(), now())")
    @SelectKey(statement = "SELECT LAST_INSERT_ID() as id", keyProperty = "id", before = false, resultType = Integer.class)
    boolean addDorm(DormDO dormDO);


    @Update("update `dorm` set  `address` = #{address}, `head_count` = #{headCount}, `fee` = #{fee}, `modified` = now() where id = #{id}")
    boolean updateDorm(DormDO dormDO);

    @Update("update `student_dorm_relation` set  `d_id` = #{dId}, `modified` = now() where s_id = #{sId}")
    boolean updateStudentDorm(@Param("sId") int sId, @Param("dId") int dId);

    @Update("update `dorm` set  `head_count` = head_count + 1 , `modified` = now() where d_id = #{dId}")
    boolean incrDormHeadCount(@Param("dId") int dId);

    @Update("update `dorm` set  `head_count` = head_count - 1 , `modified` = now() where d_id = #{dId}")
    boolean decrDormHeadCount(@Param("dId") int dId);

    @Update("insert into `student_dorm_relation` (s_id, d_id, created, modified) values (#{sId}, #{dId}, now(), now())")
    boolean addStudentDorm(@Param("sId") int sId, @Param("dId") int dId);

}
