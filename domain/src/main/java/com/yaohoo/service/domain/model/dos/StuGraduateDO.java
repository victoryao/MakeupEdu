package com.yaohoo.service.domain.model.dos;

import java.util.Date;

/**
 * Created by yaoqiang on 2016/12/17.
 */
public class StuGraduateDO {
    private int id;
    private int sId;
    private String company;
    private Date beginTime;
    private Date endTime;
    private int companyType;

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

    public String getCompany() {
        return company;
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

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCompanyType() {
        return companyType;
    }

    public void setCompanyType(int companyType) {
        this.companyType = companyType;
    }
}
