package com.micro.api.constants;

import lombok.Getter;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-04-19 21:50
 * @Version V1.0
 */
public enum ResultCode {

    SUCCESS(0, "成功"),
    FAIL(-1, "失败"),
    ERROR(9999, "接口请求异常");

    @Getter
    private Integer code;
    @Getter
    private String msg;

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResultCode{" +
                "status='" + code + '\'' +
                ", message='" + msg + '\'' +
                '}';
    }
}