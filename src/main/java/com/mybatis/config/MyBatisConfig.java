package com.mybatis.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisConfig {
	   //sqlSession을 만들기 위해 세션 팩토리가 필요하다
	   private static SqlSessionFactory sqlSessionFactory;
	   
	   static {
	      try {
	         //설정파일의 경로를 지정한다
	         String resource = "./com/mybatis/config/config.xml";
	         
	         //Resoucres 클래스를 이용하여 리소스를 읽어들여  Reader 객체로 만든다
	         Reader reader = Resources.getResourceAsReader(resource);
	         
	         //세션 팩트로 빌더에게 팩토리를 지어달라고 한다
	         sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	      }catch(IOException e) {
	         System.out.println("MyBatisConfig.java 초기화문제 발생");
	         e.printStackTrace();
	      }
	   }
	   
	   public static SqlSessionFactory getSqlSessionFactory() {
	      return sqlSessionFactory;
	   }
	}


