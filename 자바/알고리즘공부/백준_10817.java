import java.util.Arrays;
import java.util.Scanner;

// 문제 : 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
// 출력 : 두 번째로 큰 정수를 출력한다.
public class 백준_10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[3];
        for (int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(num); // 배열 오름차순 정렬하기
        System.out.println(num[1]); // 정렬된 정수 중 2번째로 큰 정수 출력하기
        
    }
}
