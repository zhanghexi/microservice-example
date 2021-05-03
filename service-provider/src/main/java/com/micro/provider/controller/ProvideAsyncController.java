package com.micro.provider.controller;

import com.micro.provider.service.ProvideAsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-05-03 15:38
 * @Version V1.0
 */
@RestController
@RequestMapping(value = "/api")
public class ProvideAsyncController {

    @Autowired
    private ProvideAsyncService provideAsyncService;

    @GetMapping(value = "/invokeAsyncService")
    public void invokeAsyncService() throws InterruptedException {
        provideAsyncService.invokeAsyncService();
    }
}