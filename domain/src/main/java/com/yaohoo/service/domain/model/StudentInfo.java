package com.yaohoo.service.domain.model;

import java.util.List;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public class StudentInfo {
    private int id;
    private int stuId;
    private List<RemarkModel> clsInterests;
    private List<RemarkModel> clsTimes;
    private List<RemarkModel> approachs;
    private List<RemarkModel> learnGoals;
    private List<RemarkModel> learnTimes;
    private List<RemarkModel> expectations;
    private List<RemarkModel> reasons;


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

    public List<RemarkModel> getClsInterests() {
        return clsInterests;
    }

    public void setClsInterests(List<RemarkModel> clsInterests) {
        this.clsInterests = clsInterests;
    }

    public List<RemarkModel> getClsTimes() {
        return clsTimes;
    }

    public void setClsTimes(List<RemarkModel> clsTimes) {
        this.clsTimes = clsTimes;
    }

    public List<RemarkModel> getApproachs() {
        return approachs;
    }

    public void setApproachs(List<RemarkModel> approachs) {
        this.approachs = approachs;
    }

    public List<RemarkModel> getLearnGoals() {
        return learnGoals;
    }

    public void setLearnGoals(List<RemarkModel> learnGoals) {
        this.learnGoals = learnGoals;
    }

    public List<RemarkModel> getLearnTimes() {
        return learnTimes;
    }

    public void setLearnTimes(List<RemarkModel> learnTimes) {
        this.learnTimes = learnTimes;
    }

    public List<RemarkModel> getExpectations() {
        return expectations;
    }

    public void setExpectations(List<RemarkModel> expectations) {
        this.expectations = expectations;
    }

    public List<RemarkModel> getReasons() {
        return reasons;
    }

    public void setReasons(List<RemarkModel> reasons) {
        this.reasons = reasons;
    }
}
