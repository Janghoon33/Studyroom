import java.util.Scanner;

public class Ex05_시분초 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력 : ");
		
		int num1 = sc.nextInt();
		
		System.out.println((num1/3600) + "시" + ((num1%3600)/60) + "분" + (num1%60) + "초");

	}

}
