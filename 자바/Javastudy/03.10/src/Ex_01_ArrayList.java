import java.util.ArrayList;

public class Ex_01_ArrayList {

	public static void main(String[] args) {
		// 배열의 한계 : 이미 크기가 정해져서 데이터를 추가하거나 배열의 크기를 바꿀수 없음
		// 배열의 한계를 뛰어 넘는 배열 : ArrayList
		
		
		//↓내가 사용하고자 하는 데이터의 갯수를 정확히 모를때 문제!
		int[]array = new int[1000];
		array[578] = 598;
		
		//ArrayList 선언 방식
		//ArrayList<배열에 들어갈 데이터 타입> 어레이 리스트명 = new ArrayList<String>();
		//ArrayList에 들어가는 타입은 레퍼런스 타입만 가능하다(기본자료형 타입은 쓸 수 없음)
		//기본 데이터 타입으로 ArrayList를 만들어주기 위해서는
		//기본 데이터 타입을 표현할수 있는 클래스를 활용해주면됨
		ArrayList<String> nameArray = new ArrayList<String>();
		//-> ArrayList<Integer> int타입은 Integer 
		//-> ArrayList<Float>
		
		//데이터 추가 .add("넣고싶은 데이터) -> 데이터를 입력한 순서대로 배열에 들어간다
		//즉 맨뒤로 차곡차곡 쌓인다
		nameArray.add("승환쌤");
		nameArray.add("형쌤");
		nameArray.add("동원쌤");
		nameArray.add("수민쌤");
		nameArray.add("자연쌤");
		
		//데이터 출력
		//승환쌤 출력
		System.out.println(nameArray.get(0));
		System.out.println(nameArray.get(1));
		System.out.println(nameArray.get(2));
		System.out.println(nameArray.get(3));
		System.out.println(nameArray.get(4));
		
		//ArrayList 크기 -> .size() = 일반 배열의 .length와 같음
		for(int i=0; i<nameArray.size();i++) {
			System.out.println(nameArray.get(i));
		}
		
		//데이터 삭제 .remove(지우고 싶은 인덱스번호)
		//어떤 특정 조건에서 해당하는 데이터만 지우고 싶을때
		nameArray.remove(2);
		
		System.out.println(nameArray.size());
		// -> 4 (담는공간도 지워버림)
		
		//데이터 삽입 -> .add(데이터가 들어갈 인덱스 위치, "넣고싶은데이터")
		nameArray.add(1,"동명");
		nameArray.add(4,"주란");
		for(int i=0; i<nameArray.size();i++) {
			System.out.println(nameArray.get(i));
		}
		
		
		
	}

}
