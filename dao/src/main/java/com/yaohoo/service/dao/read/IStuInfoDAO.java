package com.yaohoo.service.dao.read;

import com.yaohoo.service.dao.fieldhandler.RemarkFieldHandler;
import com.yaohoo.service.dao.fieldhandler.RemarkListFieldHandler;
import com.yaohoo.service.domain.model.StudentInfoModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yaoqiang on 2016/11/28.
 */
public interface IStuInfoDAO {

    @Select("select `stu_id` as stuId, `cls_interest` as clsInterests, `cls_time` as clsTimes, `approach` as approachs,  `learn_goal` as learnGoals," +
            "`learn_time` as learnTimes, `expectation` as learnGoals, `reason` as reasons, `created`, `modified`  from stu_info where stu_id = #{id}")
    StudentInfoModel getStudentInfoById(@Param("id") int id);


}
