import java.util.Scanner;

// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
// 오른쪽 기준
// 첫번째 방법
public class 백준_2439_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i <= N; i++){
            for(int j =1; j <= N - i; j++){
                System.out.println(" "); // 오른쪽 기준으로 별이 나오기 때문에 공백을 N - i 만큼 찍어주는 반복문
            }
            for(int k = 0; k < i; k++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}