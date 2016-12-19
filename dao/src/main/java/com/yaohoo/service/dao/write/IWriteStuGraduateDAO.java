package com.yaohoo.service.dao.write;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yaoqiang on 2016/12/17.
 */
public interface IWriteStuGraduateDAO {

    @Insert("insert into  `stu_graduate` ( s_id, company, company_type, begin_time, created , modified)  VALUES " +
            "(#{sId}, #{company},  #{companyType}, now(), now(), now())")
    boolean addStudenGraduate(@Param("sId") int sId,@Param("company") String company,@Param("companyType") int companyType);

}
