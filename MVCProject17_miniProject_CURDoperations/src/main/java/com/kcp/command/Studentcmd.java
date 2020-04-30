package com.kcp.command;

import lombok.Data;

@Data
public class Studentcmd {
	private String name;
	private Integer rollNo;
	private String address;
	private Integer totalMark;
	private String result;
	private Double avgMark;
	public Studentcmd() {
		System.out.println("Studentcmd.Studentcmd()");
	}
}
