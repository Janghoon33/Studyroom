package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import com.example.MemberDTO;

public class MemberDAO {
	//전역변수 공간
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	String sql = "";
	int cnt = 0;
	MemberDTO dto = null;
	
	// DB 연결하는 메소드
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 3. DB 경로, id/pw 인증
								//    @127.0.0.1 프로젝트때 받을 주소 넣기
		String url = "jdbc:oracle:thin:@127.0.0.1:1521";
		String dbid = "hr";
		String dbpw = "hr";
		
		conn = DriverManager.getConnection(url, dbid, dbpw);
		if(conn != null){
			System.out.print("연결 성공");
		}else{
			System.out.print("연결 실패");
		}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}//--------------getConn끝
	
	// DB 연결 종료하는 메소드
	public void getClose() {
		try {
			
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}//------getClose끝
	
	//회원가입 기능
	public int join(String id, String pw, String nick) {
		try {
			//db연결
			getConn();
			
			sql = "insert into member_web values(?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			
			// 5. SQL 명령문 실행
			// executeQuery() -> select문 -테이블 변하지않는 경우
			// executeUpdate() -> insert, update, delete문 - 테이블 구조 변화있는 경우
			cnt = psmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//db연결 종료
			getClose();
		}
		
		
		
		return cnt;
	}//------------join끝
	
	//로그인기능
	public MemberDTO login(String id, String pw) {
		
		
		try{
			getConn();
			
			// 4. SQL 명령문 준비
			// ? : 바인드변수 -> 사용자의 값을 sql로 전달할 수 있는 통로 역할
			String sql = "select * from member_web where id=? and pw=? ";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, id);
				psmt.setString(2, pw);
			
			// 5. SQL 명령문 실행
			// executeQuery() -> select문 -테이블 변하지않는 경우
			// executeUpdate() -> insert, update, delete문 - 테이블 구조 변화있는 경우
			rs = psmt.executeQuery();
			
			if(rs.next() == true){
				String uid= rs.getString("id");
				String upw = rs.getString("pw");
				
				dto = new MemberDTO(uid,upw);
				
				
			}else{
				System.out.print("로그인 실패");
				
				//out.print("<a href='login.html'>로그인 다시하기</a>");
			}
			
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
		getClose();
		}
		return dto;
	}
	
	// 삭제기능
	public int delete(String id) {
		
		try{
			getConn();
		
		
			String sql = "delete from member_web where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			cnt = psmt.executeUpdate();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
				getClose();
		
		}
		return cnt;
	}//------- delete 끝
	
	
	// select 기능
	public MemberDTO select(String id) {

		try{
			
			getConn();
			
			String sql = "select * from member_web where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			
			rs = psmt.executeQuery();
			
			if(rs.next() == true){
				// rs객체에 담긴 다른 컬럼값 가져오기
				String uid = rs.getString("id");
				String unick = rs.getString("nick");
				String upw = rs.getString("pw");
				
				// MemberDTO객체에 정보를 담기
				dto = new MemberDTO(uid, upw, unick);
				
				
			}else{
				
				System.out.print("검색에 실패했습니다.");
				
//				out.print("<a href='select.html'>검색 다시하기</a>");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			getClose();
			}
		return dto;
		} // -- select 끝

	// 수정 기능
	public int update(String id, String select, String data) {
		
		try{
			getConn();
			
			// 4. SQL 명령문 준비
			// ? : 바인드변수 -> 사용자의 값을 sql로 전달할 수 있는 통로 역할
			if(select.equals("pw")){
				sql = "update member_web set pw=? where id = ?";
			}else{
				sql = "update member_web set nick=? where id = ?";
			}
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, data);
			psmt.setString(2, id);
			
			// 5. SQL 명령문 실행
			// executeQuery() -> select문 -테이블 변하지않는 경우
			// executeUpdate() -> insert, update, delete문 - 테이블 구조 변화있는 경우
			cnt = psmt.executeUpdate();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			getClose();
			}
		return cnt;
		}

	
	
}

