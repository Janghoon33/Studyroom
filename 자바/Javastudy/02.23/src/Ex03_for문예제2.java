import java.util.Scanner;

public class Ex03_for문예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}

		} else if (num2 > num1) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}

		}
//      삼항연산자 이용
//		int big = (num1>num2)? num1 : num2;
//		int small = (num2>num1)? num1 : num2;
//		for(int i = small; i<= big; i++) {
//			System.out.print(i);
//		}
		
	}

}
