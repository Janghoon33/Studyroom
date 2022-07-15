
public class Ex05_for僥蕨薯4 {

	public static void main(String[] args) {

//		for (int i = 1; i < 51; i++) {
//			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//				System.out.print("夢熱 ");
//			} else if (i % 10 == 5) {
//				System.out.print("戲學 ");
//			} else {
//				System.out.print(i + " ");
//			}
//		}
		
		for(int i = 1; i <= 50; i++) {
			switch(i%10) {
			case 3,6,9:
				System.out.print("夢熱 ");
			break;
			case 5 :
				System.out.print("戲學 ");
				break;
			default:	
				System.out.print(i+" ");
				break;
			}
		}

		
		
		
		
	}

}
