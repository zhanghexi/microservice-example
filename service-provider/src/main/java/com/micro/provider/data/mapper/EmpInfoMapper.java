package com.micro.provider.data.mapper;

import com.micro.provider.data.entity.EmpInfo;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface EmpInfoMapper extends Mapper<EmpInfo> {

    /**
     * 带条件模糊查询
     * @param info
     * @return
     */
    List<EmpInfo> getEmpInfosByCondition(@Param("param") EmpInfo info);
}