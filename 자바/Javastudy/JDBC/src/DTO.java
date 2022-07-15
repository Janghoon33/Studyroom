import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DTO {

   // 데이터베이스에 접근을 하는 기능들을 정리하는 class
   // DataBase Transfer Object
   
   // 1. 동적 드라이버 연결
   // 2. 데이터 베이스 연결
   // 3. sql전송 (insert, select, update, delete) 
   // 4. 연결 종료
   
   // 메소드로 구현하여 관리 !!
   Connection conn = null;
   PreparedStatement psmt = null;
   ResultSet rs = null;
   
   // 결과를 확인할 수 있는 변수 
   int cnt = 0;
   
   public void getconn() {
      // 드라이버 연결 및 데이터베이스 연결 메소드
      
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String db_id = "hr";
         String db_pw = "hr";
         
         conn = DriverManager.getConnection(url, db_id, db_pw);
         
      } catch (Exception e) {
         e.printStackTrace();
      }
      
   }
   
   
   // 연결을 종료하는 메소드 생성
   public void close() {
   
         try {
            if(rs != null) {
               rs.close();
            }if(psmt != null) {
               psmt.close();
            }if(conn != null) {
               conn.close();
            }
         } catch (SQLException e) {
            e.printStackTrace();
         }
      
   }
   
   // insert 기능을 갖는 메소드
   public int insert(String id, String pw, String name, int age) {
      
      getconn();
      
      try {
         String sql = "insert into members values(?, ?, ?, ?)";
         
         psmt = conn.prepareStatement(sql);
         
         psmt.setString(1, id);
         psmt.setString(2, pw);
         psmt.setString(3, name);
         psmt.setInt(4, age);
         
         // sql문장 실행 요청하기
         cnt = psmt.executeUpdate();
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      close();
      
      
      return cnt;
      
   }
   
}