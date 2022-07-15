
public class Student {
	
	String name;
	
	String number;
	
	int age;
	
	int scoreJava;
	
	int scoreWeb;
	
	int scoreAndroid;
	

	//평균 구하는 기능 + 출력까지 같이
	//다른 클래스에서 메소드를 만들때 굳이 static을 적어주지 않아도 된다
	public void studentAvg() {
		int result = (scoreJava+scoreWeb+scoreAndroid)/3;
		System.out.println("평균 : "+result);
	}
	
}
