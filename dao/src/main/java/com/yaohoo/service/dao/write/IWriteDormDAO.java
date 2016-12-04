package com.yaohoo.service.dao.write;

import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.DormDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;

/**
 * Created by yaoqiang on 2016/11/29.
 */
public interface IWriteDormDAO {

    @Insert("INSERT INTO `dorm` (`address`, `type`, `fee`, `sid`, `created`, `modified`) VALUES " +
            "(#{address}, #{type}, #{fee}, #{sid}, now(), now())")
    @SelectKey(statement = "SELECT LAST_INSERT_ID() as id", keyProperty = "id", before = false, resultType = Integer.class)
    boolean addDorm(DormDO sm);

}
