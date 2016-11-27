package com.yaohoo.service.domain.model;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public class RemarkModel {
    private int code;
    private String remark;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "{" +
                "code:" + code +
                ", remark:'" + remark + '\'' +
                '}';
    }
}
