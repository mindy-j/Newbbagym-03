package com.bbagym.app.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bbagym.app.admin.vo.BoardVO;
import com.bbagym.app.dto.BusinessUserDTO;
import com.bbagym.app.dto.UserDTO;
import com.mybatis.config.MyBatisConfig;

public class AdminDAO {

   public SqlSession sqlSession;
   
   public AdminDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
   //일반회원관리
   public List<UserDTO> selUser() {
      return sqlSession.selectList("admin.selUser");
   }
   
   public void delUser(UserDTO userDTO) {
      sqlSession.delete("admin.delUser", userDTO);
   }
   
   //시설등록자관리
   public List<BusinessUserDTO> selBusinessUser() {
      return sqlSession.selectList("admin.selBusinessUser");
   }
   
   public void delBusinessUser(BusinessUserDTO businessUserDTO) {
      sqlSession.delete("admin.delBusinessUser", businessUserDTO);
   }
   
   //운동시설관리
   public List<BoardVO> selBoard() {
      return sqlSession.selectList("admin.selBoard");
   }
   
   public void delBoard(BoardVO boardVO) {
      sqlSession.delete("admin.delBoard", boardVO);
   }
}