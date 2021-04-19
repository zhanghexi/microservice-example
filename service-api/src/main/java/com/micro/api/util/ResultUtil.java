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

    public static ApiResult fail() {
        ApiResult result = new ApiResult();
        result.setCode(ResultCode.FAIL.getCode());
        result.setMsg(ResultCode.FAIL.getMsg());
        return result;
    }

    public static ApiResult error() {
        ApiResult result = new ApiResult();
        result.setCode(ResultCode.ERROR.getCode());
        result.setMsg(ResultCode.ERROR.getMsg());
        return result;
    }
}
