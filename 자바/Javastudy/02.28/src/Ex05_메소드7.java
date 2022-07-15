import java.util.Arrays;

public class Ex05_메소드7 {

	public static void main(String[] args) {
		int[] arr = {1,3,4,8,7,9,10};
		int num1=10;
		aTS(arr,num1);// 배열안에 있는 데이터를 출력시키는 메소드
		
		System.out.println("결과1 : "+arr[0]);
		System.out.println("결과2 : "+num1);
		
	}
    public static void aTS(int[] arr,int num1) {
//    for(int i=0; i<arr.length;i++) {
//    	System.out.print(arr[i]+" ");}
    	arr[0] = 30;
    	num1=30;
    System.out.println(Arrays.toString(arr));
    }
    
}
