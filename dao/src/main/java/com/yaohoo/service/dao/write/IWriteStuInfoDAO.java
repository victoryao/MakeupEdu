package com.yaohoo.service.dao.write;

import com.yaohoo.service.domain.model.StudentInfoModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public interface IWriteStuInfoDAO {

    @Insert("INSERT INTO `stu_info` (`stu_id`, `cls_interest`, `cls_time`, `approach`,  `learn_goal`, `learn_time`, `expectation`, `reason`, `created`, `modified`) VALUES " +
            "(#{stuId}, #{clsInterests}, #{clsTimes}," +
            " #{approachs}, #{learnGoals},  " +
            "#{learnTimes}, #{expectations}," +
            " #{reasons}, now(), now())")
    @SelectKey(statement = "SELECT LAST_INSERT_ID() as id", keyProperty = "id", before = false, resultType = Integer.class)
    boolean addStudentInfo(StudentInfoModel si);

    @Update("update stu_info set stu_id = #{stuId}, cls_interest = #{clsInterests}," +
            "cls_time =  #{clsTimes}," +
            "learn_goal = #{learnGoals}, learn_time=#{learnTimes}," +
            "expectation = #{expectations}, reason = #{reasons}," +
            "modified = now() where id = #{id}")
    boolean updateStudentInfo(StudentInfoModel si);
}
