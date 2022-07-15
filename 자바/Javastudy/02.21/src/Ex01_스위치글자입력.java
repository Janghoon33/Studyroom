import java.util.Scanner;

public abstract class Ex01_스위치글자입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String data = sc.next();
		
//		if(data.equals("한국어")) {
//			System.out.println("안녕하세요!");
//		}else if(data.equals("영어")) {
//			System.out.println("헬로!");
		switch(data) {
		case "한국어":
				System.out.println("안녕하세요!");
			break;
	    case "영어":
				System.out.println("헬로!");
			break;
	    case "일본어":
	    	    System.out.println("곤니찌와!");
	    	break;    
		}
	}

	}


