package com.bbagym.app.businessUser.dao;

import org.apache.ibatis.session.SqlSession;

import com.bbagym.app.dto.BusinessUserDTO;
import com.bbagym.app.dto.UserDTO;
import com.mybatis.config.MyBatisConfig;

public class BusinessUserDAO {
   public SqlSession sqlSession;
   
   public BusinessUserDAO(){
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
   public void join(BusinessUserDTO businessUserDTO) {
      sqlSession.insert("businessUser.buJoin", businessUserDTO);
   }
   
   public BusinessUserDTO login(BusinessUserDTO businessUserDTO) {      
      BusinessUserDTO bn = sqlSession.selectOne("businessUser.buLogin", businessUserDTO);
      return bn;
   }
   
   public void delete(BusinessUserDTO BuserDTO) {      
      sqlSession.delete("businessUser.buDelete", BuserDTO);
      
   }
   public BusinessUserDTO findId(BusinessUserDTO BuserDTO){
      BusinessUserDTO bUser = sqlSession.selectOne("businessUser.buFindId",BuserDTO);
       
       return bUser;
   }
   
   public boolean checkId(String bUserId) {
      //selectOne()의 반환타입은 Object 타입이라 비교를 하기위해 Integer로 형변환
      return (Integer)sqlSession.selectOne("businessUser.buCheckId", bUserId) <= 0;
   }
   
   public int buUpdate(BusinessUserDTO BuserDTO){
	      return sqlSession.update("businessUser.buUpdate", BuserDTO);
	   }
   
}