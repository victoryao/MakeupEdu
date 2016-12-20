package com.yaohoo.service.domain.model;

import java.util.List;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public class StudentInfoModel {
    private int id;
    private int stuId;
    private String clsInterests;
    private String clsTimes;
    private String approachs;
    private String learnGoals;
    private String learnTimes;
    private String expectations;
    private String reasons;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getClsInterests() {
        return clsInterests;
    }

    public void setClsInterests(String clsInterests) {
        this.clsInterests = clsInterests;
    }

    public String getClsTimes() {
        return clsTimes;
    }

    public void setClsTimes(String clsTimes) {
        this.clsTimes = clsTimes;
    }

    public String getApproachs() {
        return approachs;
    }

    public void setApproachs(String approachs) {
        this.approachs = approachs;
    }

    public String getLearnGoals() {
        return learnGoals;
    }

    public void setLearnGoals(String learnGoals) {
        this.learnGoals = learnGoals;
    }

    public String getLearnTimes() {
        return learnTimes;
    }

    public void setLearnTimes(String learnTimes) {
        this.learnTimes = learnTimes;
    }

    public String getExpectations() {
        return expectations;
    }

    public void setExpectations(String expectations) {
        this.expectations = expectations;
    }

    public String getReasons() {
        return reasons;
    }

    public void setReasons(String reasons) {
        this.reasons = reasons;
    }
}
