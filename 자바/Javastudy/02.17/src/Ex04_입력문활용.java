import java.util.Scanner;

public class Ex04_입력문활용 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("두수의 더하기 : " + (num1+num2));
		System.out.println("두수의 빼기 : " + (num1-num2));
		System.out.println("두수의 곱하기 : " + (num1*num2));
		System.out.println("두수의 나누기(몫) : " + (num1/num2));
		
		

	}

}
