package com.tangjie.internalcommon.dto;

import com.tangjie.internalcommon.constant.CommonStattEnum;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ResponseResult<T> {

    private int code;

    private String message;

    private T data;

    /**
     * 成功
     * @param data
     * @return
     * @param <T>
     */
    public static <T> ResponseResult success(T data){
        return new ResponseResult().setCode(CommonStattEnum.SUCCESS.getCode()).setMessage(CommonStattEnum.SUCCESS.getMessage()).setData(data);
    }

    /**
     * 通用失败
     * @param data
     * @return
     * @param <T>
     */
    private static <T> ResponseResult fail(T data){
        return new ResponseResult().setCode(CommonStattEnum.FAIL.getCode()).setMessage(CommonStattEnum.FAIL.getMessage()).setData(data);
    }

    /**
     * 自定义失败（编码和描述）
     * @param code 码值
     * @param message code描述
     * @return
     */
    private static ResponseResult fail(int code, String message){
        return new ResponseResult().setCode(code).setMessage(message);
    }

    /**
     * 自定义失败（编码、描述和原因）
     * @param code 码值
     * @param message code描述
     * @param data 原因
     * @return
     */
    private static ResponseResult fail(int code, String message, String data){
        return new ResponseResult().setCode(code).setMessage(message).setData(data);
    }

}
