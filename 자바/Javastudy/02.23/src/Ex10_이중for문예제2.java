import java.util.Scanner;

public class Ex10_이중for문예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("어느 수까지 출력 : ");
		int num2 = sc.nextInt();
		System.out.println(num1+"단");
		for(int i = 1; i<=num2; i++) {
			System.out.println(num1+"*"+i+"="+num1*i);
		}
		
		
		
		
		
		

	}

}
