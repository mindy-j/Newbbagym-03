package com.bbagym.app.admin.dao;

import org.apache.ibatis.session.SqlSession;

import com.bbagym.app.adminDTO.AdminDTO;
import com.mybatis.config.MyBatisConfig;

public class AdminLoginDAO {
public SqlSession sqlSession;
	
	public AdminLoginDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}


	
	public AdminDTO adminLogin(AdminDTO dto) {
		  return sqlSession.selectOne("admin.adminLogin",dto);
		//selectOne : 하나의 값 : 컬럼 혹은 값 들을 가져옴
	}
}
