package com.smhrd.domain;

public class SelectExmember {

	private String ex_name;
	private String ex_team;
	private String Title;
	private String ex_id;
	
	
	
	public SelectExmember(String ex_name, String ex_team, String title) {
		super();
		this.ex_name = ex_name;
		this.ex_team = ex_team;
		this.Title = title;
	}
	
	public SelectExmember(String ex_name, String ex_team, String title, String ex_id) {
		super();
		this.ex_name = ex_name;
		this.ex_team = ex_team;
		this.Title = title;
		this.ex_id = ex_id;
	}	




	public String getEx_name() {
		return ex_name;
	}

	public String getEx_team() {
		return ex_team;
	}

	public String getTitle() {
		return Title;
	}

	public String getEx_id() {
		return ex_id;
	}
	
	
	
}
