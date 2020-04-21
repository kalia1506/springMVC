package com.kcp.bo;

import lombok.Data;

@Data
public class StudentBO {
	private String name;
	private Integer rollNo;
	private String address;
	private Integer totalMark;
	private String result;
	private Double avgMark;
}
