package com.yaohoo.service.dao.read;

import com.yaohoo.service.domain.model.dos.StuGraduateDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yaoqiang on 2016/12/17.
 */
public interface IStuGraduateDAO {

    @Select("select id, s_id as sId, company, company_type as companyType, begin_time as beginTime, end_time as endTime from `stu_graduate` where s_id  = #{sId} order by begin_time asc")
    List<StuGraduateDO> getStudenGraduateBySId(@Param("sId") int sId);

}
