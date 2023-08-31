package com.bbagym.app.board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.bbagym.app.board.dto.BoardDTO;
import com.mybatis.config.MyBatisConfig;

public class BoardDAO {
	public SqlSession sqlSession;
	
	public BoardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	public void gymWrite(BoardDTO boardDTO) {
		sqlSession.insert("board.gymWrite", boardDTO);
	}
	
	
	
	//게시글 목록
	public List<BoardDTO> getList(int startRow, int endRow){
		Map<String, Integer> pageMap = new HashMap<String, Integer>();
		pageMap.put("startRow", startRow);
		pageMap.put("endRow", endRow);
		
		return sqlSession.selectList("Board.getList");
		
	}
	}
