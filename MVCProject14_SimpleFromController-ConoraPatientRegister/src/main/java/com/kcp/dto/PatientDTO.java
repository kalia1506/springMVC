package com.kcp.dto;
import java.util.Date;

import lombok.Data;

@Data
public class PatientDTO {
	private String pName;
	private Date DOB;
	private String gender;
	private Long phoneNo;
	private String address;
}
