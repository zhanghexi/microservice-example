package com.micro.api;

import com.micro.api.constants.ServiceNameConstants;
import com.micro.api.factory.AsyncServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-05-03 15:26
 * @Version V1.0
 */
@FeignClient(contextId = "remoteAsyncService", value = ServiceNameConstants.PROVIDER_SERVICE,
        fallbackFactory = AsyncServiceFallbackFactory.class)
public interface RemoteAsyncService {

    /**
     * 远程调用异步线程
     */
    @GetMapping(value = "/api/invokeAsyncService")
    void invokeAsyncService();
}