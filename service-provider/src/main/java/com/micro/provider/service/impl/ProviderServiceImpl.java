package com.micro.provider.service.impl;

import com.micro.provider.service.ProviderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

/**
 * @author : Lucien
 * @version V1.0
 * @Description: TODO
 * @date Date : 2021/03/23
 */
@Log4j2
@Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String echoMessage(String msg) {
        String result = "Hello Nacos Discovery " + msg;
        log.info("result = {}", result);
        return result;
    }
}