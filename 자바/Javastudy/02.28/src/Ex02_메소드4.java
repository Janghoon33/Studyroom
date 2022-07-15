
public class Ex02_메소드4 {

	public static void main(String[] args) {
		int num1 = -5;
		int num2 = -1;
		int result = close10(num1,num2);
		System.out.println("10에 가까운 수 : " + result);

	}
	public static int close10(int num1, int num2) {
		int result = 0;
		if((num1-10)>(num2-10)) {
			result = num2;
		}else if((num1-10)<(num2-10)) {
			result = num1;
		}
		else {
			result = 0;
		}
		return result;
	}

}
