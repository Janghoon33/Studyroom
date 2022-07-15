package Controller;

import java.util.ArrayList;

import Model.MusicVO;
import javazoom.jl.player.MP3Player;

public class MP3Controller {
	
	// Controller : 모델과 뷰를 연결해주는 역할
	// - 모델이나 뷰에 대한 정보를 알아야한다
	// - 모델 또는 뷰의 변경을 인지하여 대체해야 한다
	
	// 모든 노래를 관리하기 위한 가변 리스트 생성
	ArrayList<MusicVO> musicList = new ArrayList<>();
	
	int index = 0; // 이전곡, 다음곡 전환을 위한 변수
	
	// 실질적인 MP3플레이 기능
	MP3Player mp3 = new MP3Player();
	
	// 1. 모든 노래 정보를 담을 수 있는 생성자 메소드 생성
	public MP3Controller() {
		MusicVO music1 = new MusicVO("깡","Rain",100,"C://music/Rain - 깡.mp3");
		MusicVO music2 = new MusicVO("Dalla Dalla","Itzy",120,"C://music/Itzy - Dalla Dalla.mp3");
		MusicVO music3 = new MusicVO("SOLO","JENNIE",200,"C://music/JENNIE - SOLO.mp3");
		
		musicList.add(music1);
		musicList.add(music2);
		musicList.add(music3);
	}
	// 2. 재생을 위한 일반 메소드 생성
	public void playing() {
		show(musicList, index);
		mp3.play(musicList.get(index).getPath());
	}
	
	// 3. 곡 출력을 위한 메소드
	public void show(ArrayList<MusicVO> musicList, int index) {
		System.out.print("제목 : "+musicList.get(index).getMusicName());
		System.out.print(", 가수 : "+musicList.get(index).getSinger());
		int minit = musicList.get(index).getPlayTime()/60;
		int secon = musicList.get(index).getPlayTime()%60;
		System.out.println(", 시간 : "+minit+"분"+secon+"초");
	}
	
	// 4. 노래 정지를 위한 메소드 생성
	public void stoping() {
		mp3.stop();
	}
	
	// 5. 다음곡 재생 -> nextPlay()
	public void nextPlay() {
		if(index>=musicList.size()-1) {
			System.out.println("다음곡이 없습니다.");
		}
		else {
			if(mp3.isPlaying()) {
				mp3.stop();
			}
			index++;
			show(musicList, index);
			mp3.play(musicList.get(index).getPath());
	}
	}
	// 6. 이전곡 재생 -> prePlay()
	public void prePlay() {
		if(index>0) {
			if(mp3.isPlaying()) {
				mp3.stop();
				index--;
				show(musicList, index);
				mp3.play(musicList.get(index).getPath());
			}else {
				System.out.println("이전곡이 없습니다");}
			
			
		}
		}
	}
	
	
	
	
	


