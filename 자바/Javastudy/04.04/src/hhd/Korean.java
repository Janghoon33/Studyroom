package hhd;

public class Korean extends Language{

	public String getTitleMSG() {
		return "===자판기 프로그램===";
	}
	public String getInputMoneyMSG() {
		return "돈을 넣으세요 >> ";
	}
	public String getChoiceMSG() {
		return "메뉴를 선택하세요";
	}
	public String getNoMoneyMSG() {
		return "돈이 부족합니다.";
	}
	public String getChangeMSG(int money) {
		return "현재 " + money + "원이 남았습니다.";
	}
	
}
