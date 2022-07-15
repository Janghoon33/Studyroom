package hhd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// 데이터베이스에 접근하는 역할의 클래스
public class MenuDAO{
   private String driverName = "oracle.jdbc.driver.OracleDriver";
   private String url = "jdbc:oracle:thin:@localhost:1521:xe";
   private String id = "hr";
   private String pw = "hr";
   private Connection conn;
   private PreparedStatement psmt;
   private ResultSet rs;
   
   public ArrayList<MenuDTO> selectAll() {
      // 메뉴객체들이 들어갈 빈 리스트를 생성
      ArrayList<MenuDTO> list = new ArrayList<MenuDTO>();
      try {
         conn = getConnection();
          // 3. SQL문 준비
         String sql = "select * from menu";
         psmt = conn.prepareStatement(sql);
         // 4. SQL문 실행
         rs = psmt.executeQuery();
         // 5. 실행결과 처리
         while(rs.next()) {
            int menu_num = rs.getInt("menu_num");
             String menu_name = rs.getString("menu_name");
             int menu_price = rs.getInt("menu_price");
             
             MenuDTO dto = new MenuDTO(menu_num, menu_name, menu_price);
             list.add(dto);
         }
      }catch(ClassNotFoundException e) {
         e.printStackTrace();
      }catch(SQLException e) {
         e.printStackTrace();
      }finally {
         try {
            close();
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
      return list;
   }

   private void close() throws SQLException {
      // 6. 접속 종료
      if(rs != null) rs.close();
      if(psmt != null) psmt.close();
      if(conn != null) conn.close();
   }

   private Connection getConnection() throws ClassNotFoundException, SQLException {
      // 1. 드라이버 로딩
      Class.forName(driverName);
      // 2. 데이터베이스 접속
      Connection conn = DriverManager.getConnection(url,id,pw);
      return conn;
   }
}