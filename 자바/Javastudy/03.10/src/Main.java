import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//설계도를 만들때에는 구체적인 실행이 불가능하므로 main메소드는 만들지 않는다
		
		//객체 : 설계도를 통해서 실제로 만들어지는것
		//설계도 -> 객체화  (인스턴스 화)
		
		//객체를 생성하는 키워드 ? new
		
		Pocketmon mon1 = new Pocketmon("꼬부기", "물",70,40,100);
		
//		mon1.name = "꼬부기";
//		mon1.type = "물";
//		mon1.attack = 70;
//		mon1.defence = 40;
//		mon1.hp = 100;
		
		//객체를 생성함과 동시에 원하는 속성값 지정하기 -> 생성자 메소드 사용
		Pocketmon mon2 = new Pocketmon("파이리","불",30,55,60);
		
		System.out.println("mon1의 이름 : "+ mon1.getName());
		System.out.println("mon1의 타입 : "+ mon1.getType());
		System.out.println();
		System.out.println("mon2의 이름 : "+mon2.getName());
		System.out.println("mon2의 타입 : "+mon2.getType());
		System.out.println();
//		mon1.type = "전기";
		
		mon1.setAttack(60);
		
		
		// 객체 배열(주소) 생성
		Pocketmon[] ball = new Pocketmon[2];
		ball[0] = mon1;
		ball[1] = mon2;
		
		System.out.println(ball[0].getName());
		
		// 크기가 지정되지 않은 배열 -> 가변 리스트(= ArrayList)
		// <E> -> 제네릭
		ArrayList<Pocketmon> balls = new ArrayList<>();
		balls.add(mon1);
		balls.add(mon2); // 데이터 추가하기
		
		// 데이터 값 출력하기
		// mon1의 전체 데이터 출력하기
		
		Random rd = new Random();
		int num = rd.nextInt(balls.size()); // 0 혹은 1 생성
		
		
		//for(int i = num; i<balls.size();i++) {
			
		System.out.println(balls.get(num).getName());
		System.out.println(balls.get(num).getType());
		System.out.println(balls.get(num).getAttack());
		System.out.println(balls.get(num).getHp());
		System.out.println(balls.get(num).getDefence());
		System.out.println();
		
		
		
		
		
	}

}
