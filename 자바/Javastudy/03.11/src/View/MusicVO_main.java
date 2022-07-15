package View;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.MP3Controller;
import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class MusicVO_main {

	public static void main(String[] args) {
		
		// View : 사용자가 사용하는 기능, 시각적으로 확인을 할 수 있는 용도로만 쓰인다
		// - Model이 가지고 있는 데이터를 저장하지 않는다
		// - 단순히 표시만 하는 기능을 갖는다
		
		
		
		Scanner sc = new Scanner(System.in);
		
		// Controller 객체 생성
		MP3Controller controller = new MP3Controller();
		
		int menu = 0;
		
		// 노래를 Main에 알려줄려면 -> MusicVO객체 생성
		
		
		//몇번째 노래인지 -> 인덱스로 판단
		
		//실질적인 MP3플레이 기능
		
		
		
		while(true) {
			System.out.print("1.재생 2.정지 3.다음곡 4.이전곡 5.종료 >> ");
			int num = sc.nextInt();
			
			if(num == 5) {
				break;
			}
			else if(num == 1) {
				controller.playing();
				
			}
			else if(num == 2) {
				//정지
				System.out.println("정지");
				controller.stoping();
			}
			else if(num == 3) {
				controller.nextPlay();
				}
				
				
			else if(num ==4) {
				controller.prePlay();
			}
				System.out.println("프로그램 종료");
			controller.stoping();
			
		}

	
	
	}
	
}

