package util;

import java.security.MessageDigest;

public class SHA256 {
	
	public static String getSHA256(String input) {
		StringBuffer result = new StringBuffer();
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256"); // 사용자가 입력한 값을 SHA-256의 알고리즘적용
			byte[] salt = "Hello This is Salt.".getBytes(); // 해커에게서 보호하기 위해 salt적용
			digest.reset();
			digest.update(salt);
			byte[] chars = digest.digest(input.getBytes("UTF-8"));
			
			for(int i = 0; i<chars.length; i++) {
				String hex = Integer.toHexString(0xff & chars[i]);
				if(hex.length()==1) result.append("0");
				result.append(hex);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}
	
}
