package com.micro.consumer.controller;

import com.micro.api.RemoteProviderService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : Lucien
 * @version V1.0
 * @Description: TODO
 * @date Date : 2021/03/23
 */
@Log4j2
@RestController
public class ConsumerController {

    @Resource
    private RemoteProviderService remoteProviderService;

    @GetMapping(value = "/getEchoMsg/{msg}")
    public String getEchoMsg(@PathVariable(value = "msg") String msg) {
        return remoteProviderService.echoMsg(msg);
    }
}