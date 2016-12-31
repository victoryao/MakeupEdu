package com.yaohoo.service.domain.model.dos;

/**
 * Created by yaoqiang on 2016/12/4.
 */
public class TeacherClassDO {

    private int id;
    private int cId;
    private int tId;
    private String ClassName;
    private String ClassIntro;
    private String teacherName;
    private String teacherIntro;
    private int classTimeType;
    private int curCount;
    private int totalCount;
    private int fee;
    private int classType;
    private String classTypeName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public int getCurCount() {
        return curCount;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherIntro() {
        return teacherIntro;
    }

    public void setTeacherIntro(String teacherIntro) {
        this.teacherIntro = teacherIntro;
    }

    public void setCurCount(int curCount) {
        this.curCount = curCount;
    }

    public int getClassTimeType() {
        return classTimeType;
    }

    public void setClassTimeType(int classTimeType) {
        this.classTimeType = classTimeType;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getClassType() {
        return classType;
    }

    public void setClassType(int classType) {
        this.classType = classType;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getClassTypeName() {
        return classTypeName;
    }

    public void setClassTypeName(String classTypeName) {
        this.classTypeName = classTypeName;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getClassIntro() {
        return ClassIntro;
    }

    public void setClassIntro(String classIntro) {
        ClassIntro = classIntro;
    }
}
