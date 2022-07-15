package Method;

public class Ex01_메소드1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int result = add(num1,num2);
		System.out.println("결과 : " + result);
		// 메소드 이름으로 호출 : 메소드를 사용할꺼에요
		int result2 = minus(num1,num2); //변수 자체를 메소드로 넘겨주는게 아니라 변수 안에 있는 값만 넘겨준다
		System.out.println("결과 : " + result2);
		
		int result3 = mul(num1,num2);
		System.out.println("결과 : " + result3);
		
		int result4 = div(num1,num2);
		System.out.println("결과 : " + result4);
	}
	// 메소드 : 자주쓰는 기능을 따로 빼놓는것을 의미
	// 필요할때마다 불러와서 사용
    // public : 접근 제한자 -> 이 메소드를 어디까지 사용범위를 허용할것인가?
	// static : 공유하다
	// int : 리턴 타입(반환 타입)
	// add(int num1,int num2) : 메소드 이름 (필요재료){메소드 실행 로직}
    // return result; -> 데이터를 반환 (중요★★★★ 위에서 약속한 리턴 타입에 맞게 데이터를 반환해줘야한다)
	
	public static int add(int num1, int num2) {
	int result = num1+num2;
	return result;
}
	public static int minus(int data1, int data2) {
		int result = data1-data2;
		return result;
	}
	public static int mul(int data3, int data4) {
		int result = data3*data4;
		return result;
	}
	public static int div(int data5,int data6) {
		int result = data5/data6;
		return result;
	}
	

    
    
    
    
    
    
    
    
    
    
}  