package com.smhrd.domain;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;


public class ExMemberDAO {
	//SqlSessionFactory 생성 (연결해야하는 DB 설정 정보 가지고 있음)
	// -> Session 생성 (DB연결, 작업수행, 종료 작업)
		SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
		
		
		
		//회원가입 기능
		public int ExInsertMember(ExMember ex_member) {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			int cnt = 0;
			try {
				cnt = sqlSession.insert("com.smhrd.domain.ExMemberDAO.ExInsertMember", ex_member);
				if(cnt>0) {
					sqlSession.commit();
				}else {
					sqlSession.rollback();
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
			return cnt;
		}
		
		
		
		
		//로그인기능
		public Member exSelectMember(String ex_id) {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			Member loginMember = null;
			try {
				//selectOne() -> 결과값(Object)
				//->결과값이 항상 1개 아니면 null
				//같은 아이디/ 패스워드가 테이블에 여러개 들어가 있을 경우에는 오류!
				loginMember = sqlSession.selectOne("com.smhrd.domain.ExMemberDAO.ExSelectMember", ex_id);
				//cnt = sqlSession.insert("com.smhrd.domain.MemberDAO.insertMember", member);
				if(loginMember != null) {
					sqlSession.commit();
				}else {
					sqlSession.rollback();
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
			return loginMember;
		}
		
		//수정기능
		public int updateMember(Member m_vo) {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			int cnt = 0;
			try {
				
				cnt = sqlSession.update("com.smhrd.domain.MemberDAO.updateMember", m_vo);
				
				if(cnt>0) {
					sqlSession.commit();
				}else {
					sqlSession.rollback();
				}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
			return cnt;
		}
		//select 실행 시 호출할 메서드
		//1. selectOne() -> Object (원하는 타입을 mapper 지정 - resultType)
		// -> null, 1 / 그 이상의 값이 있을 경우에는 오류가 남!!(주의)
		//2. selectList() -> List (결과값)
		//(mapper(resultType -> List 안에 들어가는 객체의 타입(클래스 경로))
		
		//전체회원정보 불러오는 기능
		public List<ExMember> selectAll() {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			List<ExMember> ExmemberList = null;
			
			try {
				ExmemberList = sqlSession.selectList("com.smhrd.domain.ExMemberDAO.selectAll");
				
				if(ExmemberList!=null) {
					sqlSession.commit();
				}else {
					sqlSession.rollback();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
			return ExmemberList;
		}
		
		//삭제 기능
		public int deleteMember(String email) {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			int cnt = 0; 
			try {
				cnt = sqlSession.delete("com.smhrd.domain.MemberDAO.deleteMember", email);
				
				if(cnt>0) {
					sqlSession.commit();
				}else {
					sqlSession.rollback();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				sqlSession.close();
			}
			return cnt;
		}
		
		
		public boolean emailCheck(String email) {
			SqlSession sqlSession = sqlSessionFactory.openSession();
			boolean check = false; // 사용할 수 있으면(db에 값이 없다) - true
									//사용할 수 없으면(db에 값이 있다) - false
			try {
				//email2 <- 이미 있는 이메일 입력한 경우에는 해당하는 이메일이 그대로 반환
				//		 <- 없는 이메일 입력한 경우에는 null 값 반환
				String Exemail2 = sqlSession.selectOne("com.smhrd.domain.ExMemberDAO.selectEmail",email); //고쳐야 함
				
				if(Exemail2!=null) {
					check = false;
					sqlSession.commit();
				}else {
					check = true;
					sqlSession.commit();  //select는 commit/rollback 생략해도 됨
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}finally {
				sqlSession.close();
				
			}
			return check;
		}
		
	}

