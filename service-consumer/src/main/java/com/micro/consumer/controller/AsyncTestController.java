package com.micro.consumer.controller;

import com.micro.api.RemoteAsyncService;
import com.micro.api.util.DateFormatUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-05-03 15:24
 * @Version V1.0
 */
@Log4j2
@RestController
public class AsyncTestController {

    @Autowired
    private RemoteAsyncService remoteAsyncService;

    @GetMapping(value = "/testAsyncService")
    public void testAsyncService() {
        log.info("消费端正常执行...");
        remoteAsyncService.invokeAsyncService();
        log.info("消费端执行结束!");
    }
}