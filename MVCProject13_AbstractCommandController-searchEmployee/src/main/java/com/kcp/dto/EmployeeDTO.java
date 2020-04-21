package com.kcp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class EmployeeDTO {

	private String ename;
	private Integer empno;
	private  String ejob;
	private Double esal;

}
