package com.kcp.bo;

import lombok.Data;

@Data
public class PatientBO {
	private String pName;
	private Integer age;
	private String gender;
	private Long phoneNo;
	private String address;
}
