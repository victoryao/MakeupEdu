package com.yaohoo.service.common.enums;

/**
 * Created by yaoqiang on 2016/12/11.
 */
public enum StudentStatusEnum {

    TBD(0, "未确定"),
    SIGNED(1, "已报名"),
    WILL(2, "有意向");
    public final int value;
    public final String desc;

    StudentStatusEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
