package com.micro.provider.service.impl;

import com.micro.api.util.DateFormatUtil;
import com.micro.provider.service.ProvideAsyncService;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-05-03 15:44
 * @Version V1.0
 */
@Log4j2
@Service
public class ProvideAsyncServiceImpl implements ProvideAsyncService {

    /**
     * 此处为异步调用方法的实现，要加该注解
     */
    @Async
    @Override
    public void invokeAsyncService() {
        log.info("远程异步调用provider服务开始，开始时间：" + DateFormatUtil.getCurrentDateTime(new Date()));
        try {
            TimeUnit.MILLISECONDS.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("远程异步调用provider服务结束，结束时间：" + DateFormatUtil.getCurrentDateTime(new Date()));
    }
}