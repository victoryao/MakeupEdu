package com.yaohoo.service.dao.read;

import com.yaohoo.service.domain.model.dos.DormDO;
import com.yaohoo.service.domain.model.dos.StudentDormDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yaoqiang on 2016/12/14.
 */
public interface IStudentDormDAO {

    @Select("select id,d_id as dId, begin_time as beginTime from `student_dorm_relation` where s_id  = #{sId} and status = 0")
    StudentDormDO getStudentDormRelationIdBySId(int sId);

    @Select("select d_id from `student_dorm_relation` where s_id  = #{sId}")
    Integer getDormIdByStudentId(int sId);

    @Select("select id, d_id as dId, address, head_count as headCount, total_count as totalCount, fee, status from `dorm` where id  = #{id}")
    DormDO getDormById(int id);

    @Select({"<script>", "select id, d_id as dId, address, head_count as headCount, total_count as totalCount, fee, status from `dorm` " +
            "<if test='totalCount != 0'> where total_count  = #{totalCount}</if>", "</script>"})
    List<DormDO> getDormsByTotalCount(@Param("totalCount")int totalCount);


}
