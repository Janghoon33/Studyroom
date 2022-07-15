import java.util.Random;
import java.util.Scanner;

public class Ex04_랜덤더하기게임 {

	public static void main(String[] args) {
        
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int crt = 0;
		int wrg = 0;
		while(true) {
			int num1 = rd.nextInt(10)+1;
			int num2 = rd.nextInt(10)+1;
		System.out.print(num1+"+"+num2+"=");
		int input = sc.nextInt();
		if(num1+num2 == input) {
			System.out.println("Success!");
			crt++;
		}else {
			System.out.println("Fail!");
			wrg++;
		}
		System.out.print("계속하시겠습니까? ");
		String ans = sc.next();
				
		if(ans.equals("Y")) {
			
			continue;
		}
		else if(ans.equals("N")) {
			System.out.println("종료!");	
			System.out.println("맞춘 개수는 " + crt + "개");
			System.out.println("틀린 개수는 " + wrg + "개" );
			break;
			}
		
		
		}
		}
		
		
	

}
