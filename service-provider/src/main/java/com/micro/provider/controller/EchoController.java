package com.micro.provider.controller;

import com.micro.provider.service.ProviderService;
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
@RestController
public class EchoController {

    @Resource
    private ProviderService providerService;

    @GetMapping(value = "/echo/{msg}")
    public String echoMsg(@PathVariable(value = "msg") String msg) {
        return providerService.echoMessage(msg);
    }
}