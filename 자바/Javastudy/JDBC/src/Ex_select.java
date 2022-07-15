import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_select {
   
   public static void main(String[] args) {
      
      // 객체 생성
      Connection conn = null;
      PreparedStatement psmt = null;
      ResultSet rs = null; // 테이블 형태로 이루어진 객체
      Scanner sc = new Scanner(System.in);
      
      try {
         // 1. 드리어버 로딩 -> Class.forName()
         Class.forName("oracle.jdbc.driver.OracleDriver");

         // 2. 데이터 베이스 연결 -> DriverManager.getConnection();
         
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String db_id = "hr";
         String db_pw = "hr";
         
         conn = DriverManager.getConnection(url,db_id,db_pw);
         
         // 테이블을 조회하는 sql문 생성
//         String sql = "select * from members ";
         
         // 사용자로 부터 검색값 입력 받기
         System.out.print("검색할 아이디 : ");
         String id = sc.next();
         System.out.print("검색할 비밀번호 : ");
         String pw = sc.next();
         
         // 찾고자하는 조건에 대한 sql문 생성
         String sql = "select name, age from members where id = ? and pw = ? ";
         
         psmt = conn.prepareStatement(sql);
         
         psmt.setString(1, id);
         psmt.setString(2, pw);
         
         // executeUpdate() : 삽입, 삭제, 수정등의 테이블의 내용이 바귀는 것
         // executeQuery() : 조회와 같은 테이블의 전후가 똑같은 작업
         rs = psmt.executeQuery();
         
         // 데이터가 존재한다면 반복적으로 확인 진행하기
         while(rs.next()) {
//            String id = rs.getString(1); // rs.getString("id");
//            String pw = rs.getString(2);
//            String name = rs.getString(3);
//            int age = rs.getInt(4);
            
//            System.out.println(id + "/" + pw + "/" + name + "/" + age);
      
         String name = rs.getString("name");
         int age = rs.getInt("age");
         
         System.out.println(name + "/" +age);
         
         
         
         
         
         }
         
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      finally {
         
            try {
               if(rs != null) {
               rs.close();
               }if (psmt != null) {
                  psmt.close();
               }if (conn != null) {
                  conn.close();
               }
            } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
      
      
   }
}