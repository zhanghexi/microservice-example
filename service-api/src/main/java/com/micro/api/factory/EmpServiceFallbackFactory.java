package com.micro.api.factory;

import com.micro.api.RemoteEmpService;
import com.micro.api.constants.ApiResult;
import com.micro.api.dto.EmpDTO;
import feign.hystrix.FallbackFactory;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-04-19 21:39
 * @Version V1.0
 */
@Log4j2
@Component
public class EmpServiceFallbackFactory implements FallbackFactory<RemoteEmpService> {

    @Override
    public RemoteEmpService create(Throwable throwable) {
        log.info("远程调用empService异常:{}", throwable.getMessage());
        return empDTO -> null;
    }
}