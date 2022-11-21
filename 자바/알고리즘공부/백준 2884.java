import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if (M < 45) {
			M = M + 60;
			H--;
			if (H < 0) {
                H = 23; 
		    }
        }
		System.out.println(H);
		System.out.println(M-45);
    }
}
