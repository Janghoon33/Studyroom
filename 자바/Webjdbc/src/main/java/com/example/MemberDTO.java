package com.example;

public class MemberDTO {
	
	// 외부에서 필드에 접근하지 않고
	// getter, setter 통해서 접근하도록
	// 접근제한 private
	private String id;
	private String pw;
	private String nick;
	
	public MemberDTO(String id, String pw, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}
	
	public MemberDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
	
	
	
	
	
}
