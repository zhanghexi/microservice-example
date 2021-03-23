package com.micro.api;

import com.micro.api.constants.ServiceNameConstants;
import com.micro.api.factory.ProviderServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author : Lucien
 * @version V1.0
 * @Description: TODO
 * @date Date : 2021/03/23
 */
@FeignClient(contextId = "remoteProviderService", value = ServiceNameConstants.PROVIDER_SERVICE,
        fallbackFactory = ProviderServiceFallbackFactory.class)
public interface RemoteProviderService {

    @GetMapping(value = "/echo/{msg}")
    String echoMsg(@PathVariable(value = "msg") String msg);
}