package com.micro.api.constants;

import lombok.Data;

/**
 * @Description: 接口统一返回格式
 * @Author : Lucien
 * @Date Date : 2021-04-19 21:46
 * @Version V1.0
 */
@Data
public class ApiResult<T> {

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体的内容
     */
    private T data;
}