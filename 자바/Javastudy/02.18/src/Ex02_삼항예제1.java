import java.util.Scanner;

public class Ex02_삼항예제1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 : ");
		int number = sc.nextInt();
		
		String result = (number%2==0) ? "짝수" : "홀수";
		System.out.println("내가 입력한 숫자는 " + result + "입니다");
		
		
		
	}

}
