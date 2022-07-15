
public class Calculator {
	
	private int num1;
	
	private int num2;
    // ↓ 생성자 오버로딩
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	// 더한값 반환
	public int sum() {
		return num1+num2;
	}
	// 뺀값 반환
	public int sub() {
		return num1-num2;
	}
	// 곱한값 반환
	public int mul() {
		return num1*num2;
	}
	// 나눈값 반환
	public double div() {
		return num1/num2;
	}
	
	
}
