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

    @Select("select `stu_id` as stuId, `cls_interest`, `cls_time`, `approach`,  `learn_goal`, `learn_time`, `expectation`, `reason`, `created`, `modified`  from stu_info where stu_id = #{id}")
    @Results(value = {
            @Result(column = "cls_interest", property = "clsInterests", typeHandler = RemarkFieldHandler.class),
            @Result(column = "cls_time", property = "clsTimes", typeHandler = RemarkListFieldHandler.class),
            @Result(column = "approach", property = "approachs", typeHandler = RemarkListFieldHandler.class),
            @Result(column = "learn_goal", property = "learnGoals", typeHandler = RemarkListFieldHandler.class),
            @Result(column = "learn_time", property = "learnTimes", typeHandler = RemarkListFieldHandler.class),
            @Result(column = "expectation", property = "expectations", typeHandler = RemarkListFieldHandler.class),
            @Result(column = "reason", property = "reasons", typeHandler = RemarkListFieldHandler.class)
    })
    StudentInfoModel getStudentInfoById(@Param("id") int id);


}
