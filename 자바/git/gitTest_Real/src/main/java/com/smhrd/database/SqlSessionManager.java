package com.smhrd.database;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//DB 관련 정보 읽어오는 작업 - mybatis-config.xml
//SqlSessionFactory 생성
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


