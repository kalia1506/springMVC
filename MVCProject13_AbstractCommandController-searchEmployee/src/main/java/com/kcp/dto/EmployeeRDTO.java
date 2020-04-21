package com.kcp.dto;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class EmployeeRDTO extends EmployeeDTO {
	private Integer mgr;
	private Date hireDate;
	private Double comm;
	private Integer deptno;
	
	@Override
	public String toString() {
		return "EmployeeRDTO [mgr=" + mgr + ", hireDate=" + hireDate + ", comm=" + comm + ", deptno=" + deptno
				+ ", toString()=" + super.toString() + "]";
	}
	
}
