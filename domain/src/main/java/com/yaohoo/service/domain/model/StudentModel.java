package com.yaohoo.service.domain.model;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public class StudentModel {

    private int id;
    private String name;
    private int age;
    private int phone;
    private int qq;
    private int isWork;
    private RemarkModel jobSort;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getQq() {
        return qq;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public int getIsWork() {
        return isWork;
    }

    public void setIsWork(int isWork) {
        this.isWork = isWork;
    }

    public RemarkModel getJobSort() {
        return jobSort;
    }

    public void setJobSort(RemarkModel jobSort) {
        this.jobSort = jobSort;
    }
}
