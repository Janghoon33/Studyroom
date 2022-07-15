
public class Ex06_메소드오버로딩1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		System.out.println("결과1 : "+add(num1,num2));
		
		double num3 = 10.5;
		double num4 = 21.7;
		System.out.println("결과2 : "+add(num3,num4));

		float num5 = 3.14f;
		float num6 = 5.89f;
		System.out.println("결과3 : "+add(num5,num6));
	}
	//메소드 오버로딩 : 같은 메소드 이름으로 매개변수를 다르게해서 다른기능을 수행 시키는것
    public static int add(int num1, int num2) {
//    	int result = num1 + num2;
//    	return result;
    	return num1+num2;
    }
    public static double add(double num3, double num4) {
    	return num3+num4;
    }
    public static float add(float num5, float num6) {
    	return num5+num6;
    }
}
