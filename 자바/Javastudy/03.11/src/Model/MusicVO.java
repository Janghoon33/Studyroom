package Model;

public class MusicVO {
	// 노래라는 데이터를 표현 할 수 있는 클래스
	// 사용자가 임의로 만든 클래스 -> VO클래스(Value Object)
	// -> MVC패턴 중 Model에 해당하는 클래스
	// Model : 데이터를 관리하는곳
	// - 뷰나 컨트롤러에 대한 어떤 정보도 알수 없다
	// - 데이터 변경이 일어나면 처리할 수 있는 정보를 구현해야한다. -> getter/setter
	
	
	
	private String musicName;
	
	private String singer;
	
	private int playTime;
	
	private String path;
	
	
	public MusicVO (String musicName, String singer, int playTime, String path) {
		this.musicName=musicName;
		this.singer=singer;
		this.playTime=playTime;
		this.path=path;
	}
	
	public String getMusicName() {
		return musicName;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public int getPlayTime() {
		return playTime;
	}
	public String getPath() {
		return path;
	}
}
