import java.util.Scanner;

public class Ex08_조건문예제3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Java 점수 입력 : ");
	    int num1 = sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int num3 = sc.nextInt();
		
		if(((num1+num2+num3)/3)>80) {
			System.out.println("합격");
		}

	}

}
