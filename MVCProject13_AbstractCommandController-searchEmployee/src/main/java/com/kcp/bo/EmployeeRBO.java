package com.kcp.bo;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeRBO extends EmployeeBO {
private Integer mgr;
private Date hireDate;
private Double comm;
private Integer deptno;
}
