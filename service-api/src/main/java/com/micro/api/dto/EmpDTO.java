package com.micro.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Description: 查询员工信息的传输对象
 * @Author : Lucien
 * @Date Date : 2021-04-19 21:35
 * @Version V1.0
 */
@Data
public class EmpDTO implements Serializable {

    private String empName;
    private String empAddress;
    /*private BigDecimal empSalary;*/

    private Integer pageNum;
    private Integer pageSize;
}