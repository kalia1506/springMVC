package com.kcp.commandClass;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class PatientCMD {
	@NotEmpty(message = "name is required1")
	private String pName;
	@NotNull(message = "age is required1")
	@Range(min = 1,max = 99,message = "age should be 1 to 99")
	private Integer age;
	@NotEmpty(message = "gender is required1")
	private String gender;
	@NotNull(message = "phoneNo is required1")
	@Range(min=10,message = "mobile number should be 10")
	private Long phoneNo;
	@NotEmpty(message = "address is required1")
	@Length(min = 3,max = 10,message = "address should be 3 to 10")
	private String address;

	public PatientCMD() {
		System.out.println("PatientCMD.PatientCMD()");
	}
}
