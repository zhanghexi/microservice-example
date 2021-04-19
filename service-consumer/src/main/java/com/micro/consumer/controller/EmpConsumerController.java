package com.micro.consumer.controller;

import com.micro.api.RemoteEmpService;
import com.micro.api.constants.ApiResult;
import com.micro.api.dto.EmpDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-04-19 22:02
 * @Version V1.0
 */
@RestController
public class EmpConsumerController {

    @Autowired
    public RemoteEmpService remoteEmpService;

    @PostMapping(value = "/consumer/getEmpInfosByCondition")
    public ApiResult getEmpInfosByCondition(@RequestBody EmpDTO empDTO) {
        ApiResult result = remoteEmpService.getEmpInfosByCondition(empDTO);
        return result;
    }
}