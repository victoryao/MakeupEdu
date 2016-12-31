package com.yaohoo.service.domain.model.dos;

import java.util.Date;

/**
 * Created by yaoqiang on 2016/12/9.
 */
public class StudentDormDO {

    private int id;
    private int sId;
    private int dId;
    private Date beginTime;
    private Date endTime;
    private int status;
    private float amount;
    private int durs;

    public StudentDormDO(){}

    public StudentDormDO(int sId, int dId) {
        this.sId = sId;
        this.dId = dId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

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

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
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

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getDurs() {
        return durs;
    }

    public void setDurs(int durs) {
        this.durs = durs;
    }
}
