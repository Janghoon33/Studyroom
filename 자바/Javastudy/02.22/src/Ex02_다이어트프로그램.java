import java.util.Scanner;

public class Ex02_다이어트프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int cur = sc.nextInt();
		
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		int cnt = 1;
		int weight = 0;
		while(true) {
			System.out.print(cnt + "주차 감량 몸무게 : "); 
		    weight = sc.nextInt();
		    cnt++;
		    cur -= weight;
		    if(cur<=goal) {
		    	System.out.println("축하합니다!");
		    	System.out.println("현재 몸무게 : "+cur);
		    	break;
		    }
		    }
		
			
		
		
		
		
		
	}

}
