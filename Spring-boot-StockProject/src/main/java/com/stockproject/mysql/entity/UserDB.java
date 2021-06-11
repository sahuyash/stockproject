package com.stockproject.mysql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Userdb")
public class UserDB {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private long id;
	@Column(name="User Name")
	private String userName;
	@Column(name="Password")
	private String password;
	@Column(name="UserType")
	private String usertype;
	public UserDB(String id, String userName, String password, String usertype, String email, String mobileNumber,
			boolean confirmed) {
		super();
		this.userName = userName;
		this.password = password;
		this.usertype = usertype;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.confirmed = confirmed;
	}
	@Column(name="E-mail")
	private String email;
	@Column(name="Mobile number")
	private String mobileNumber;
	@Column(name="Confirmed")
	private boolean confirmed;
	public long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

}
