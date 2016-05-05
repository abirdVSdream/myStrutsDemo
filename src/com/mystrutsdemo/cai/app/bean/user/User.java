package com.mystrutsdemo.cai.app.bean.user;

import java.sql.Timestamp;

public class User
{
	private int uid;
	private String username;
	private String password;
	private String email;
	private String gender;
	private Timestamp birthday;
	private String qq;
	private String phone;
	private String description;
	private Timestamp regtime;
	
	public User(){}
	
	
	
	public User(int uid, String username, String password, String email, String gender, Timestamp birthday, String qq,
			String phone, String description, Timestamp regtime) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.birthday = birthday;
		this.qq = qq;
		this.phone = phone;
		this.description = description;
		this.regtime = regtime;
	}



	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Timestamp getBirthday() {
		return birthday;
	}
	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getRegtime() {
		return regtime;
	}
	public void setRegtime(Timestamp regtime) {
		this.regtime = regtime;
	}
	
	

}
