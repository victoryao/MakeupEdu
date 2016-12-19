package com.yaohoo.service.domain.model.enums;

/**
 * Created by yaoqiang on 2016/12/14.
 */
public enum StuStatusEnum {
	NO(0),
    YES(1);

    StuStatusEnum(int value) {
        this.value = value;
    }

    private final int value;

    public int getValue() {
        return value;
    }
}
