package com.smhrd.domain;

public class Member {
	
	private String id;
	private String pw;
	private String nick;
	private String email;
	private String tel;
	
	public Member(String id, String pw, String nick, String email, String tel) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
		this.email = email;
		this.tel = tel;
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

	public String getEmail() {
		return email;
	}

	public String getTel() {
		return tel;
	}


	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	
	
	
	
}
