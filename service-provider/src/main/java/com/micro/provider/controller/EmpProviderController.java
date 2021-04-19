package com.micro.provider.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.micro.api.constants.ApiResult;
import com.micro.api.dto.EmpDTO;
import com.micro.api.util.ResultUtil;
import com.micro.provider.data.entity.EmpInfo;
import com.micro.provider.service.EmpService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: TODO
 * @Author : Lucien
 * @Date Date : 2021-04-19 17:34
 * @Version V1.0
 */
@Log4j2
@RestController
public class EmpProviderController {

    @Autowired
    private EmpService empService;

    @PostMapping(value = "/api/getEmpInfosByCondition")
    public ApiResult getEmpInfosByCondition(@RequestBody EmpDTO empDTO) {
        //这行是重点（放在方法第一行）表示从pageNum页开始，每页pageSize条数据
        /*Page page = */
        PageHelper.startPage(empDTO.getPageNum(), empDTO.getPageSize());
        EmpInfo info = new EmpInfo();
        BeanUtils.copyProperties(empDTO, info);
        List<EmpInfo> resultList = empService.getEmpInfosByCondition(info);
        PageInfo pageInfo = new PageInfo<>(resultList);
        return ResultUtil.success(pageInfo);
    }
}