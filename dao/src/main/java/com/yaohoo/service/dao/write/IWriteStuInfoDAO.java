package com.yaohoo.service.dao.write;

import com.yaohoo.service.domain.model.StudentInfo;
import com.yaohoo.service.domain.model.StudentModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public interface IWriteStuInfoDAO {

    @Insert("INSERT INTO `stu_info` (`stu_id`, `cls_interest`, `cls_time`, `approach`,  `learn_goal`, `learn_time`, `expectation`, `reason`, `created`, `modified`) VALUES " +
            "(#{stuId}, #{clsInterest,typeHandler=com.yaohoo.service.dao.provider.RemarkHandler}, #{clsTime,typeHandler=com.yaohoo.service.dao.provider.RemarkHandler}," +
            " #{approach,typeHandler=com.yaohoo.service.dao.provider.RemarkHandler}, #{learnGoal,typeHandler=com.yaohoo.service.dao.provider.RemarkHandler},  " +
            "#{learnTime,typeHandler=com.yaohoo.service.dao.provider.RemarkHandler}, #{expectation,typeHandler=com.yaohoo.service.dao.provider.RemarkHandler}," +
            " #{reason,typeHandler=com.yaohoo.service.dao.provider.RemarkHandler}, now(), now())")
    @SelectKey(statement = "SELECT LAST_INSERT_ID() as id", keyProperty = "id", before = false, resultType = Integer.class)
    boolean addStudentInfo(StudentInfo si);
}
