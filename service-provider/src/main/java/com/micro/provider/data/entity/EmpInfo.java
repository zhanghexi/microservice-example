package com.micro.provider.data.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Getter
@Setter
@Table(name = "EMP_INFO")
public class EmpInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 员工姓名
     */
    @Column(name = "EMP_NAME")
    private String empName;

    /**
     * 员工地址
     */
    @Column(name = "EMP_ADDRESS")
    private String empAddress;

    /**
     * 员工薪资
     */
    @Column(name = "EMP_SALARY")
    private BigDecimal empSalary;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", empName=").append(empName);
        sb.append(", empAddress=").append(empAddress);
        sb.append(", empSalary=").append(empSalary);
        sb.append("]");
        return sb.toString();
    }
}