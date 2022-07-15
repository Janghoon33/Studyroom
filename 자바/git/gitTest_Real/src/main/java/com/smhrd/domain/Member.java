package com.smhrd.domain;

public class Member {
	private String mem_id;
	private String mem_pw;
	private String mem_nick;
	private String mem_email;
	
	
	public Member(String mem_id, String mem_pw, String mem_nick, String mem_email) {
		super();
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_nick = mem_nick;
		this.mem_email = mem_email;
		
		
	}
	
	public Member(String mem_id, String mem_pw) {
		super();
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
	}
	
	
	public String getMem_id() {
		return mem_id;
	}
	public String getMem_pw() {
		return mem_pw;
	}
	public String getMem_nick() {
		return mem_nick;
	}
	public String getMem_email() {
		return mem_email;
	}

		
	
}
