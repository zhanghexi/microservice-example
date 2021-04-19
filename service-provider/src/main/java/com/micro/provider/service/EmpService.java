package com.micro.provider.service;

import com.micro.provider.data.entity.EmpInfo;

import java.util.List;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-04-19 15:52
 * @Version V1.0
 */
public interface EmpService {

    /**
     * 带条件模糊分页查询
     *
     * @param info
     * @return
     */
    List<EmpInfo> getEmpInfosByCondition(EmpInfo info);
}