package com.bbagym.app.comment.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.bbagym.app.comment.dto.CommentDTO;
import com.mybatis.config.MyBatisConfig;

public class CommentDAO {
	public SqlSession sqlSession;
	
	public CommentDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}


	//일반유저가 작성하는 댓글
	public void userCommentWrite(CommentDTO dto) {
		  sqlSession.insert("userCommentWrite",dto);
	}
	
	//시설사용자가 작성하는 댓글
	public void businessUserCommentWrite(CommentDTO dto) {
		  sqlSession.insert("businessUserCommentWrite",dto);
	}
	
	//댓글리스트 출력
	public List<CommentDTO> commentList(Map<String, Integer> pageMap){
		return sqlSession.selectList("comment.commentList",pageMap);
	}
	//댓글 삭제
	public void commentDelete(int commentNum) {
		sqlSession.delete("comment.commentDelete",commentNum);
	}
//	BoardDAO에 추가한다.
	public int getTotal() {
			return sqlSession.selectOne("notice.getTotal");
		}
}
