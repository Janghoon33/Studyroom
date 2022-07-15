package java_test;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		while(true) {
			System.out.print("id : ");
			String id = sc.next();
			System.out.print("pw : ");
			int pw = sc.nextInt();
			
			if(id.equals("dldmsql")&&pw==1234) {
				System.out.println("dldmsql님 환영합니다!");
				break;
				}
			else {
					System.out.println("다시 확인하세요!");
				}
		}
		
		
	}
	
}
	

