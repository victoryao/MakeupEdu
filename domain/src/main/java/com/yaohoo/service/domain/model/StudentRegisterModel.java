package com.yaohoo.service.domain.model;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public class StudentRegisterModel {

    private StudentModel student;
    private StudentInfoModel stuInfo;
    private StuQueryModel query;

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

    public StuQueryModel getQuery() {
        return query;
    }

    public void setQuery(StuQueryModel query) {
        this.query = query;
    }
}
