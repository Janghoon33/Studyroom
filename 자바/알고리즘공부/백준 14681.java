import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        if(X > 0){ // X가 양수일 때
            if(Y > 0){ // X가 양수이면서 Y도 양수 일 때
                System.out.println("1사분면");
            }
            else { // X가 양수이면서 Y가 음수일때
                System.out.println("4사분면");
            }
        }
        else{ // X가 음수일 때
            if(Y > 0) { // X가 음수이면서 Y가 양수일 때
                System.out.println("2사분면");
            }
            else{ // X가 음수이면서 Y도 음수일 때
                System.out.println("3사분면");
            }
        }
    }
    
}