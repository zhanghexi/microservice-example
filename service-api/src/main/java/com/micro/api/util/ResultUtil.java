package com.micro.api.util;

import com.micro.api.constants.ApiResult;
import com.micro.api.constants.ResultCode;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-04-19 21:50
 * @Version V1.0
 */
public class ResultUtil {

    public static ApiResult success(Object object) {
        ApiResult result = new ApiResult();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static ApiResult success() {
        return success(null);
    }

    /**
     * 适用于在业务不抛异常(error)的情况下，非正常返回的情况
     *
     * @return
     */
    public static ApiResult fail() {
        ApiResult result = new ApiResult();
        result.setCode(ResultCode.FAIL.getCode());
        result.setMsg(ResultCode.FAIL.getMsg());
        return result;
    }

    /**
     * 用于catch块里面返回真实异常的情况
     *
     * @return
     */
    public static ApiResult error() {
        ApiResult result = new ApiResult();
        result.setCode(ResultCode.ERROR.getCode());
        result.setMsg(ResultCode.ERROR.getMsg());
        return result;
    }
}