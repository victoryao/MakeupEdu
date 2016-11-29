package com.yaohoo.service.domain.model.vo;

import com.yaohoo.service.domain.model.StuQueryModel;
import com.yaohoo.service.domain.model.StudentInfoModel;
import com.yaohoo.service.domain.model.StudentModel;

import java.util.List;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public class StudentRegisterVO {

    private StudentModel student;
    private StudentInfoModel stuInfo;
    private List<StuQueryModel> querys;

    public StudentModel getStudent() {
        return student;
    }

    public void setStudent(StudentModel student) {
        this.student = student;
    }

    public StudentInfoModel getStuInfo() {
        return stuInfo;
    }

    public void setStuInfo(StudentInfoModel stuInfo) {
        this.stuInfo = stuInfo;
    }

    public List<StuQueryModel> getQuerys() {
        return querys;
    }

    public void setQuerys(List<StuQueryModel> querys) {
        this.querys = querys;
    }
}
