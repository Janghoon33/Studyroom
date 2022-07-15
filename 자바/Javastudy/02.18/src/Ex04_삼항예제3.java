import java.util.Scanner;

public class Ex04_삼항예제3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();
//		(ball % 5 > 0) ? //5의 배수가 아닐때 // 5의 배수일때
		int box = (ball % 5 > 0) ? (ball/5 + 1) : (ball/5);
		
		
		
		
		
		
		
		
	}

}
