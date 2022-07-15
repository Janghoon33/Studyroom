package com.smhrd.domain;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class BoardDAO {
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	
	public int getLike(int boardNum) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//0으로 해놨을때 잘못 실행된지 판단불가능(초기엔 0이기 때문)
		int like = -1;

		try {
			like = (int)sqlSession.selectOne("com.smhrd.domain.BoardDAO.getLike", boardNum);
			if(like!=-1) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}finally {
			sqlSession.close();
		}
		return like;
	}
	
	public int updateLike(String status,int boardNum) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int cnt = 0;

		try {
			//좋아요
			if(status.equals("like")) {
				cnt = (int)sqlSession.update("com.smhrd.domain.BoardDAO.like", boardNum);
			}else { //싫어요
				cnt = (int)sqlSession.update("com.smhrd.domain.BoardDAO.dislike", boardNum);
			}
			
			if(cnt>0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cnt;
	}
	
	public List<Comm> selectAllComm(int boardNum) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Comm> commList = null;

		try {
			commList = sqlSession.selectList("com.smhrd.domain.BoardDAO.selectAllComm", boardNum);
			if(commList!=null) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}finally {
			sqlSession.close();
		}
		return commList;
	}
	
	public int addComment(Comm comm) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int commNum = 0; //반환값 (현재 삽입된 댓글의 번호 - 시퀀스)
		try {
			//댓글 삽입
			sqlSession.insert("com.smhrd.domain.BoardDAO.addComment", comm);
			//삽입완료
			//삽입된 댓글의 시퀀스 가지고오기 (삭제)
			commNum = sqlSession.selectOne("com.smhrd.domain.BoardDAO.getCommNum");
			
			if(commNum!=0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}finally {
			sqlSession.close();
		}
		return commNum;
	}
	
	public int deleteComment(int commNum) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int cnt = 0;
		try {
			cnt = sqlSession.delete("com.smhrd.domain.BoardDAO.deleteComment", commNum);
			if(cnt>0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}finally {
			sqlSession.close();
		}
		return cnt;
	}
}
