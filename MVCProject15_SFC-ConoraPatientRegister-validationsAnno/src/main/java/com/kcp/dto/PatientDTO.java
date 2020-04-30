package com.kcp.dto;

import lombok.Data;

@Data
public class PatientDTO {
	private String pName;
	private Integer age;
	private String gender;
	private Long phoneNo;
	private String address;
}
