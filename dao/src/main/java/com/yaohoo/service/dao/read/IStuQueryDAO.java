package com.yaohoo.service.dao.read;

import com.yaohoo.service.domain.model.StuQueryModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yaoqiang on 2016/11/28.
 */
public interface IStuQueryDAO {

    @Select("select  `stu_id`, `user_id`, `user_name`, `remark`,  `created` from `stu_query_his` where stu_id = #{id} order by created desc")
    List<StuQueryModel> getStuQueryHisList(@Param("id") int id);


}
