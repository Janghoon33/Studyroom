
public class Ex04_메소드6 {

	public static void main(String[] args) {
		int base = 2;
	      int n = 3;
	      powerN(base,n);
	      
	      
	   }
	   //base의 n 제곱을 리턴!
	   //리턴을 시켜주지 않을때는 반환타입 위치에 void라는 키워드를 사용한다
	   public static void powerN(int base , int n) {
	      //누적 곱!!
	      int power = 1;
	      for(int i = 0; i < n; i++) {
	         power = power * base;
	      }
	      //for(int i = 1; i<=n;i++)도 가능
	      System.out.println("결과 확인 : " + power);
	      
	      
	   }

	

}
