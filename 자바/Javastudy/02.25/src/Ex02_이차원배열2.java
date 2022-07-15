
public class Ex02_이차원배열2 {

	public static void main(String[] args) {
	    int[][] arr = new int[5][5];
	    int num = 21;
	    for(int i = 0; i<arr.length;i++) {
	    	for(int j = 0; j<arr.length; j++) {
	    		arr[i][j]=num;
	    		num++;
	    	}
	    }
	    for(int i = 0; i<arr.length;i++) {
	    	for(int j = 0; j<arr.length; j++) {
	    	System.out.print(arr[i][j]+"\t");
	    	}
	    	System.out.println();
	    }
		
		
		
		
		

	}

}
