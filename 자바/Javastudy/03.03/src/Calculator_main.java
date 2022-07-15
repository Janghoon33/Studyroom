
public class Calculator_main {

	public static void main(String[] args) {
		// 2개의 매개변수를 넘겨받는 생성자를 이용해서 cal 객체를 만드세요
		Calculator cal = new Calculator(10,20);
		// cal 객체의 num1과 num2를 더한값을 출력해주세요
		System.out.println("더하기 : "+cal.sum());
		// cal 객체의 num1과 num2를 각각 75, 5로 수정해주세요
		cal.setNum1(75);
		cal.setNum2(5);
		// 뺀 값,나눈값,곱한값 출력
		System.out.println("수정후 더하기 : "+cal.sum());
		System.out.println("빼기 : "+cal.sub());
		System.out.println("곱하기 : "+cal.mul());
		System.out.println("나누기 : "+cal.div());
		
		
		
	}

	
}
