package com.yaohoo.service.biz.student;


import com.alibaba.fastjson.JSON;
import com.yaohoo.service.domain.model.StuQueryModel;
import com.yaohoo.service.domain.model.StudentInfoModel;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.StudentRegisterModel;
import com.yaohoo.service.domain.model.vo.StudentRegisterVO;
import com.yaohoo.service.service.student.StuQueryHisService;
import com.yaohoo.service.service.student.StudentInfoService;
import com.yaohoo.service.service.student.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

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
        studentInfoModel.setStuId(studentModel.getId());
        studentInfoService.addStudentInfo(studentInfoModel);
        queryModel.setStuId(studentModel.getId());
        stuQueryHisService.addStuQueryHis(queryModel);
    }

    @Transactional
    public void updateStudentregister(String json) {
        StudentRegisterModel registerModel = JSON.parseObject(json, StudentRegisterModel.class);
        StudentModel studentModel = registerModel.getStudent();
        StudentInfoModel studentInfoModel = registerModel.getStuInfo();
        StuQueryModel queryModel = registerModel.getQuery();
        studentService.updateStudent(studentModel);
        studentInfoModel.setStuId(studentModel.getId());
        studentInfoService.updateStudentInfo(studentInfoModel);
        queryModel.setStuId(studentModel.getId());
        stuQueryHisService.addStuQueryHis(queryModel);
    }


    public StudentRegisterVO getStudentRegisterModelById(int id) {
        StudentRegisterVO sr = new StudentRegisterVO();
        sr.setStudent(studentService.getStudentById(id));
        sr.setStuInfo(studentInfoService.getStudentInfoByStuId(id));
        sr.setQuerys(stuQueryHisService.getStuQueryHisList(id));
        return sr;
    }

    public boolean updateStudentWillDate(int id, Date date) {
        return studentService.updateStudentWillDate(id, date);
    }

    public List<StudentModel> getTodayWillStudentPaging(int offset, int limit) {
        return studentService.getTodayWillStudentPaging(offset, limit);
    }

    public int getTodayWillStudentCount() {
        return studentService.getTodayWillStudentCount();
    }

    public List<StudentModel> getStudentQueryPaging(int id, String name, long phone, int offset, int limit) {
        return studentService.getStudentQueryPaging(id, name, phone, offset, limit);
    }

    public int getStudentQueryCount(int id, String name, long phone) {
        return studentService.getStudentQueryCount(id, name, phone);
    }

}
