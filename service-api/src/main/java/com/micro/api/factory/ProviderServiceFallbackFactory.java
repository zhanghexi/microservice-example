package com.micro.api.factory;

import com.micro.api.RemoteProviderService;
import feign.hystrix.FallbackFactory;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @author : Lucien
 * @version V1.0
 * @Description: TODO
 * @date Date : 2021/03/23
 */
@Log4j2
@Component
public class ProviderServiceFallbackFactory implements FallbackFactory<RemoteProviderService> {

    @Override
    public RemoteProviderService create(Throwable throwable) {
        log.info("远程调用provider异常:{}", throwable.getMessage());
        return msg -> null;
    }
}