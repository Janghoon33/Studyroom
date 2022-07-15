package 추상클래스;

public class RegularEmployee extends Employee{
	
	
	int bonus;
	
	//생성자 메소드
	public RegularEmployee (String empno, String name, int pay, int bonus) {
		this.empno=empno;
		this.name=name;
		this.pay=pay;
		this.bonus=bonus;
	}
	
	public int getMoneyPay() {
		return (pay+bonus)/12;
	}
	
	
}
