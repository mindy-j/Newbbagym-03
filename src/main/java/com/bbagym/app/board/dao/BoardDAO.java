package com.bbagym.app.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.bbagym.app.board.dto.BoardDTO;
import com.bbagym.app.noticeBoardDTO.NoticeBoardDTO;
import com.mybatis.config.MyBatisConfig;

public class BoardDAO {
   public SqlSession sqlSession;
   
   public BoardDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   

   //게시글 작성
   public void gymWrite(BoardDTO boardDTO) {
      sqlSession.insert("board.gymWrite", boardDTO);
      
   }
   //전체 페이지
   public int getTotal() {
            return sqlSession.selectOne("board.getTotal");
         }
   
   //운동시설상세페이지
   public BoardDTO selBoardDetail(int boardNum) {
      return sqlSession.selectOne("board.selBoardDetail", boardNum);
   }
   // 게시물 삭제 ################
   public void delBoardDetail(BoardDTO boardDTO) {
      sqlSession.delete("board.delBoardDetail", boardDTO);
   }   
   //게시글 목록
   public List<BoardDTO> getList(){
      //System.out.println("getList 확인");
      System.out.println(sqlSession.selectList("board.getList"));
      
      sqlSession.selectList("board.getList");
      return sqlSession.selectList("board.getList");
         
      }
   
   public void gymDelete(int boardNum) {
	   System.out.println("gym delete dao 실행");
	   sqlSession.delete("board.gymDelete",boardNum);
   }
   
   public void gymUpdate(BoardDTO dto) {
		System.out.println("gymUpdate 확인");
		sqlSession.update("board.gymUpdate", dto);
	}
   
   }