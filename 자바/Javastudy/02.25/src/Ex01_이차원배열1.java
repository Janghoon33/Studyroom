
public class Ex01_이차원배열1 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
        int num=1;
        // 첫번쨰 for문은 몇번째 행에 있는 배열인지 나타내줌
        // 이차원 배열에서 배열명.length -> 첫번째 배열의 길이를 나타냄
        for(int i = 0; i<arr.length;i++) {
        	for(int j = 0;j<arr.length;j++) {
        		arr[i][j] = num;
        		num++;
        	}		
        }
        for(int i = 0; i<arr.length; i++) {
        	for(int j = 0;j<arr[0].length;j++) {
        	    System.out.print(arr[i][j]+"\t");
        	}
        System.out.println();
        }
        
        
        
		
		
		
	}

}
