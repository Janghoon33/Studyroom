package 추상클래스;

public class PartTimeEmployee extends Employee{
	
	int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		this.empno=empno;
		this.name=name;
		this.pay=pay;
		this.workDay=workDay;
	}
	
	public int getMoneyPay() {
		return pay*workDay;
	}
}
	
