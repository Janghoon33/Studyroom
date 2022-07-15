import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex_insert {

   public static void main(String[] args) {
      // JDBC 연결 순서 (4단계)
      // 0. (선행작업) ojdbc6.jar 파일 연결하기
      // 1. JDBC 드라이버 로딩
      // 2. 데이터베이스 연결
      // 3. SQL문 전송(실행)
      // 4. 연결 종료

      // 자바의 오류
      // 1. 컴파일 오류 : 문법적인 오류
      // 2. 런타임 오류 : 문법적으로 오류 발생하지 않지만 실행시 오류가
      // 발생하는 것 -> 다운캐스팅, 드라이버 설치

      // 객체 생성을 위한 전역변수 선언하기
      PreparedStatement psmt = null;
      Connection conn = null;
      Scanner sc = new Scanner(System.in);
      
      // 1. 드라이버 로딩 -> Class.forName()
      try { // 무조건 실행을 할 수 있는 기능, 에외처리가 필요한 기능
         Class.forName("oracle.jdbc.driver.OracleDriver");

         // 2. 데이터 베이스 연결
         // -> DriverManager.getConnection(데이터베이스 주소, 아이디, 비밀번호)

         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String db_id = "hr";
         String db_pw = "hr";

         conn = DriverManager.getConnection(url, db_id, db_pw);

//         if (conn != null) {
//            System.out.println("연결 성공입니다!");
//         }

         System.out.print("가입 아이디 : ");
         String id = sc.next();
         
         System.out.print("가입 비밀번호 : ");
         String pw = sc.next();
         
         System.out.print("가입 이름 : ");
         String name = sc.next();
         
         System.out.print("가입 나이 : ");
         int age = sc.nextInt();
         
         // 3. sql 전송
         // csm, 0117, 채수민, 22
//         String sql = "insert into members values('"+ id + "','"+ pw + "','" + name + "',"+ age +")";

         String sql = "insert into members values(?, ?, ?, ?)";
         
         
         psmt = conn.prepareStatement(sql);
         
         psmt.setString(1,id);
         psmt.setString(2,pw);
         psmt.setString(3,name);
         psmt.setInt(4,age);

         // sql문장 실행 요청하기
         int cnt = psmt.executeUpdate();

         if (cnt > 0) {
            System.out.println("insert 성공");
         }

      } catch (ClassNotFoundException e) {
         // try 구문에서 실행시 발생되는 오류에 대해 처리할 수 있는 기능
         System.out.println("드라이버 연동 오류");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("데이터 베이스 오류");
         e.printStackTrace();
      }

      // 4. 연결 종료 -> 닫아주는 역순서가 중요!
      // try, catch 어디서든 상관없이 사용이 됐다면
      // 반드시 마지막에 연결 종료하기!
      finally {

         try {
            if (psmt != null) {
               psmt.close();
            } if(conn != null) {
               conn.close();
            }
         } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

         }
      }

   }
}