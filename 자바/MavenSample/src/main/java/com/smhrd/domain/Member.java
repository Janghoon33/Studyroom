package com.smhrd.domain;

public class Member {
	private String id;
	private String pw;
	private String nick;
	
	public Member(String id, String pw, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}
	
	public Member(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getNick() {
		return nick;
	}
	
	
	
}
