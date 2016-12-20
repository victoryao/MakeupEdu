package com.yaohoo.service.domain.model;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public class StudentModel {

    private int id;
    private String name;
    private int age;
    private int gender;
    private long phone;
    private int qq;
    private int isWork;
    private String jobSort;
    private int status;
    private int dormStatus;
    private int proStatus;
    private int classStatus;
    private String dormId;
    private String className;
    private String property;

    public int getProStatus() {
        return proStatus;
    }

    public void setProStatus(int proStatus) {
        this.proStatus = proStatus;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
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

    public String getJobSort() {
        return jobSort;
    }

    public void setJobSort(String jobSort) {
        this.jobSort = jobSort;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getDormStatus() {
        return dormStatus;
    }

    public void setDormStatus(int dormStatus) {
        this.dormStatus = dormStatus;
    }

    public String getDormId() {
        return dormId;
    }

    public void setDormId(String dormId) {
        this.dormId = dormId;
    }

    public int getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", phone=" + phone +
                ", qq=" + qq +
                ", isWork=" + isWork +
                ", jobSort=" + jobSort +
                ", status=" + status +
                '}';
    }
}
