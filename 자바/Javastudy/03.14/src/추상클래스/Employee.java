package 추상클래스;

public abstract class Employee {
	// 모든 직급에 대하여 부모가 될수 있는 상위 클래스
	// -> 직급에 대하여 연봉을 계산할수 있는 필드 및 메소드가 존재해야한다
	
	
	
	// 공통되는 필드 선언
	// 접근지정자 -> public(내부/외부 모두 허용), private(내부에서만 허용),
	//            protected(같은 패키지, 상속의 관계에서만 허용), default
	protected String empno;
	protected String name;
	protected int pay;
	
	public abstract int getMoneyPay();
	
	public String print() {
		return empno + " : " + name + " : " + pay;
	}
	
	
}
