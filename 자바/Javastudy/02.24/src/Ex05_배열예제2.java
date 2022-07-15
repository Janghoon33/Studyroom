
public class Ex05_배열예제2 {

	public static void main(String[] args) {
		int[] arr = {43,15,5,20,13,35,31,17,47,8};
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			// ★ 내가 가졌던 기준점 max랑 arr안에 있는 숫자들을
			// 하나씩 꺼내보면서 비교를 max보다 큰값이 최대값 max 저장
			if(max < arr[i]) {
				max = arr[i];
			}
		}
			System.out.println(max);
				
			
			

	}

}
