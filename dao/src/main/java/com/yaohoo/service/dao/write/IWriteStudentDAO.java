package com.yaohoo.service.dao.write;

import com.yaohoo.service.domain.model.StudentModel;
import javafx.scene.chart.PieChart;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import java.util.Date;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public interface IWriteStudentDAO {

    @Insert("INSERT INTO `student` (`name`, `gender`, `age`, `phone`,  `qq`, `is_work`, `job_sort`, `status`, `created`, `modified`) VALUES " +
            "(#{name}, #{gender}, #{age}, #{phone},  #{qq}, #{isWork}, #{jobSort,typeHandler=com.yaohoo.service.dao.provider.RemarkHandler}, #{status}, now(), now())")
    @SelectKey(statement = "SELECT LAST_INSERT_ID() as id", keyProperty = "id", before = false, resultType = Integer.class)
    boolean addStudent(StudentModel sm);

    @Update("update student set name = #{name}, gender = #{gender}, age = #{age}, phone = #{phone}, qq = #{qq}, is_work = #{isWork}, " +
            "job_sort = #{jobSort,typeHandler=com.yaohoo.service.dao.provider.RemarkHandler}, status = #{status}, modified = now() where id = #{id}")
    boolean updateStudent(StudentModel sm);

    @Update("update student set will_date =  #{date} where id = #{id}")
    boolean updateStudentWillDate(@Param("id") int id, @Param("date") Date date);

}
