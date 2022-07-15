package hhd;

public class MenuDTO {
	// 데이터를 저장하기 위한 필드
	private int menu_num;
	private String menu_name;
	private int menu_price;
	
	
	// 메소드
	// 1. 데이터 초기화 및 객체생성을 위한 생성자
	// 2. 데이터 수정을 위한 setter 메소드
	// 3. 데이터를 꺼내주기 위한 getter 메소드
	
	public MenuDTO(int menu_num, String menu_name, int menu_price) {
		super();
		this.menu_num = menu_num;
		this.menu_name = menu_name;
		this.menu_price = menu_price;
	}


	public int getMenu_num() {
		return menu_num;
	}


	public void setMenu_num(int menu_num) {
		this.menu_num = menu_num;
	}


	public String getMenu_name() {
		return menu_name;
	}


	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}


	public int getMenu_price() {
		return menu_price;
	}


	public void setMenu_price(int menu_price) {
		this.menu_price = menu_price;
	}
	
	
	
}
