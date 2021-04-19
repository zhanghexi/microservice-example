package com.micro.provider.service.impl;

import com.micro.provider.data.entity.EmpInfo;
import com.micro.provider.data.mapper.EmpInfoMapper;
import com.micro.provider.service.EmpService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-04-19 16:40
 * @Version V1.0
 */
@Service
@Log4j2
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpInfoMapper empInfoMapper;

    @Override
    public List<EmpInfo> getEmpInfosByCondition(EmpInfo info) {
        return empInfoMapper.getEmpInfosByCondition(info);
    }
}
