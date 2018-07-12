package com.sunru.track.vehicle.model.entity;

public class User {
	
	private Long Id;
	private String username;
	private String companyname;
	private String email;
	private String usertype;
	private String telno;
	private String mobileno;
	private String password;
	private String repertpassword;
	
	public User() {
		
	}

	public User(String username, String companyname, String email, String usertype, String telno, String mobileno,
			String password, String repertpassword) {
		super();
		this.username = username;
		this.companyname = companyname;
		this.email = email;
		this.usertype = usertype;
		this.telno = telno;
		this.mobileno = mobileno;
		this.password = password;
		this.repertpassword = repertpassword;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getTelno() {
		return telno;
	}

	public void setTelno(String telno) {
		this.telno = telno;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepertpassword() {
		return repertpassword;
	}

	public void setRepertpassword(String repertpassword) {
		this.repertpassword = repertpassword;
	}
	
	
	
	

}
