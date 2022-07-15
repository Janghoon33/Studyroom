package 추상클래스;

public abstract class Car {
	
	// 추상 클래스 : 미완성의 설계도 -> 구체적이지 않은 설계도
	// 추상 클래스의 키워드 : abstract
	// 추상 메소드는 꼭 추상 클래스에 생성되어야한다
	// 설계도 -> 필드 + 메소드
	
	// 자동차 -> 포르쉐, 볼보, BMW 
	
	int tire = 4;
	String color = "흰색";
	
	
	//몸체{} 가 구현되어 있지 않는 추상 메소드
	public abstract void runner();
		
	public void runner2() {
		System.out.println("시소 50으로 달리기");
	}
	
	
	
	
}

