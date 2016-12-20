package com.yaohoo.service.dao.read;

import com.yaohoo.service.dao.fieldhandler.RemarkFieldHandler;
import com.yaohoo.service.domain.model.StudentModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public interface IStudentDAO {

    @Select("select `id`, `name`, `gender`, `age`, `phone`,  `qq`, `is_work` as isWork, `job_sort` as jobSort, `created`, `modified`  from student where id = #{id}")
    StudentModel getStudentById(@Param("id") int id);

    @Select("select `name`, `gender`, `age`, `phone`,  `qq`, `is_work` as isWork, `job_sort` as jobSort, `created`, `modified`  from student where status = #{status} limit #{offset}, #{limit}")
    @Results(value = {
            @Result(column = "jobSort", property = "jobSort", typeHandler = RemarkFieldHandler.class)
    })
    List<StudentModel> getStudentsByStatusPaging(@Param("status") int status, @Param("offset") int offset, @Param("limit") int limit);

    @Select("select `id`, `name`, `gender`, `age`, `phone`,  `qq`, `is_work` as isWork, `job_sort` as jobSort, `created`, `modified` from student where status = 2 and will_date = curdate() limit #{offset}, #{limit}")
    List<StudentModel> getTodayWillStudentPaging(@Param("offset") int offset, @Param("limit") int limit);

    @Select("select count(1) from student where status = 2 and will_date = curdate()")
    int getTodayWillStudentCount();

    @Select({"<script>", "select `id`, `name`, `gender`, `age`, `phone`,  `qq`, `is_work` as isWork, `job_sort` as jobSort, `created`, `modified`  from student ",
            "where status= #{status}", "<if test='id != 0'> and id = #{id}</if>", "<if test='name != null'> and name = #{name}</if>",
            "<if test='phone != 0'> and phone = #{phone}</if>", "limit #{offset}, #{limit}",
            "</script>"})
    List<StudentModel> getStudentQueryPaging(@Param("id") int id, @Param("name") String name, @Param("phone") long phone, @Param("status") int status, @Param("offset") int offset, @Param("limit") int limit);

    @Select({"<script>", "select count(1)  from student ",
            "where status= #{status}", "<if test='id != 0'> and id = #{id}</if>", "<if test='name != null'> and name = #{name}</if>",
            "<if test='phone != 0'> and phone = #{phone}</if>",
            "</script>"})
    int getStudentQueryCount(@Param("id") int id, @Param("name") String name, @Param("phone") long phone, @Param("status") int status);


}
