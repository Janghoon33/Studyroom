
public class Ex06_for문예제5 {

	public static void main(String[] args) {
        //for문
		int sum = 0;
//		for(int i = 1; i<101; i++) {
//			if(i%3==0) {
//				sum += i;  
//			}
//			
//		}
//		System.out.print("3의 배수의 합은 " + sum);
		//while문 활용
		int i=1;
		while (i<=100) {
			if(i%3==0) {
				sum += i;
			}
			i++;
		}
		System.out.print("3의 배수의 합은 " + sum);
		
		
		
	}

}
