package com.yaohoo.service.domain.model;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public class StudentRegisterModel {

    private StudentModel student;
    private  StudentInfo stuInfo;
    private QueryModel query;

    public StudentModel getStudent() {
        return student;
    }

    public void setStudent(StudentModel student) {
        this.student = student;
    }

    public StudentInfo getStuInfo() {
        return stuInfo;
    }

    public void setStuInfo(StudentInfo stuInfo) {
        this.stuInfo = stuInfo;
    }

    public QueryModel getQuery() {
        return query;
    }

    public void setQuery(QueryModel query) {
        this.query = query;
    }
}
