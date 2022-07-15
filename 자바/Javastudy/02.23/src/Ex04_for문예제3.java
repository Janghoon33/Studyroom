import java.util.Scanner;

public class Ex04_for문예제3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("시작값 : ");
		int num1 = sc.nextInt();
		System.out.print("끝값 : ");
		int num2 = sc.nextInt();
        int total = 0;
		for(int i = num1; i<=num2; i++) {
			total += i;
		}
		System.out.print("총합은 " + total);
		
		
		
		
		
	}

}
