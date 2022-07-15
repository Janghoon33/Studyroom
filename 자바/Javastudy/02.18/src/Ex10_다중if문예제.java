import java.util.Scanner;

public class Ex10_다중if문예제 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("학점을 입력해주세요 : ");
        int grade = sc.nextInt();
        
        if(grade>=90) {
        	System.out.println("A학점입니다.");
        }
        else if(80<=grade) {
			System.out.println("B학점입니다.");
		}
        else if(70<=grade) {
        	System.out.println("C학점입니다.");
        }
        else {
        	System.out.println("휴학 ㄱ");
        }
	}

}
