package com.smhrd.domain;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class SelectExDAO {
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	public List<SelectExmember> selectEx() {
		System.out.println("실행로직1");
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<SelectExmember> exmList = null;
		
		try {
			System.out.println("실행로직2");
			exmList = sqlSession.selectList("com.smhrd.domain.SelectExDAO.selectEx");
			System.out.println("타이틀"+exmList.get(0).getTitle());
			System.out.println("실행로직3");
			if(exmList!=null) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return exmList;
		
		
	}

	public int selectEx(SelectExmember m_vo) {
	      SqlSession sqlSession = sqlSessionFactory.openSession();
	       int cnt = 0;
	          try {
	                cnt = sqlSession.delete("com.smhrd.domain.MessageDAO.deleteMessage", m_vo);
	                if(cnt>0) {
	                   sqlSession.commit();
	                }else {
	                   sqlSession.rollback();
	                }
	               }catch(Exception e) {
	                e.printStackTrace();
	             }finally {
	                sqlSession.close();
	             }return cnt;
	   }

	
	
}
