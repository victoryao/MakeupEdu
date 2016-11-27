package com.yaohoo.service.dao.write;

import com.yaohoo.service.domain.model.StuQueryModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public interface IWriteStuQueryHisDAO {

    @Insert("INSERT INTO `stu_query_his` (`stu_id`, `user_id`, `user_name`, `remark`,  `created`) VALUES " +
            "(#{stuId}, #{userId}, #{userName}, #{remark}, now())")
    @SelectKey(statement = "SELECT LAST_INSERT_ID() as id", keyProperty = "id", before = false, resultType = Integer.class)
    boolean addStuQueryHis(StuQueryModel si);

}
