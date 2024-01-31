import java.util.Scanner;
import java.util.*;

// 백준 대소문자바꿔서 출력 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] b = a.toCharArray();
        
        for(int i = 0; i < b.length; i++){
            if(Character.isUpperCase(b[i])){
               System.out.print( Character.toLowerCase(b[i]));
            } else if(Character.isLowerCase(b[i])){
                 System.out.print( Character.toUpperCase(b[i]) );
            }
        }
        
        
    }
}
