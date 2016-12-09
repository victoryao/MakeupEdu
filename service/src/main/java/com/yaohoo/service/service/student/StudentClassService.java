package com.yaohoo.service.service.student;

import com.yaohoo.service.dao.write.IWriteStudentClassDAO;
import com.yaohoo.service.domain.model.dos.StudentClassDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 2016/12/9.
 */
@Service
public class StudentClassService {

    @Resource
    private IWriteStudentClassDAO studentClassDAO;

    public boolean addWriteStudentClassRelation(StudentClassDO sm) {
        return studentClassDAO.addStudentClassRelation(sm);
    }

    public boolean updateWriteStudentClassRelation(StudentClassDO sm) {
        return studentClassDAO.updateStudentClassRelation(sm);
    }


}
