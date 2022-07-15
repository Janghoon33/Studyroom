package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.pocketmon_default;

public class SaveLoad {
   PreparedStatement psmt = null;
   Connection conn = null;
   public String id;
   public String pw;
   

   // 포켓몬 정보 저장하기
   public boolean Save(int hp, String name, int EXP, int lv, String skill1, String skill2, String skill3, String id, int MaxHP) {
      boolean result = false;
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

      // 포켓몬정보 저장
      String sql = "insert into pocketmon_info values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

      int count = 0;

      try {
         psmt = conn.prepareStatement(sql);
         psmt.setInt(1, hp);
         psmt.setString(2, name);
         psmt.setInt(3, EXP);
         psmt.setInt(4, lv);
         psmt.setString(5, skill1);
         psmt.setString(6, skill2);
         psmt.setString(7, skill3);
         psmt.setString(8, id);
         psmt.setInt(9, MaxHP);

         count = psmt.executeUpdate();

      } catch (Exception e1) {
         e1.printStackTrace();
      } finally {
         try {
            if (conn != null) {
               conn.close();
            }
            if (psmt != null) {
               psmt.close();
            }
         } catch (Exception e) {
            e.printStackTrace();

         }
      }

      if (count > 0) {
         return result = true;
      } else {
         return result = false;
      }

   }

   
   
   
   // 포켓몬 정보 불러오기
   public pocketmon_default Load(String id)  {
      
      PreparedStatement psmt = null;
      ResultSet rs = null;
      
      //DB 연결
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
      
      //데이터 불러오기
      pocketmon_default monP = new pocketmon_default();
      
      try {
         String sql = "select * from pocketmon_info where id =  ?";
         
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, id);
         rs = psmt.executeQuery();
   
         
         while (rs.next()) {
         
            monP.setHP(rs.getInt(1));
            monP.setName(rs.getString(2));
            monP.setEXP(rs.getInt(3));
            monP.setLv(rs.getInt(4));
            monP.setSkill1(rs.getString(5));
            monP.setSkill2(rs.getString(6));
            monP.setSkill3(rs.getString(7));
            monP.setId(rs.getString(8));
            monP.setMaxHP(rs.getInt(9));
            
            
            System.out.println("Lv."+ monP.getLv() + " " +monP.getName());
            System.out.println(monP.getName()+"을(를) 불러옵니다.");
            
            break;
         }
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (conn != null) {
               conn.close();
            }
            if (psmt != null) {
               psmt.close();
            }
         } catch (Exception e) {
            e.printStackTrace();

         }
         
      }
      return monP;
   }
}