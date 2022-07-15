
public class Ex10_이차원배열1 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		//arr라는 배열을 1~25까지의 숫자로 초기화시킬꺼에요!
		int num=1;
//		for(int i=0; i<arr[0].length;i++) {
//			arr[0][i]=num;
//			num++;
//		}
//		
//		for(int i=0; i<arr[1].length;i++) {
//			arr[1][i]=num;
//			num++;
//		}
//		
//		for(int i=0; i<arr[2].length;i++) {
//			arr[2][i]=num;
//			num++;
//		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=num;
				num++;
			}
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println(arr[i][j]);
			}
			
		
		}
		
		

	}

}
