package com.yaohoo.service.domain.model.dos;

/**
 * Created by yaoqiang on 2016/12/9.
 */
public class StudentDormDO {

    private int id;
    private int sId;
    private int dId;
    private int status;

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
}
