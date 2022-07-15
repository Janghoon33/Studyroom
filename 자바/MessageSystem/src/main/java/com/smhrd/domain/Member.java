package com.smhrd.domain;

public class Member {
	
	private String email;
	private String pw;
	private String tel;
	private String address;
	
	public Member(String email, String pw, String tel, String address) {
		super();
		this.email = email;
		this.pw = pw;
		this.tel = tel;
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public String getPw() {
		return pw;
	}

	public String getTel() {
		return tel;
	}

	public String getAddress() {
		return address;
	}

	public Member(String email, String pw) {
		super();
		this.email = email;
		this.pw = pw;
	}
	
	
	
}
