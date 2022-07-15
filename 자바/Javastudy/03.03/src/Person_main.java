import java.util.ArrayList;

public class Person_main {

	public static void main(String[] args) {
		
		//Person() : 생성자
		//클래스만큼의 공간을 객체(예시에서는 p1)에 할당해준다!!
		Person p1 = new Person("승환",20,173,70);
		//p1에 대한 승환을 '임짜장'으로 개명하고 싶을때
		p1.setName("승환쌤");
//		p1.name="승환";
//		p1.age=20;
//		p1.tall=173;
//		p1.weight=70;
		//어차피 각각의 공간에 데이터를 넣어줄꺼면 공간이 만들어지면서 데이터도 같이 가지고 가면 좋겠다
		
		//형쌤 객체
		Person p2 = new Person();		
		p2.setName("형쌤");
		System.out.println("이름2 : "+ p2.getName());
		p2.setAge(21);
	    System.out.println("나이2 : "+p2.getAge());
	    p2.setTall(180);
	    System.out.println("키2 : "+p2.getTall());
	    p2.setWeight(70);
	    System.out.println("몸무게2 : "+p2.getWeight());
		
		p2.getData();

	Person p3 = new Person("동원쌤",30,175,60);
	
	Person p4 = new Person("수민쌤",21,160,40);
	
	// 데이터를 한번에 다룰수 있는 방법 -> 배열
	// 객체 배열 선언
	// 데이터타입[] 배열명 = new 데이터타입[3];
	Person[] pArray = new Person[4];
	pArray[0] = p1;
	pArray[1] = p2;
	pArray[2] = p3;
	pArray[3] = p4;
	// pArray를 사용해서 승환쌤의 키 출력
	// pArray[0] -> p1
	p1.getTall();
	pArray[0].getTall();
	System.out.println("승환쌤 키 : "+pArray[0].getTall());
	// pArray를 사용해서 형쌤의 나이를 출력
	p2.getAge();
	pArray[1].getAge();
	System.out.println("형쌤 나이 : "+pArray[1].getAge());
	
	// pArray를 사용해서 선생님들 평균 나이 출력
	pArray[0].getAge(); //20
	pArray[1].getAge(); //21
	pArray[2].getAge(); //30
	pArray[3].getAge(); //21
	
	// System.out.println("선생님들 평균 나이 : "+(pArray[0].getAge()+pArray[1].getAge()+pArray[2].getAge()+pArray[3].getAge())/4);
	
	int sum = 0;
	for(int i=0; i<pArray.length;i++) {
		sum += pArray[i].getAge();
	}
	System.out.println("나이 평균 : "+ sum/pArray.length);
	
	for(int i = 0; i<pArray.length;i++) {
		System.out.println(pArray[i].getName());
	}
	//자연쌤 -> pArray에 추가하고 싶다?
	//->불가능
	
//	int[] nArray = {10,20,30};
//	nArray[3]=40;
	//↑ 배열의 한계 : 이미 크기가 정해져서 데이터를 추가하거나 배열의 크기를 바꿀수 없음
	// 배열의 한계를 뛰어 넘는 배열 : ArrayList
	
	//선생님들의 객체를 담을 수 있는 ArrayList
	ArrayList<Person> pArrayList = new ArrayList<Person>();
	pArrayList.add(p1);
	pArrayList.add(p2);
	pArrayList.add(p3);
	pArrayList.add(p4);
	
	//pArrayList를 사용해서 승환쌤의 정보를 출력
	//이름 : 승환
	//나이 : 20
	//키 : 173
	//몸무게 : 70
	//객체 어레이리스트
	for(int i = 0; i<pArrayList.size();i++) {
	System.out.println("이름 : "+ pArrayList.get(i).getName());
	System.out.println("나이 : "+ pArrayList.get(i).getAge());
	System.out.println("키 : "+ pArrayList.get(i).getTall());
	System.out.println("몸무게 : "+ pArrayList.get(i).getWeight());
	}
	
	
	
	}
}

