import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      DTO dto = new DTO();
      
      while(true) {
         System.out.print("[1]가입 [2]조회 [3]수정 [4]삭제 [5]종료 >> ");
         int choice = sc.nextInt();
         
         if(choice == 1) {
            
            System.out.print("가입 아이디 : ");
            String id = sc.next();
            System.out.print("가입 비밀번호 : ");
            String pw = sc.next();
            System.out.print("가입 이름 : ");
            String name = sc.next();
            System.out.print("가입 나이 : ");
            int age = sc.nextInt();
            
            int result = dto.insert(id, pw, name, age);
            
            if(result > 0) {
               System.out.println("회원가입 성공!");
            }
            
         }else if(choice == 2) {
            
         }else if(choice == 3) {
            
         }else if(choice == 4) {
            
         }else if(choice == 5) {
            System.out.println("프로그램 종료");
            break;
         }
      }
      
   }

}