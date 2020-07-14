package com.summerSchool.firstProject.entities;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class UserEntity {

	@Id
	private String username;
	
	@Column
	private String password;
	
	@Column(name="LAST_LOGIN")
	private Timestamp lastLogin;
}
