package com.yaohoo.service.dao.write;

import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.DormDO;
import com.yaohoo.service.domain.model.dos.StudentClassDO;
import org.apache.ibatis.annotations.Insert;
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


    @Update("update `dorm` set  `address` = #{address}, `type` = #{type}, `fee` = #{fee}, `modified` = now() where id = #{id}")
    boolean updateDorm(DormDO dormDO);

}
