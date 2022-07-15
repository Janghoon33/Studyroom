
public class Person {

	private String name;
	
	private int age;
	
	private int tall;
	
	private int weight;
	
	// 디폴트 생성자 존재! -> 눈에는 안보임
	
	// 생성자(특별한 메소드) -> 클래스 만큼의 공간을 할당한다
	// 1. 메소드 이름이 무조건 클래스 이름과 같아야한다(Person이라고 하는 메소드를 만듬)
	// 2. 반환 타입이 없음 존재 자체 x
	// public Person(){}  -> default 생성자!
    //                       클래스를 만들때 자동으로 만들어짐
    //                       새로운 생성자를 만들어 주는 순간 디폴트 생성자는 없어짐
	//                       새로운 생성자를 만든뒤에 사용하고 싶다면 사용자 임의로 만들어 줘야한다
	
	// 데이터를 받는 새로운 생성자 선언!
	// 생성자는 특이한 메소드다(리턴자체가 없음)
	// 생성자 오버로딩!!
	
	
	public Person() {
		
	}
	
	public Person(String name, int age, int tall, int weight) {
		this.name = name;
		this.age = age;
		this.tall = tall;
		this.weight = weight;
	}
	// 데이터를 받아서 name이라는 필드값에 저장시키는 기능을 함
	
	
	public void getData() {
		System.out.println(name+","+age+","+tall+","+weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTall() {
		return tall;
	}

	public void setTall(int tall) {
		this.tall = tall;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
