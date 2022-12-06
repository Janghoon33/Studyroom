import java.util.Scanner;

// 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
// 예를 들어 A = 150, B = 266, C = 427 이라면 
// A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
// 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
public class 백준_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 	System.out.print("첫 번째 숫자 : ");
	        int n1 = sc.nextInt();
	        System.out.print("두 번째 숫자 : ");
	        int n2 = sc.nextInt();
	        System.out.print("세 번째 숫자 : ");
	        int n3 = sc.nextInt();
	        int r = n1*n2*n3;
	        int arr[] = new int[10];
	        for(int i = 0; i < arr.length; i++) {
		        if(r != 0){
		            arr[i]= r % 10;
		            r /= 10;
		        }
	        }
	        for(int j = 1; j < arr.length-1; j++){
	            System.out.println(arr[j]);
	        }
	        sc.close();
    }
}
