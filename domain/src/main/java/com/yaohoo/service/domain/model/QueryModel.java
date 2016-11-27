package com.yaohoo.service.domain.model;

import java.util.Date;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public class QueryModel {
    private int userId;
    private String remark;
    private Date date;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
