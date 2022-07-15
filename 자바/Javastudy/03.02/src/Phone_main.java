
public class Phone_main {

	public static void main(String[] args) {
		
		int num = 5;
		// 클래스 : 자료 + 기능 사용자 임의의 자료형
		Phone lollipop = new Phone(); // 객체 생성 -> 클래스에 있는 데이터와 기능을 사용할 수 있다
		
		System.out.println("브랜드 : "+lollipop.brand);
		lollipop.Call();
		
		//롤리팝으로 전화받기
		lollipop.Send();
		
		System.out.println("전화 번호1 : "+ lollipop.number);
		
		//번호, 브랜드를 바꿈
		Phone magic = new Phone();
		magic.brand = "애니콜";
		magic.number = "01056751254";
		System.out.println("브랜드2 : "+magic.brand);
		System.out.println("전화 번호2 : " + magic.number);
		
		Phone apple = new Phone();
		apple.brand = "아이폰";
		apple.number = "01036545471";
		System.out.println("브랜드3 : "+apple.brand);
		System.out.println("전화 번호3 : "+apple.number);
		
		
		
		
	}

}
