package com.yaohoo.service.domain.model.dos;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yaoqiang on 2016/12/9.
 */
public class StudentClassDO implements Serializable {

    private int id;
    private int sId;
    private int tcId;
    private String sName;
    private long sPhone;
    private int status;
    private String className;
    private String classTypeName;
    private String classTime;
    private int fee;
    private Date beginTime;
    private Date endTime;
    private float score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getTcId() {
        return tcId;
    }

    public void setTcId(int tcId) {
        this.tcId = tcId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public long getsPhone() {
        return sPhone;
    }

    public void setsPhone(long sPhone) {
        this.sPhone = sPhone;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
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

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "StudentClassDO{" +
                "id=" + id +
                ", sId=" + sId +
                ", tcId=" + tcId +
                ", sName='" + sName + '\'' +
                ", sPhone=" + sPhone +
                ", status=" + status +
                ", className='" + className + '\'' +
                '}';
    }
}
