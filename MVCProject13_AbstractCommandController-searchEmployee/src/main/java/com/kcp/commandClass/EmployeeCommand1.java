package com.kcp.commandClass;

import java.util.Date;

import lombok.Data;

@Data
public class EmployeeCommand1 {
	private Integer empno;
	private String ename;
	private  String ejob;
	private Double esal;
	private Integer mgr;
	private Date hireDate;
	private Double comm;
	private Integer deptno;

}
