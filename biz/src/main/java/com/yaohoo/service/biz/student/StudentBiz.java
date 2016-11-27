package com.yaohoo.service.biz.student;


import com.alibaba.fastjson.JSON;
import com.yaohoo.service.domain.model.StuQueryModel;
import com.yaohoo.service.domain.model.StudentInfoModel;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.StudentRegisterModel;
import com.yaohoo.service.service.student.StuQueryHisService;
import com.yaohoo.service.service.student.StudentInfoService;
import com.yaohoo.service.service.student.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Service
public class StudentBiz {

    @Resource
    private StudentService studentService;
    @Resource
    private StudentInfoService studentInfoService;
    @Resource
    private StuQueryHisService stuQueryHisService;

    /**
     * 学生咨询登记表
     */
    @Transactional
    public void addStudentregister(String json) {
        StudentRegisterModel registerModel = JSON.parseObject(json, StudentRegisterModel.class);
        StudentModel studentModel = registerModel.getStudent();
        StudentInfoModel studentInfoModel = registerModel.getStuInfo();
        StuQueryModel queryModel = registerModel.getQuery();
        studentService.addStudent(studentModel);
        studentInfoService.addStudentInfo(studentInfoModel);
        stuQueryHisService.addStuQueryHis(queryModel);
    }

}
