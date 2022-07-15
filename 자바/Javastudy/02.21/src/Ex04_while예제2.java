import java.util.Scanner;

public class Ex04_while예제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		//num값들을 누적해서 저장시켜주는 변수
		int total = 0;
		int num = 0;
//		while(num != -1) {
//			total += num;
//			System.out.print("숫자 입력 : ");
//			num = sc.nextInt();
		    
//		}
		while(true) {
			total += num;
			System.out.print("숫자 입력: ");
			num = sc.nextInt();
			if(num == -1) {
				break;
			}
		}
            System.out.println("누적된 결과는 : " + total);
	}

}
