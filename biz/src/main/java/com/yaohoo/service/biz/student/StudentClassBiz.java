package com.yaohoo.service.biz.student;

import com.yaohoo.service.domain.model.dos.StudentClassDO;
import com.yaohoo.service.service.student.StudentClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 2016/12/9.
 */
@Service
public class StudentClassBiz {

    @Resource
    private StudentClassService studentClassService;

    boolean addWriteStudentClassRelation(StudentClassDO sm) {
        return studentClassService.addWriteStudentClassRelation(sm);
    }

    boolean updateWriteStudentClassRelation(StudentClassDO sm) {
        return studentClassService.updateWriteStudentClassRelation(sm);
    }


}
