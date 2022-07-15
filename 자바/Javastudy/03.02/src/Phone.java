
public class Phone { 
	// 클래스란 사용자 임의의 자료형이다
	// 현실에 있는 물체를 표현할 수 있는 사용자 임의의 자료형(type)이다
	// 클래스를 만들기 위해서는 추상화,캡슐화 라는 작업을 통해 만들어진다
	
	
	String brand;
	//(private)접근제한자 --> 해당 클래스 내에서만 접근이 가능하게끔 접근을 허용하는 기능
	String number;
	//굳이 값을 정의안해도됨 어차피 객체에 맞게 새로운 값을 그때그때 넣기 때문에 공간만 만들기 
	
	// 메인 클래스외에 다른 클래스에서는 메소드를 만들때 static을 안붙여도 된다
	public void Call() {
		System.out.println("전화를 걸다");
	}
    public void Send() {
    	System.out.println("전화를 받다");
    }
    public void Game() {
    	System.out.println("모바일 배그를 하다");
    }
}


