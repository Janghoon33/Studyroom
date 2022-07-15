package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.Member_info;
import controller.Playgame;
import controller.Poc_image;
import controller.SaveLoad;
import model.pocketmon_default;

public class StartMain {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Member_info member = new Member_info();
      pocketmon_default monP = null;
      String id = null;
      
      while (true) {
         System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
         int choice = sc.nextInt();

         if (choice == 2) {

            System.out.print("아이디 : ");
            id = sc.next();
            System.out.print("비밀번호 : ");
            String pw = sc.next();

            if (member.login(id, pw) == 1) {
               System.out.println("로그인 성공");
               System.out.println("[1]새 게임  [2]불러오기  >> ");
               int choice2 = sc.nextInt();
               if (choice2 == 2) {
                  SaveLoad ld = new SaveLoad();
                  monP = ld.Load(id);
                  break;
                  
               	} else if (choice2 == 1) {
                  System.out.println("새로운 모험을 시작합니다.");

                  // 스타팅 포켓몬 선택 페이지
                  //pocketmon_default monP;
                  pocketmon_default mon1 = new pocketmon_default("꼬부기", 1, 100, 100, 0, "몸통박치기", "level 2에 습득",
                        "level 3에 습득", id);
                  pocketmon_default mon4 = new pocketmon_default("파이리", 1, 100, 100, 0, "화염방사", "level 2에 습득",
                        "level 3에 습득", id);
                  pocketmon_default mon7 = new pocketmon_default("이상해씨", 1, 100, 100, 0, "몸통박치기", "level 2에 습득",
                        "level 3에 습득", id);

                  Scanner mc = new Scanner(System.in);
                  System.out.println("스타팅 포켓몬을 고르시오..");
                  System.out.println("1.[꼬부기] 2.[파이리] 3.[이상해씨]");
                  System.out.print("입력 >> ");
                  int selectP = mc.nextInt();
                  if (selectP == 1) {
                      Poc_image ggobuk = new Poc_image();
                            ggobuk.ggobuk();
                     System.out.println("꼬부기를 선택했다!");
                     monP = mon1;
                  } else if (selectP == 2) {
                     Poc_image piri = new Poc_image();
                            piri.piri();
                     System.out.println("파이리를 선택했다!");
                     monP = mon4;
                  } else if (selectP == 3) {
                      Poc_image hae = new Poc_image();
                            hae.haessi();
                     System.out.println("이상해씨를 선택했다!");
                     monP = mon7;
                  }
                  break;
               }
            } else {
               System.out.println("로그인 실패. 다시 시도해주십시오.");
            }

         }

         if (choice == 1) {
            System.out.print("가입할 아이디 : ");
            id = sc.next();
            System.out.print("가입할 비밀번호 : ");
            String pw = sc.next();
            member.join(id, pw);

         }
         if (choice == 3) {
            System.out.println("게임을 종료합니다.");
            break;
         }
        
      }

      Playgame play = new Playgame(monP, id);
      play.Play(null);
      

   }

}