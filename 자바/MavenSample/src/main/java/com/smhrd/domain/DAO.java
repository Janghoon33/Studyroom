package com.smhrd.domain;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;
//정적(static)
//:프로그램이 실행되자마자 객체생성 변수선언따로 X
//특정한 주소에 자리 잡음 static 있으면 다른 클래스에서도 변수 사용가능
//동적(non-static)
//:주소를 알려줘야 찾아갈수 있음
public class DAO {
   SqlSessionFactory sqlSessionFactory =  SqlSessionManager.getSqlSession();
   //static에 써져 있기에 바로 호출 가능
   SqlSession sqlSession = sqlSessionFactory.openSession();
   //MemberMapper 와 DAO 는 연동해서 사용
   //회원가입
  
   public int join(Member m_vo) {
      int cnt = 0;
      try {
         //sql문이 제대로 실행되었을때 (가입성공) -> commit
         //sql문이 실행 되지 않았을때 (가입실패) -> rollback
         //cnt -> 제데로 삽입(1) 안되면 (0)
         
         cnt = sqlSession.insert("com.smhrd.domain.DAO.insert",m_vo);
         
         if(cnt>0) {
            sqlSession.commit();
         }else {
            sqlSession.rollback();
         }
         
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         sqlSession.close();
      } return cnt;
   }
   
   public Member login(Member m_vo) {
      Member m = null;
      try {
         //sql문이 제데로 실행되었을때 (가입성공) -> commit
         //sql문이 실행 되지 않았을때 (가입실패) -> rollback
         //cnt -> 제데로 삽입(1) 안되면 (0)
         
         m = (Member)sqlSession.selectOne("com.smhrd.domain.DAO.selectOne", m_vo);
         
         if(m!=null) {
            sqlSession.commit();
         }else {
            sqlSession.rollback();
         }
         
         
      }catch(Exception e) {
         e.printStackTrace();
      }finally {
         sqlSession.close();
      } return m;
   }
   
   
}