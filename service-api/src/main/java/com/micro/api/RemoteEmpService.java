package com.micro.api;

import com.micro.api.constants.ApiResult;
import com.micro.api.constants.ServiceNameConstants;
import com.micro.api.dto.EmpDTO;
import com.micro.api.factory.EmpServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-04-19 21:39
 * @Version V1.0
 */
@FeignClient(contextId = "remoteEmpService", value = ServiceNameConstants.PROVIDER_SERVICE,
        fallbackFactory = EmpServiceFallbackFactory.class)
public interface RemoteEmpService {

    /**
     * 带条件模糊分页查询
     *
     * @param empDTO
     * @return
     */
    @PostMapping(value = "/api/getEmpInfosByCondition")
    ApiResult getEmpInfosByCondition(@RequestBody EmpDTO empDTO);
}