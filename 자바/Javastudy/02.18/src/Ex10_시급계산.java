import java.util.Scanner;

public class Ex10_시급계산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한 시간을 입력해주세요 : ");
		int time = sc.nextInt();
		int money;
		
		if(time>8) {
			money = (int)((time-8)*9000*1.5)+8*9000;
		}
		else {
			money = (time*9000);
		}
		System.out.println("계산값 : " + money);
	
	
	    
	
	
	
	}
	
}
