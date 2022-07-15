
public class Student_main {

	public static void main(String[] args) {
		
		//new --> 공간을 할당해줄거에요(만들어준다)
		//Student() --> 생성자
		Student jh = new Student();
		jh.name = "Janghoon";
		jh.number = "121523432";
		jh.age = 26;
		jh.scoreJava = 100;
		jh.scoreWeb = 99;
		jh.scoreAndroid = 98;
		System.out.println("이름 : "+jh.name);
		System.out.println("학번 : "+jh.number);
		System.out.println("나이 : "+jh.age);
		System.out.println("Java점수 : "+jh.scoreJava);
		System.out.println("Web점수 : "+jh.scoreWeb);
		System.out.println("Android점수 : "+jh.scoreAndroid);
		
		Student st2 = new Student();
		st2.name = "형쌤";
		st2.number = "20210337";
		st2.age = 21;
		st2.scoreJava = 99;
		st2.scoreWeb = 100;
		st2.scoreAndroid = 80;
		
		
		jh.studentAvg();
		st2.studentAvg();
		
		
		
		
//		System.out.println("장훈 평균 : "+jh.studentAvg());
//		System.out.println("형쌤 평균 : "+st2.studentAvg());
	}
//	public static int avg(int Java, int Web, int Android) {
//		int result = (Java+Web+Android)/3;
//		return result;
//	}

}
