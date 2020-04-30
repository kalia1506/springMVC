package com.kcp.commandClass;

import lombok.Data;

@Data
public class PatientCMD {
	private String pName;
	private Integer age;
	private String gender;
	private Long phoneNo;
	private String address;

	public PatientCMD() {
		System.out.println("PatientCMD.PatientCMD()");
	}
}
