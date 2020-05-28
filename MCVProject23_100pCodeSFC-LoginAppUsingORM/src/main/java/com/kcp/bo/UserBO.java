package com.kcp.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "userlist")
public class UserBO {
	@Id
	@Column(name = "username")
	private String uName;
	@Column(name = "password")
	private String uPwd;
}
