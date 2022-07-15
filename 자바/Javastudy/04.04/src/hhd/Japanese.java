package hhd;

public class Japanese extends Language{
	
	public String getTitleMSG() {
		return "===自動販売機プログラム===";
	}
	public String getInputMoneyMSG() {
		return "お金を入れてください >> ";
	}
	public String getChoiceMSG() {
		return "メニューを選択してください";
	}
	public String getNoMoneyMSG() {
		return "お金がたりません.";
	}
	public String getChangeMSG(int money) {
		return "現在 " + money + "ワンが残ってます.";
	}
	
}
