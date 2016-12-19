package com.yaohoo.service.dao.read;

import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.StudentClassDO;
import com.yaohoo.service.domain.model.dos.TeacherClassDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yaoqiang on 2016/12/4.
 */
public interface IStuClassDAO {

    @Select("select id, c_id as cId, t_id as tId, type_name as typeName, cur_count as curCount, total, fee from teacher_class_relation ")
    public List<TeacherClassDO> getAllClasses();

    @Select("select id, tc_id as tcId, s_id as sId, class_name as className, status from student_class_relation  where s_id = #{sId}")
    public StudentClassDO getClasseRelationBySId(@Param("sId") int sId);


    @Select({"<script>", "select `id`, s_id as sId, s_name as sName, s_phone as sPhone, tc_id as tcId, class_name as className , status,  `created`, `modified`  from student_class_relation ",
            "where status= #{status}", "<if test='id != 0'> and id = #{id}</if>", "<if test='sName != null'> and s_name = #{sName}</if>",
            "<if test='sPhone != 0'> and s_phone = #{sPhone}</if>", "limit #{offset}, #{limit}",
            "</script>"})
    List<StudentModel> getStudentClassQueryPaging(@Param("sId") int sId, @Param("sName") String sName, @Param("sPhone") long sPhone, @Param("status") int status, @Param("offset") int offset, @Param("limit") int limit);

    @Select({"<script>", "select count(1)  from student_class_relation ",
            "where status= #{status}", "<if test='id != 0'> and id = #{id}</if>", "<if test='sName != null'> and s_name = #{sName}</if>",
            "<if test='sPhone != 0'> and s_phone = #{sPhone}</if>",
            "</script>"})
    int getStudentClassQueryCount(@Param("sId") int sId, @Param("sName") String sName, @Param("sPhone") long sPhone, @Param("status") int status);


}
