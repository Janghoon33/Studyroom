package 추상클래스;

public class Porche extends Car{
	
	String color = "파란색";
	
	//부모로부터 물려받은 추상 메소드를 자식의 구체적인 메소드로 오버라이딩
	public void runner() {
		System.out.println("아주 빠른 속도로 쌩쌩~~");
	}
}
