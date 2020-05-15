package com.kcp.command;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
@Data
public class StudentCommand {
	private String name;
	private String address;
	private MultipartFile photo;
	private MultipartFile resume;
}
