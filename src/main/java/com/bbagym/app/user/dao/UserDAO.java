package com.bbagym.app.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bbagym.app.dto.UserDTO;
import com.mybatis.config.MyBatisConfig;

public class UserDAO {
   public SqlSession sqlSession;
   
   public UserDAO(){
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
   public void join(UserDTO userDTO) {
      sqlSession.insert("user.join", userDTO);
   }
   
   public UserDTO login(UserDTO userDTO) {      
      UserDTO user = sqlSession.selectOne("user.login", userDTO);      
      return user;
   }
   
   public void delete(UserDTO userDTO) {      
      sqlSession.delete("user.delete", userDTO);
      
   }
   
   public UserDTO findId(UserDTO userDTO){
       UserDTO user = sqlSession.selectOne("user.findId",userDTO);
       
       return user;
   }
   
   public boolean checkId(String userId) {
      //selectOne()의 반환타입은 Object 타입이라 비교를 하기위해 Integer로 형변환
      return (Integer)sqlSession.selectOne("user.checkId", userId) <= 0;
   }
   
   public int update(UserDTO userDTO){
	      return sqlSession.update("user.update", userDTO);
	   }
	   
   
}