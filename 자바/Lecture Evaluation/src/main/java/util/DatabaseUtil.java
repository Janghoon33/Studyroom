package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	
	public static Connection getConnection() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/LectureEvaluation";
			String dbID = "root";
			String dbPassword = "root";
			Class.forName("com.mysql.cj.jdbc.Driver"); //cj 넣어줘야함
			return DriverManager.getConnection(dbURL,dbID,dbPassword);
			//Mysql에 접근하여 상태를 반환
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
