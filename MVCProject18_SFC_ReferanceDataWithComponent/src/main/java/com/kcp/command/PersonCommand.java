package com.kcp.command;

import lombok.Data;

@Data
public class PersonCommand {
	private String pName;
	private Integer pAge;
	private String gender="male";
	private String[] hobies= {"Gardening","Cricket"};
	private String[] courses= {"Java","RectJs"};
	private String qlfy="MCA";
}
