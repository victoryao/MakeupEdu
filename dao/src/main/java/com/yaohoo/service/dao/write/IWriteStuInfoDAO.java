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
            "(#{stuId}, #{clsInterests,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}, #{clsTimes,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}," +
            " #{approachs,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}, #{learnGoals,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler},  " +
            "#{learnTimes,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}, #{expectations,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}," +
            " #{reasons,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}, now(), now())")
    @SelectKey(statement = "SELECT LAST_INSERT_ID() as id", keyProperty = "id", before = false, resultType = Integer.class)
    boolean addStudentInfo(StudentInfoModel si);

    @Update("update stu_info set stu_id = #{stuId}, cls_interest = #{clsInterests,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}," +
            "cls_time =  #{clsTimes,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}, approach =#{approachs,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}," +
            "learn_goal = #{learnGoals,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}, learn_time=#{learnTimes,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}," +
            "expectation = #{expectations,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}, reason = #{reasons,typeHandler=com.yaohoo.service.dao.provider.RemarkListHandler}," +
            "modified = now() where id = #{id}")
    boolean updateStudentInfo(StudentInfoModel si);
}
