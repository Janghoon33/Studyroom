package com.smhrd.domain;

import java.security.Timestamp;

public class ExMember {
	private String ex_id;
	private String ex_pw;
	private String ex_name;
	private String ex_team;
	private String ex_phone;

	
	public ExMember(String ex_id, String ex_pw, String ex_name, String ex_team, String ex_phone ) {
		super();
		this.ex_id = ex_id;
		this.ex_pw = ex_pw;
		this.ex_name = ex_name;
		this.ex_team = ex_team;
		this.ex_phone = ex_phone;
		
		
		
	}
	
	
	public ExMember(String ex_id, String ex_pw) {
		super();
		this.ex_id = ex_id;
		this.ex_pw = ex_pw;
	
		
		
	}
	
	
	
	public String getEx_id() {
		return ex_id;
	}
	public String getex_pw() {
		return ex_pw;
	}
	public String getex_name() {
		return ex_name;
	}
	public String getex_team() {
		return ex_team;
	}
	public String getex_phone() {
		return ex_phone;
	}


}
