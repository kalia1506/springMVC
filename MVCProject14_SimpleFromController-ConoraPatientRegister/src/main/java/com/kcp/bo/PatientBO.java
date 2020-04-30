package com.kcp.bo;
import java.util.Date;

import lombok.Data;

@Data
public class PatientBO {
	private String pName;
	private Date DOB;
	private String gender;
	private Long phoneNo;
	private String address;
}
