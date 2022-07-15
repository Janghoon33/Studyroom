package Question6;

import java.util.ArrayList;
import java.util.Scanner;



public class MusicController {
	
	public void MusicPlay() {
		ArrayList<MusicVO> musicList=new ArrayList<>();
		MusicVO music1 = new MusicVO("","",123);
		MusicVO music2 = new MusicVO("","",123);
		MusicVO music3 = new MusicVO("","",123);
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int i = 0;
		System.out.println("====뮤직플레이어====");
		System.out.print("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >> ");
		int a =sc.nextInt();
		
		if(a==6) {
			break;
		}
		else if(a==1) {
			i++;
			System.out.println("====등록====");
			System.out.print("제목 : ");
			String j = sc.next();
			System.out.print("가수 : ");
			String g = sc.next();
			System.out.print("시간 : ");
			int t = sc.nextInt();

			
			musicList.add(i, music1);
			
		}
		
		else if(a==2) {
			System.out.println("====노래목록====");
			musicList.toString();
			
		}
		else if(a==3) {
			System.out.println("====실행====");
			System.out.print("제목 : "+musicList.get(i).getTitle());
			System.out.print(", 가수 : "+musicList.get(i).getSinger());
			System.out.println(", 시간 : "+musicList.get(i).getPlayTime());
		}
		else if(a==4) {
			System.out.println("====다음곡====");
			i--;
			System.out.print("제목 : "+musicList.get(i).getTitle());
			System.out.print(", 가수 : "+musicList.get(i).getSinger());
			System.out.println(", 시간 : "+musicList.get(i).getPlayTime());
		}
		else if(a==5) {
			System.out.println("====이전곡====");
			i++;
			System.out.print("제목 : "+musicList.get(i).getTitle());
			System.out.print(", 가수 : "+musicList.get(i).getSinger());
			System.out.println(", 시간 : "+musicList.get(i).getPlayTime());
		}
		}
		
		
	}
}
