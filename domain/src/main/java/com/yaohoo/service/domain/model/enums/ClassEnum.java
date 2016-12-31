package com.yaohoo.service.domain.model.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yaoqiang on 2016/12/25.
 */
public enum ClassEnum {

    UNKNOWN(0, "未知"),
    MEIJIA(1, "美甲类"),
    SHEYING(2, "摄影类"),
    HUAZHUANG(3, "化妆类"),
    MEIRONG(4, "美容类"),
    MEIFA(5, "美发类"),
    BANYONGJIU(6, "半永久类");

    private static Map<Integer, ClassEnum> varMap = new HashMap<>();

    static {
        ClassEnum[] enums = ClassEnum.values();
        for (ClassEnum e : enums) {
            varMap.put(e.getCode(), e);
        }
    }

    public static ClassEnum valueof(int value) {
        return varMap.get(value);
    }

    ClassEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    private final int code;
    private final String name;

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
