import java.util.Scanner;

public class Ex03_로그인프로그램 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 1; 
		while(true) {
			System.out.print("아이디 입력 : ");
			String id = sc.next();
				
			System.out.print("비밀번호 입력 : ");
			String pswd = sc.next();
			
			
			if(id.equals("smhrd")&&pswd.equals("1234")) {
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("로그인 실패");
			    System.out.print("계속하시겠습니까? ");
				String ans = sc.next();	
				if(ans.equals("N")) {
					break;
				}else if(ans.equals("Y")) {
					if(cnt >= 3) {
						System.out.println("본인인증을 하십시오");
						break;
						
					}
					cnt++;
					
				}
			}
			
		}
		
		
		
	}

}
