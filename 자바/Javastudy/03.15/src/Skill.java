
public interface Skill {
	
	// 클래스 : 일반적인 설계도
	// 추상 클래스 : 미완성의 설계도
	// 인터페이스 : 기본(틀) 설계도
	
	// 공통적으로 부여될 필드 선언
	// 상수의 값으로 필드 선언!-> final
	
	final int attack = 100;
	int defence = 80;
	
	// 일반 메소드를 인터페이스 안에서 생성시 default 키워드 부여하기
	public default void move() {
		System.out.println("앞으로 전진하기!");
	}
	
	// 캐릭터라면 필수적으로 필요하며
	// 각 캐릭터 특성대로 기능을 부여 할 수 있는 추상 메소드 생성
	public abstract void charAttack();
	
	
}
