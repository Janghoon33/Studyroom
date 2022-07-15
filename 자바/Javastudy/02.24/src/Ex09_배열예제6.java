import java.util.Scanner;

public class Ex09_배열예제6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ans = {1,4,3,2,1};
		int[] user = new int[5];
		int cnt = 0;
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		for(int i = 0; i<user.length;i++) {
			System.out.print((i+1)+"번답 >>");
			user[i] = sc.nextInt();
		}
		System.out.println("정답확인");
		for(int i = 0; i<user.length;i++) {
			if(user[i]==ans[i]) {
				System.out.print("O ");
				cnt++;
			}else {
				System.out.print("X ");
			}
			}
			System.out.print("총 점 : "+ 20*cnt);
		}
		
		
		
		
		
		
		
		
		
		
		
	}


