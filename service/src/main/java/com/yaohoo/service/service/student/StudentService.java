package com.yaohoo.service.service.student;

import com.yaohoo.service.dao.read.IStudentDAO;
import com.yaohoo.service.dao.write.IWriteStudentDAO;
import com.yaohoo.service.domain.model.StudentModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Service
public class StudentService {

    @Resource
    private IWriteStudentDAO writeStudentDAO;
    @Resource
    private IStudentDAO studentDAO;

    public boolean addStudent(StudentModel sm) {
        return writeStudentDAO.addStudent(sm);
    }

    public boolean updateStudent(StudentModel sm) {
        return writeStudentDAO.updateStudent(sm);
    }

    public StudentModel getStudentById(int id) {
        return studentDAO.getStudentById(id);
    }

    public List<StudentModel> getStudentByStatus(int status, int offset, int limit) {
        return studentDAO.getStudentsByStatusPaging(status, offset, limit);
    }

    public boolean updateStudentWillDate(int sid, Date date) {
        return writeStudentDAO.updateStudentWillDate(sid, date);
    }

    public List<StudentModel> getTodayWillStudentPaging(int offset, int limit) {
        return studentDAO.getTodayWillStudentPaging(offset, limit);
    }

    public int getTodayWillStudentCount() {
        return studentDAO.getTodayWillStudentCount();
    }
}
