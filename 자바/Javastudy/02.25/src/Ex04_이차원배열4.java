
public class Ex04_이차원배열4 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int num = 21;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= 0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
