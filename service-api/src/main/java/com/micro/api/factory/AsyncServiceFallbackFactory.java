package com.micro.api.factory;

import com.micro.api.RemoteAsyncService;
import feign.hystrix.FallbackFactory;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-05-03 15:27
 * @Version V1.0
 */
@Log4j2
@Component
public class AsyncServiceFallbackFactory implements FallbackFactory<RemoteAsyncService> {

    @Override
    public RemoteAsyncService create(Throwable throwable) {
        log.info("远程调用异步线程异常:{}", throwable.getMessage());
        return () -> {
        };
    }
}