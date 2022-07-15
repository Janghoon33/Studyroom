package 캐스팅;

public class DollMain {

	public static void main(String[] args) {
		
		// 실질적으로 인형을 뽑을 클래스
		Pika pika = new Pika();
		getDoll(pika);
		
		//파이리 인형
		Piri piri = new Piri();
		getDoll(piri);
		
		//꼬북이 인형
		Kkobuck kko = new Kkobuck();
		getDoll(kko);
		
		//메타몽,이브이,치코리타 인형
		Metamong meta = new Metamong();
		getDoll(meta);
		
		Evee eve = new Evee();
		getDoll(eve);
		
		chico ch = new chico();
		getDoll(ch);
		
	}
	//인형뽑기
	public static void getDoll(Doll doll) {
		//업캐스팅 : 상위클래스 타입으로 형변환하는것
		//1. 상위 클래스에 있는 필드와 메소드만 사용가능
		//2. 오버라이딩된 메소드는 자식에서 재정의한 메소드를 실행 시킨다
		//--> 상위 클래스가 하위 클래스를 한번에 컨트롤 가능
		
		//피카츄 인형을 뽑았을때 백만볼트와 전광석화를 사용하고 싶다
		//업캐스팅된 객체 instanceof 하위 클래스명
		//업캐스팅된 객체가 어느 하위클래스로부터 업캐스팅되었는지 판별해줌
		if(doll instanceof Pika) {
			//다운캐스팅 해서 run사용
			//doll 객체를 다운캐스팅해주세요
			//하위클래스명 객체명 = (하위클래스타입)업캐스팅된 객체명;
			Pika pi = (Pika)doll;
			pi.run();
		}
		
		doll.get();
		//같은 객체 이름으로 여러가지 기능을 수행 시키고 있다 -> 다형성
	}
	
	
//	public static void getDoll(Pika pika) {
//		pika.get();
//	}
//	public static void getDoll(Piri piri) {
//		piri.get();
//	}
//	public static void getDoll(Kkobuck kko) {
//		kko.get();
//	}
//	public static void getDoll(Metamong meta) {
//		meta.get();
//	}
//	public static void getDoll(Evee eve) {
//		eve.get();
//	}
//	public static void getDoll(chico ch) {
//		ch.get();
//	}
	
	
	
}
