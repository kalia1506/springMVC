package com.kcp.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class StudentDTO implements Serializable {
	private String name;
	private Integer rollNo;
	private String address;
	private Integer totalMark;
	private String result;
	private Double avgMark;
}
