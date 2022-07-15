package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Member_info {

   PreparedStatement psmt = null;
   Connection conn = null;
   Scanner sc = new Scanner(System.in);

   public void getconn() {
      // 데이터베이스 연결
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");

         String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
         String db_id = "campus_a_0310_1";
         String db_pw = "smhrd1";

         conn = DriverManager.getConnection(url, db_id, db_pw);

      } catch (Exception e) {
         System.out.println("DB 연결 오류");
         e.printStackTrace();

      }
   }

   
   //회원가입
   public boolean join(String id, String pw) {

      boolean result = false;
      try {
         getconn();

      
         String sql = "insert into member_info values(?, ?)";

         psmt = conn.prepareStatement(sql);

         psmt.setString(1, id);
         psmt.setString(2, pw);
         

         int cnt = psmt.executeUpdate();

         if (cnt > 0) {
            result = true;
            System.out.println("회원가입 성공!");
         }

      } catch (Exception e) {
   
         System.out.println("드라이버 연동 오류"); 
         e.printStackTrace();

      } 
      finally {
         try {
            if (psmt != null) {
               psmt.close();
            }
            if (conn != null) {
               conn.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
      return result;
   }

//   public boolean id_check(String id) {
//      String sql = "select id from member_info";
//      try {
//         psmt = conn.prepareStatement(sql);
//         ResultSet rs = psmt.executeQuery();
//         
//      while (rs.next()) {
//         if(rs.getString(id).equals(id)) {
//            return true;
//         }
//      }
//      }catch(Exception e) {
//         e.printStackTrace();
//      }
//      return false;
//   }

   public int login(String id, String pw) {
      // 로그인
      getconn();

      String sql = "select * from member_info where id = ? and pw = ?";
      int result = 0;
      try {
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, id);
         psmt.setString(2, pw);
         ResultSet rs = psmt.executeQuery();
         if (rs.next()) {
            result = 1;
         }
      } catch (Exception e) {
         e.printStackTrace();
      }finally {
         try {
            if (psmt != null) {
               psmt.close();
            }
            if (conn != null) {
               conn.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
      
      return result;
   }

   


}