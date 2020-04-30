package com.kcp.commandClass;
import java.util.Date;

import lombok.Data;

@Data
public class PatientCMD {
	private String pName;
	private Date DOB;
	private String gender;
	private Long phoneNo;
	private String address;
}
