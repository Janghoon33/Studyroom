package com.smhrd.domain;

public class Write {
	
	private int write_num;
	private String ex_id;
	private String Title;
	private String Price1;
	private String Pricetext1;
	private String Caretext1;
	
	
	
	
	public Write(int write_num,String ex_id, String Title, String Price1, String Pricetext1,String Caretext1) {
		super();
		this.write_num = write_num;
		this.ex_id = ex_id;
		this.Title = Title;
		this.Price1 = Price1;
		this.Pricetext1 = Pricetext1;
		this.Caretext1 = Caretext1; 
		
	}
	





	public Write(String ex_id, String title, String price1, String pricetext1, String caretext1)
			 {
		super();
		this.ex_id = ex_id;
		Title = title;
		Price1 = price1;
		Pricetext1 = pricetext1;
		Caretext1 = caretext1;
		
	}






	public String getEx_id() {
		return ex_id;
	}



	public String getTitle() {
		return Title;
	}



	


	public String getPrice1() {
		return Price1;
	}




	public String getPricetext1() {
		return Pricetext1;
	}




	public String getCaretext1() {
		return Caretext1;
	}



	


	
	
}
