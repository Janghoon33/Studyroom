import java.util.Scanner;

public class Ex01_홀짝구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int odd = 0;
		int even = 0;
		
		while(true) {
			System.out.print("숫자입력 : ");
			num = sc.nextInt();
		if(num==-1) {
			break;
		}
		if(num%2 == 1) {
			odd++;
		}else if(num%2 == 0) {
			even++;
		}
		}System.out.println("홀수의 개수 : "+ odd);
		System.out.println("짝수의 개수 : "+ even);
		
		System.out.println("종료!");
		
		
		
		
		
		
		
		
		
	}

}
