package 추상클래스;

public class Main2 {

	public static void main(String[] args) {
		TempEmployee temp = new TempEmployee("SMHRD002","박O수",3000);
		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay()+"만원");
		
		System.out.println();
		
		PartTimeEmployee partTime = new PartTimeEmployee("SMHRD003","김O독", 10, 10);
		System.out.println(partTime.print());
		System.out.println(partTime.getMoneyPay());
		
		
		
	}

}
