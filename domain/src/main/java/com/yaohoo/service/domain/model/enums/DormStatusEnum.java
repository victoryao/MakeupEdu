package com.yaohoo.service.domain.model.enums;

/**
 * Created by yaoqiang on 2016/12/14.
 */
public enum DormStatusEnum {
	NOT_FULL(0),
    FULL(1);

    DormStatusEnum(int value) {
        this.value = value;
    }

    private final int value;

    public int getValue() {
        return value;
    }
}
