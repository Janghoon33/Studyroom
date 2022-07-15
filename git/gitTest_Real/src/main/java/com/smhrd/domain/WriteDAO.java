package com.smhrd.domain;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class WriteDAO {
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	SqlSession sqlSession = sqlSessionFactory.openSession();
	
	//삽입 기능
	public int insertTitle(Write wrt) {
		
		
		int cnt = 0;
		try {
			cnt = sqlSession.insert("com.smhrd.domain.WriteDAO.insertTitle",wrt);
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
	
	
	
	
	
	
	
	
	
}
