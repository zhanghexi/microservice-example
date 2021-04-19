package com.micro.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author : Lucien
 * @version V1.0
 * @Description: TODO
 * @date Date : 2021/03/23
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.micro.provider.data.mapper"})
public class ProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }
}