package com.yaohoo.service.service.student;

import com.yaohoo.service.dao.write.IWriteStudentDAO;
import com.yaohoo.service.domain.model.StudentModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Service
public class StudentService {

    @Resource
    private IWriteStudentDAO writeStudentDAO;

    public boolean addStudent(StudentModel sm) {
        return writeStudentDAO.addStudent(sm);
    }

}
