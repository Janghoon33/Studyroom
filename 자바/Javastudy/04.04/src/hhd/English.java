package hhd;

public class English extends Language{

	public String getTitleMSG() {
		return "===VendingMachine program===";
	}
	public String getInputMoneyMSG() {
		return "Insert coin >> ";
	}
	public String getChoiceMSG() {
		return "Select menu";
	}
	public String getNoMoneyMSG() {
		return "Not enough money";
	}
	public String getChangeMSG(int money) {
		return "You have " + money + "won left";
	}
	
	
	
	
	
}
