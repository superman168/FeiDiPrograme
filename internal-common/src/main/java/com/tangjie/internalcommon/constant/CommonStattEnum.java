package com.tangjie.internalcommon.constant;

import lombok.Getter;

public enum CommonStattEnum {


    SUCCESS(1,"success"),
    FAIL(0,"fail");

    @Getter
    private int code;
    @Getter
    private String message;

    CommonStattEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
