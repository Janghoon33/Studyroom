import java.util.Scanner;

public class Ex03_while문예제1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num = 0;
		//1번째 방식
//        while(num<10) {
//        	System.out.print("숫자 입력 : ");
//        	num = sc.nextInt();
//        }
//		System.out.println("종료되었습니다!");
		//2번째 방식
		while(true) {
			System.out.print("숫자입력 : ");
			num = sc.nextInt();
			if(num>=10) {
				break;
			}
		}
		System.out.println("종료되었습니다!");
		
		
	}

}
