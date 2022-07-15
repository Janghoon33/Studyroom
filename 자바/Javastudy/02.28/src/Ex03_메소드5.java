
public class Ex03_메소드5 {
public static void main(String[] args) {
	
        int num1 = 11;
        int num2 = 5;
        int result = close10(num1,num2);
        System.out.println("10에 가까운 수 : "+result);
}

public static int close10(int num1, int num2) {
// 10과의 거리를 알아야함
int result = 0; //10과 더 가까운수를 담아줄 변수

int resultNum1 = 10-num1;
int resultNum2 = 10-num2;

if(resultNum1<0) {
   resultNum1=-1*resultNum1;
}
if(resultNum1<0) {
   resultNum1=-1*resultNum1;
}
//resultNum1, resultNum2 각각 거리에 맞는 절대값이 들어가게됨
if(resultNum1>resultNum2) {
   result = num2;
}else if(resultNum1<resultNum2) {
   result = num1;
}
return result;
}
	
}
