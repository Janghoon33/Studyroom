package com.smhrd.database;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//myBatis 설정파일을 읽어 db 커녁션 후 세션 반환
//SqlSessionFactoryBuilder : MyBatis 설정파일 바탕으로 SqlSessionFactory 생성
//SqlSessionFactory : SqlSession 생성
//SqlSession : Sql 실행, 트랜잭션 관리
public class SqlSessionManager {
	public static SqlSessionFactory sqlSession;

	static {
		String resource = "com/smhrd/database/mybatis-config.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSession = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static SqlSessionFactory getSqlSession() {
		return sqlSession;
	}
}
