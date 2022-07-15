package controller;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import model.pocketmon_default;
import view.StartMain;

public class Playgame {
   int EXP = 0;
   int lv = 1;
   int hp = 100;
   int MaxHP = 100;

   ArrayList<StartMain> monList = new ArrayList();
   pocketmon_default monP;
   String name;
   String skill1;
   String skill2;
   String skill3;
   String id;

   public Playgame(pocketmon_default monP, String id) {
      this.monP = monP;
      this.id = id;
   }

   // String name, int lv, int HP, int MaxHP, int EXP, String skill1 , String
   // skill2, String skill3
   pocketmon_default mon1 = new pocketmon_default("꼬부기", 1, 100, 100, 0, "몸통박치기", "level 2에 습득", "level 3에 습득", id);
   pocketmon_default mon2 = new pocketmon_default("어니부기", lv, hp, 200, EXP, "몸통박치기", "물대포", "level 3에 습득", id);
   pocketmon_default mon3 = new pocketmon_default("거북왕", lv, hp, 300, EXP, "몸통박치기", "물대포", "하이드로펌프", id);

   pocketmon_default mon4 = new pocketmon_default("파이리", 1, 100, 100, 0, "화염방사", "level 2에 습득", "level 3에 습득", id);
   pocketmon_default mon5 = new pocketmon_default("리자드", lv, hp, 200, EXP, "화염방사", "불꽃엄니", "level 3에 습득", id);
   pocketmon_default mon6 = new pocketmon_default("리자몽", lv, hp, 300, EXP, "화염방사", "불꽃엄니", "플레어드라이브", id);

   pocketmon_default mon7 = new pocketmon_default("이상해씨", 1, 100, 100, 0, "몸통박치기", "level 2에 습득", "level 3에 습득", id);
   pocketmon_default mon8 = new pocketmon_default("이상해풀", lv, hp, 200, EXP, "몸통박치기", "덩굴채찍", "level 3에 습득", id);
   pocketmon_default mon9 = new pocketmon_default("이상해꽃", lv, hp, 300, EXP, "몸통박치기", "덩굴채찍", "솔라빔", id);

   pocketmon_default mon10 = new pocketmon_default("또가스", 10, 100, 500, 10, "독가스", ".", ".", id);

   public void Play(ArrayList<StartMain> monList) {

      // 행동 선택 페이지
      System.out.println("포켓몬과 모험을 시작합니다.");
      Scanner sc = new Scanner(System.in);
      while (true) {
         System.out.println();
         System.out.println("1.[모험하기] 2.[휴식하기] 3.[관장에게 도전] 4.[저장하기] 5.[게임 종료]");
         System.out.print("입력 >> ");
         int choice = sc.nextInt();

         // 모험하기 페이지
         if (choice == 1) {
            Random rd = new Random();
            int number = rd.nextInt(4);
            // 야생 포켓몬 출몰
            if (number == 0) {
               Random wild1 = new Random();
               int num1 = wild1.nextInt(1);
               if (num1 == 0) {
                  wild1.nextInt();
                  String[] wildP = { "꼬렛", "피카츄", "푸린", "메타몽", "냐옹이", "내루미" };

                  String result1 = wildP[wild1.nextInt(6)];
                  System.out.println("야생의 " + result1 + "이/가 나타났다!!");
                  switch (result1) {
                  case "꼬렛":
                     Poc_image asd = new Poc_image();
                     asd.KKo();
                     break;
                  case "피카츄":
                     Poc_image asdf = new Poc_image();
                     asdf.Pikka();
                     break;
                  case "푸린":
                     Poc_image as = new Poc_image();
                     as.purin();
                     break;
                  case "메타몽":
                     Poc_image a = new Poc_image();
                     a.meta();
                     break;
                  case "냐옹이":
                     Poc_image asdfe = new Poc_image();
                     asdfe.nayoung();
                     break;
                  case "내루미":
                     Poc_image asdfe3 = new Poc_image();
                     asdfe3.nauemrum();
                     break;
                  }
                  System.out.println();
                  System.out.println("1.[공격한다] 2.[도망간다]");
                  System.out.print("입력 >> ");
                  Scanner sc1 = new Scanner(System.in);
                  int atk = sc1.nextInt();

                  if (atk == 1) {
                     System.out.println("가라! " + monP.name + "! " + monP.skill1 + "!");

                     switch (result1) {
                     case "꼬렛":
                        System.out.println("꼬렛은 쓰러졌다..경험치 13을 획득했습니다.");
                        EXP = EXP + 13;
                        levelup();
                        System.out.println("LV. " + lv + " " + "|| 현재 경험치 : " + EXP);
                        break;
                     case "피카츄":
                        System.out.println("피카츄는 쓰러졌다..경험치 12을 획득했습니다.");
                        EXP = EXP + 12;
                        levelup();
                        System.out.println("LV. " + lv + " " + "|| 현재 경험치 : " + EXP);
                        break;
                     case "푸린":
                        System.out.println("푸린은 쓰러졌다..경험치 11을 획득했습니다.");
                        EXP = EXP + 11;
                        levelup();
                        System.out.println("LV. " + lv + " " + "|| 현재 경험치 : " + EXP);
                        break;
                     case "메타몽":
                        System.out.println("메타몽은 쓰러졌다..경험치 10을 획득했습니다.");
                        EXP = EXP + 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "|| 현재 경험치 : " + EXP);
                        break;
                     case "냐옹이":
                        System.out.println("냐옹이는 쓰러졌다..경험치 15을 획득했습니다.");
                        EXP = EXP + 15;
                        levelup();
                        System.out.println("LV. " + lv + " " + "|| 현재 경험치 : " + EXP);
                        break;
                     case "내루미":
                        System.out.println("내루미는 쓰러졌다..경험치 20을 획득했습니다.");
                        EXP = EXP + 20;
                        levelup();
                        System.out.println("LV. " + lv + " " + "|| 현재 경험치 : " + EXP);
                        break;
                     }
                  }
                  if (atk == 2) {
                     System.out.println("무사히 도망쳤다!!");
                  }
               }

            }
            // 야생열매 페이지
            else if (number == 1) {
               Random wild2 = new Random();
               int ran = wild2.nextInt(2);
               String[] wildF = { "수상한 열매", "수상한열매" };
               String result2 = wildF[ran];
               Poc_image asdfe5 = new Poc_image();
               asdfe5.apple();
               System.out.println();
               System.out.println("수상한 열매를 발견했습니다.");
               System.out.println("[1] 따먹는다 [2] 무시한다");
               System.out.print("입력>> ");
               Scanner sc1 = new Scanner(System.in);
               int num = sc1.nextInt();
               if (num == 1) {
                  switch (result2) {
                  case "수상한 열매":
                     System.out.println("맛있어 보인다! 냠냠 쩝쩝...맛있는걸?? 굉장한 맛에 놀라서 경험치 10을 획득했습니다!");
                     EXP = EXP + 10;
                     levelup();
                     System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     break;
                  case "수상한열매":
                     System.out.println("맛있어 보인다! 냠냠 쩝쩝...우웩.ㅜㅜ...너무 맛이 없어서 경험치 10을 잃었습니다..");
                     EXP = EXP - 10;
                     levelup();
                     System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     break;
                  }
               } else if (num == 2) {
                  System.out.println("엄마가 아무거나 주워먹지 말라고 하셨지..");
                  System.out.println("수상한 열매를 무시하고 진행합니다..");

               } else {
                  System.out.println("잘못된 입력입니다.");

               }

            }
            // NPC 페이지
            else if (number == 2) {
               Random rannpc = new Random();
               int ran3 = rannpc.nextInt(3);
               String[] npc = { "지우", "이슬이", "웅이" };
               String result3 = npc[ran3];
               System.out.println("길을 가다 "+result3 + "를 만났습니다.");
               System.out.println();
               System.out.println("[1]대화한다 [2]무시한다");
               System.out.print("입력>> ");
               Scanner sc3 = new Scanner(System.in);
               int num3 = sc3.nextInt();
               if (num3 == 1) {
                  switch (result3) {
                  case "지우":
                     Poc_image asdfe56 = new Poc_image();
                     asdfe56.jiwo();
                     System.out.print(result3 + "를 만났습니다.");
                     System.out.println("지우 : 내 성을 맞춰줘...");
                     System.out.println("[1]김해 김씨 [2]전주 이씨 [3]청주 한씨 [4]강릉 최씨 [5]알게 뭐야 비켜");
                     Scanner sc31 = new Scanner(System.in);
                     int num31 = sc31.nextInt();
                     if (num31 == 1) {
                        System.out.println("지우 : 아냐ㅜㅜ");
                        System.out.println("경험치 10을 잃었습니다.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else if (num31 == 2) {
                        System.out.println("지우 : 아니야ㅜㅜ");
                        System.out.println("경험치 10을 잃었습니다.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else if (num31 == 3) {
                        System.out.println("지우 : 쓰윗해...///");
                        System.out.println("경험치 10을 얻었습니다.");
                        EXP = EXP + 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else if (num31 == 4) {
                        System.out.println("지우 : 놉;ㅅ;");
                        System.out.println("경험치 10을 잃었습니다.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else if (num31 == 5) {
                        System.out.println("지우 : 땡");
                        System.out.println("경험치 10을 잃었습니다.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else {
                        System.out.println("잘못된 입력입니다.");
                     }
                     break;

                  case "이슬이":
                     Poc_image asdfe562 = new Poc_image();
                     asdfe562.eeseul();
                     System.out.println();
                     System.out.print("길을 가다 " + result3 + "를 만났습니다.");
                     System.out.println("이슬이 : 안뇽...내 성을 맞춰보겠어?");
                     System.out.println("[1]밀양 박씨 [2]경주 최씨 [3]해주 오씨 [4]고령 신씨 [5]알게뭐야 비켜");
                     System.out.print("입력>> ");
                     Scanner sc32 = new Scanner(System.in);
                     int num32 = sc32.nextInt();
                     if (num32 == 1) {
                        System.out.println("이슬이 : 아니야");
                        System.out.println("경험치 10을 잃었습니다.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else if (num32 == 2) {
                        System.out.println("이슬이 : 맞았어!");
                        System.out.println("경험치 20을 얻었습니다.");
                        EXP = EXP + 20;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else if (num32 == 3) {
                        System.out.println("이슬이 : 아냐");
                        System.out.println("경험치 10을 잃었습니다.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else if (num32 == 4) {
                        System.out.println("이슬이 : 틀렸어");
                        System.out.println("경험치 10을 잃었습니다.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else if (num32 == 5) {
                        System.out.println("이슬이 : ...");
                        System.out.println("경험치 10을 잃었습니다.");
                        EXP = EXP - 10;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else {
                        System.out.println("잘못된 입력입니다.");
                     }
                     break;

                  case "웅이":
                     Poc_image asdffgh = new Poc_image();
                     asdffgh.woong();
                     System.out.println();
                     System.out.print("길을 가다" + result3 + "를 만났습니다.");
                     System.out.println("웅이 : 내 성을 맞춰줘");
                     System.out.println("[1]연안 차씨 [2]창원 구씨 [3]장흥 임씨 [4]평강 채씨 [5]알게 뭐야 비켜");
                     System.out.print("입력>> ");
                     Scanner sc33 = new Scanner(System.in);
                     int num33 = sc33.nextInt();
                     if (num33 == 1) {
                        System.out.println("웅이 : ...");
                        System.out.println("경험치 1을 잃었습니다.");
                        EXP = EXP - 1;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else if (num33 == 2) {
                        System.out.println("웅이 : ...");
                        System.out.println("경험치 1을 잃었습니다.");
                        EXP = EXP - 1;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else if (num33 == 3) {
                        System.out.println("웅이 : ...");
                        System.out.println("경험치 1을 잃었습니다.");
                        EXP = EXP - 1;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else if (num33 == 4) {
                        System.out.println("웅이 : ...");
                        System.out.println("경험치 1을 잃었습니다.");
                        EXP = EXP - 1;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                     } else if (num33 == 5) {
                        System.out.println("웅이 : 웅..");
                        System.out.println("경험치 1을 잃었습니다.");
                        EXP = EXP - 1;
                        levelup();
                        System.out.println("LV. " + lv + " " + "| 현재 경험치 : " + EXP);
                        break;

                     } else if (num3 == 2) {
                        System.out.println("무시하고 진행합니다.");

                     } else {
                        System.out.println("잘못된 입력입니다.");

                     }
                  }
               }
            }
            // 라이벌 배틀 페이지
            else if (number == 3) {
               int hp10 = 100;
               Poc_image baram = new Poc_image();
               baram.baram();
               System.out.println("길에서 우연히 라이벌 바람이 만났다!!");
               System.out.println();
               System.out.println("[1]대결한다 [2]무시한다");
               System.out.print("입력>> ");
               Scanner sc44 = new Scanner(System.in);
               int num44 = sc44.nextInt();
               if (num44 == 1) {
                  Poc_image gas = new Poc_image();
                  gas.gas();
                  while (true) {
                     System.out.println();
                     System.out.println("1. " + monP.skill1 + " 2. " + monP.skill2 + " 3. " + monP.skill3);
                     System.out.print("입력>> ");
                     Scanner sc45 = new Scanner(System.in);
                     int num45 = sc45.nextInt();
                     if (num45 == 1) {
                        System.out.println(monP.skill1 + "!!");
                        System.out.println(monP.name + " 이(가) 또가스한테 20의 피해를 입혔습니다");
                        System.out.println("독가스!!");
                        System.out.println("또가스가 반격을 합니다. " + monP.name + " 이(가) 21의 피해를 받습니다");
                        hp -= 21;
                        hp10 -= 20;
                        if (hp10 <= 0) {
                           System.out.println("또가스의 hp : 0");
                           if (hp <= 0) {
                              System.out.println(monP.name + "의 hp : 0");
                              System.out.println("무승부다!");
                              System.out.println();
                              break;
                           } else if (hp10 < hp) {
                              System.out.println(monP.name + "의 hp : " + hp);
                              System.out.println("쉽네~");
                              System.out.println();
                              break;
                           }
                        } else {
                           System.out.println("또가스의 hp : " + hp10);
                        }
                        if (hp <= 0) {
                           System.out.println(monP.name + "의 hp : 0");
                           if (hp10 > hp) {
                              System.out.println("방심했어! 다음에 다시 붙어");
                              System.out.println();
                              break;
                           }
                        } else {
                           System.out.println(monP.name + "의 hp : " + hp);
                        }

                     } else if (num45 == 2) {
                        System.out.println(monP.skill2 + "!!");
                        System.out.println(monP.name + " 이(가) 또가스한테 30의 피해를 입혔습니다");
                        System.out.println("독가스!!");
                        System.out.println("또가스가 반격을 합니다. " + monP.name + " 이(가) 21의 피해를 받습니다");
                        hp -= 21;
                        hp10 -= 30;
                        if (hp10 <= 0) {
                           System.out.println("또가스의 hp : 0");
                           if (hp <= 0) {
                              System.out.println(monP.name + "의 hp : 0");
                              System.out.println("무승부다!");
                              System.out.println();
                              break;
                           } else if (hp10 < hp) {
                              System.out.println(monP.name + "의 hp : " + hp);
                              System.out.println("쉽네~");
                              System.out.println();
                              break;
                           }
                        } else {
                           System.out.println("또가스의 hp : " + hp10);
                        }
                        if (hp <= 0) {
                           System.out.println(monP.name + "의 hp : 0");
                           if (hp10 > hp) {
                              System.out.println("방심했어! 다음에 다시 붙어");
                              System.out.println();
                              break;
                           }
                        } else {
                           System.out.println(monP.name + "의 hp : " + hp);
                        }

                     } else if (num45 == 3) {
                        System.out.println(monP.skill3 + "!!");
                        System.out.println(monP.name + " 이(가) 또가스한테 40의 피해를 입혔습니다");
                        System.out.println("독가스!!");
                        System.out.println("또가스가 반격을 합니다. " + monP.name + " 이(가) 21의 피해를 받습니다");
                        hp -= 21;
                        hp10 -= 40;
                        if (hp10 <= 0) {
                           System.out.println("또가스의 hp : 0");
                           if (hp <= 0) {
                              System.out.println(monP.name + "의 hp : 0");
                              System.out.println("무승부다!");
                              System.out.println();
                              break;
                           } else if (hp10 < hp) {
                              System.out.println(monP.name + "의 hp : " + hp);
                              System.out.println("바람이와의 포켓몬 대결에서 승리했다!!");
                              System.out.println("쉽네~");
                              EXP = EXP+25;
                              System.out.println();
                              break;
                           }
                        } else {
                           System.out.println("또가스의 hp : " + hp10);
                        }
                        if (hp <= 0) {
                           System.out.println(monP.name + "의 hp : 0");
                           if (hp10 > hp) {
                              System.out.println("방심했어! 다음에 다시 붙어");
                              System.out.println();
                              break;
                           }
                        } else {
                           System.out.println(monP.name + "의 hp : " + hp);
                        }
                        //////////////
                     }
                  }
               } else if (num44 == 2) {
                  System.out.println("너랑 싸우고 있을 시간 없어! 비켜");
                  System.out.println("바람 : 겁쟁이 녀석 또 도망가는거냐?");
                  System.out.println("바람이를 무시하고 지나갑니다.");

               }

            }

         }
         // 휴식 페이지
         if (choice == 2) {
            System.out.println("1.[포켓몬 센터 가기] 2.[포켓몬과 밥 먹기] 3.[내 포켓몬 상태확인]");
            System.out.print("입력 >> ");
            int select2 = sc.nextInt();
            if (select2 == 1) {
               Poc_image lucky = new Poc_image();
                lucky.lucky();
               System.out.println("포켓몬 센터로 가기~~");
               hp=monP.getMaxHP();
//               hp = (monP.getHP()-hp)+hp;

            	   
               
               System.out.println("체력이 모두 회복되었다!");
            } else if (select2 == 2) {
               Poc_image eat = new Poc_image();
                eat.eat();
               System.out.println("포켓몬과 밥 먹기~");
               hp = hp + 10;
               EXP = EXP + 10;
               levelup();
               System.out.println("포켓몬의 체력과 경험치가 조금 올랐다!");
            } else if (select2 == 3) {
               System.out.println(monP.name + "의 상태");
               levelup();
               System.out.println("Level : " + lv);
               System.out.println("HP : " + hp);
               System.out.println("MaxHP : "+monP.getMaxHP());
               System.out.println("EXP : " + EXP);
               System.out.println("보유 스킬1 : " + monP.skill1);
               System.out.println("보유 스킬2 : " + monP.skill2);
               System.out.println("보유 스킬3 : " + monP.skill3);

            }

         }
         // 관장에게 도전 페이지
         else if (choice == 3) {
            int boss = 300;
            if (lv < 3) {
               Poc_image boss1 = new Poc_image();
                boss1.boss();
               System.out.println("나에게 도전하기에는 너무 이른거 같군..");
               System.out.println("더 수련을 하고 오거라!");
            } else if (lv == 3) {
               Poc_image dos = new Poc_image();
                dos.dos();
               System.out.println("뱃지를 얻고싶다고?");
               System.out.println("나를 뛰어넘어봐라!");
               while (hp > 0 && boss > 0) {
                  Random skillran = new Random();
                  int ran4 = skillran.nextInt(4);
                  String[] skill4 = { "얼음엄니", "얼음엄니", "바다회오리", "하이드로펌프" };
                  String result4 = skill4[ran4];

                  System.out.println();
                  System.out.println("[1]" + monP.skill1 + " [2]" + monP.skill2 + " [3]" + monP.skill3);
                  System.out.print("입력>> ");
                  Scanner sc4 = new Scanner(System.in);
                  int num4 = sc4.nextInt();
                  if (num4 == 1) {
                     Random randam = new Random();
                     int ran5 = randam.nextInt(2);
                     int[] dam = { 10, 20 };
                     int result5 = dam[ran5];

                     System.out.print("갸라도스 " + result4 + "에 ");
                     System.out.println(monP.skill1 + "로 맞섰습니다.");
                     hp -= (ran4 * 10);
                     boss -= result5;
                     System.out.println("데미지 " + result5 + "를 입혔습니다.");
                     System.out.println("데미지 " + (ran4 * 10) + "을 입었습니다.");
                     System.out.println();

                     if (boss <= 0) {
                        System.out.println("갸라도스의 hp : 0");
                     } else {
                        System.out.println("갸라도스의 hp : " + boss);
                     }
                     if (hp <= 0) {
                        System.out.println(monP.name + "의 hp : 0");
                     } else {
                        System.out.println(monP.name + "의 hp : " + hp);
                     }

                  } else if (num4 == 2) {
                     Random randam = new Random();
                     int ran5 = randam.nextInt(4);
                     int[] dam = { 0, 20, 20, 40 };
                     int result5 = dam[ran5];

                     System.out.print("갸라도스의 " + result4 + "에 ");
                     System.out.println(monP.skill2 + "로 맞섰습니다.");
                     hp -= (ran4 * 10);
                     boss -= result5;
                     System.out.println("데미지 " + result5 + "를 입혔습니다.");
                     System.out.println("데미지 " + (ran4 * 10) + "을 입었습니다.");
                     System.out.println();

                     if (boss <= 0) {
                        System.out.println("갸라도스의 hp : 0");
                     } else {
                        System.out.println("갸라도스의 hp : " + boss);
                     }
                     if (hp <= 0) {
                        System.out.println(monP.name + "의 hp : 0");
                     } else {
                        System.out.println(monP.name + "의 hp : " + hp);
                     }
                  } else if (num4 == 3) {
                     Random randam = new Random();
                     int ran5 = randam.nextInt(3);
                     int[] dam = { 0, 10, 50 };
                     int result5 = dam[ran5];

                     System.out.print("상대의 " + result4 + "에 ");
                     System.out.println(monP.skill3 + "로 맞섰습니다.");
                     hp -= ((ran4 * 10) + 10);
                     boss -= result5;
                     System.out.println("데미지" + result5 + "를 입혔습니다.");
                     System.out.println("데미지" + ((ran4 * 10) + 10) + "을 입었습니다.");
                     System.out.println();

                     if (boss <= 0) {
                        System.out.println("갸라도스의 hp : 0");
                     } else {
                        System.out.println("갸라도스의 hp : " + boss);
                     }
                     if (hp <= 0) {
                        System.out.println(monP.name + "의 hp : 0");
                     } else {
                        System.out.println(monP.name + "의 hp : " + hp);
                     }

                  } else {
                     System.out.println("잘못된 입력입니다.");
                  }
               }
            }
            if (boss <= 0) {
               if (boss < hp) {
            	  Poc_image asdlkl = new Poc_image();
                  asdlkl.badge();
                  System.out.println("★" + monP.name + "의 승리★");
                  System.out.println("좋은 승부였다. 자 여기");
                  System.out.println("★★★★오렌지시티 뱃지를 획득했다★★★★");
                  
               } else if (boss == hp) {
                  System.out.println("무승부");
                  System.out.println("다시 도전 하자!");
               }
            } else if (hp <= 0) {
               if (boss > hp) {
                  System.out.println("===" + monP.name + "의 패배===");
                  System.out.println("아직 부족하구나, 강해져서 돌아와라");
               } else if (boss == hp) {
                  System.out.println("무승부");
                  System.out.println("다시 도전 하자!");
               }
            }
         }
         //저장하기
         else if (choice == 4) {
            SaveLoad sv = new SaveLoad();
            sv.Save(hp, monP.name, EXP, lv, monP.skill1, monP.skill2, monP.skill3, id, MaxHP);
            System.out.println("저장이 완료되었습니다.");
         }
         // 종료하기
         else if (choice == 5) {
            System.out.println("로그아웃 하시겠습니까? [1]네 [2]아니요");
            Scanner sc66 = new Scanner(System.in);

            int restart = sc66.nextInt();

            if (restart == 1) {
               // 게임 종료
               System.out.println("로그인 화면으로 돌아갑니다..");
               break;
            } // 재시작
            else if (restart == 2) {
               System.out.println("\n==이전 화면으로 돌아갑니다==\n");
            }
         }
      }
   }

   void levelup() {
         
        if (EXP >= 30) {
           lv++;
           EXP = EXP - 30;
           System.out.println("앗 포켓몬의 상태가?!!!");
           
           if (lv == 2 && mon1.name.equals(monP.getName())) {
                monP = mon2;
                System.out.println("★"+monP.name+"으로 진화하였다!"+"★");
             }
           if(lv == 2 &&mon4.name.equals(monP.getName())) {
                monP = mon5;
                System.out.println("★"+monP.name+"으로 진화하였다!"+"★");
             }
           if(lv == 2 &&mon7.name.equals(monP.getName())) {
                monP = mon8;
                System.out.println("★"+monP.name+"으로 진화하였다!"+"★");
             }
        
        } if (lv == 3) {
           EXP = 0;
            System.out.println("포켓몬이 최대 레벨이 되었다!!");
           if(lv == 3&&mon2.name.equals(monP.getName())) {
              monP = mon3;
              System.out.println("★"+monP.name+"으로 진화하였다!"+"★");
           }
           if(lv == 3&&mon5.name.equals(monP.getName())) {
              monP = mon6;
              System.out.println("★"+monP.name+"으로 진화하였다!"+"★");
           }
           if(lv == 3&&mon8.name.equals(monP.getName())) {
              monP = mon9;
              System.out.println("★"+monP.name+"으로 진화하였다!"+"★");
           }
        }
        }

   }