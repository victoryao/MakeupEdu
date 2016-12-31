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

    @Select({"<script>", "select tcr.id, tcr.c_id as cId, tcr.t_id as tId, tcr.cur_count as curCount, tcr.total_count as totalCount, tcr.fee, tcr.class_type as classType," +
            "t.name as teacherName, t.intro as teacherIntro from teacher_class_relation tcr left join teacher  t on tcr.t_id = t.id ",
            "where status= 0", "<if test='classTimeType != 0'> and class_time_type = #{classTimeType}</if>", "<if test='tId != 0'> and t_id = #{tId}</if>",
            "<if test='classType != 0'> and class_type = #{classType}</if>", "limit #{offset}, #{limit}",
            "</script>"})
    public List<TeacherClassDO> getTeacherClassesQuery(@Param("tId") int tId, @Param("classTimeType") int classTimeType, @Param("classType") int classType, @Param("offset") int offset, @Param("limit") int limit);


    @Select({"<script>", "select count(1) from teacher_class_relation tcr ",
            "where status= 0", "<if test='classTimeType != 0'> and class_time_type = #{classTimeType}</if>", "<if test='tId != 0'> and t_id = #{tId}</if>",
            "<if test='classType != 0'> and class_type = #{classType}</if>",
            "</script>"})
    public int getTeacherClassesQueryCount(@Param("tId") int tId, @Param("classTimeType") int classTimeType, @Param("classType") int classType);

    @Select("select id, c_id as cId, t_id as tId, cur_count as curCount, total_count as totalCount, fee, class_type as classType from teacher_class_relation where id = #{tcId}")
    public TeacherClassDO getTeacherClassesById(@Param("tcId") int tcId);

    @Select("select id, tc_id as tcId, s_id as sId, class_name as className, status, score, begin_time as beginTime, end_time as endTime from student_class_relation  where s_id = #{sId}")
    public StudentClassDO getClasseRelationBySId(@Param("sId") int sId);

    @Select("select id, tc_id as tcId, s_id as sId, class_name as className, status, score, begin_time as beginTime, end_time as endTime from student_class_relation  where s_id = #{sId} and tc_id = #{tcId}")
    public StudentClassDO getClasseRelationBySIdTcId(@Param("sId") int sId, @Param("tcId") int tcId);


    @Select({"<script>", "select `id`, s_id as sId, s_name as sName, s_phone as sPhone, tc_id as tcId, class_name as className, status, score , begin_time as beginTime, end_time as endTime, `created`, `modified` " +
            " from student_class_relation where status= #{status}", "<if test='sName != null'> and s_name = #{sName}</if>",
            "<if test='sPhone != 0'> and s_phone = #{sPhone}</if>", "limit #{offset}, #{limit}", "</script>"})
    List<StudentClassDO> getStudentClassQueryPaging(@Param("sId") int sId, @Param("sName") String sName, @Param("sPhone") long sPhone, @Param("status") int status, @Param("offset") int offset, @Param("limit") int limit);

    @Select({"<script>", "select count(1)  from student_class_relation ",
            "where status= #{status}", "<if test='sName != null'> and s_name = #{sName}</if>",
            "<if test='sPhone != 0'> and s_phone = #{sPhone}</if>",
            "</script>"})
    int getStudentClassQueryCount(@Param("sId") int sId, @Param("sName") String sName, @Param("sPhone") long sPhone, @Param("status") int status);


}
