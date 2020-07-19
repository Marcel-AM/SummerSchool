package com.summerSchool.firstProject.entities;

import java.security.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="USER_DETAILS_ID")
	private UserDetailsEntity userDetailsEntity;
}
