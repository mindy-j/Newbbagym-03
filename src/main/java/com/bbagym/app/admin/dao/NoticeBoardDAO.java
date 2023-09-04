package com.bbagym.app.admin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.bbagym.app.noticeBoardDTO.NoticeBoardDTO;
import com.mybatis.config.MyBatisConfig;

public class NoticeBoardDAO {
	public SqlSession sqlSession;
	
	public NoticeBoardDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}


	
	public void NoticeBoardWrite(NoticeBoardDTO dto) {
		  sqlSession.insert("notice.noticeBoardWrite",dto);
		//selectOne : 하나의 값 : 컬럼 혹은 값 들을 가져옴
		
	}
	
	public List<NoticeBoardDTO> selectAll(Map<String, Integer> pageMap){
		System.out.println("======DAO확인=====");
		return sqlSession.selectList("notice.noticeBoardList",pageMap);
	}
	
	public NoticeBoardDTO noticeBoardDetail(int boardNum){
		System.out.println("======noticeBoardDetail 확인=====");
		return sqlSession.selectOne("notice.noticeBoardDetail",boardNum);
	}
	public void noticeBoardUpdate(NoticeBoardDTO dto) {
		System.out.println("noticeBoardUpdate 확인");
		sqlSession.update("notice.noticeBoardUpdate", dto);
	}
	
	public void noticeBoardDelete(int boardNum) {
		System.out.println("noticeBoardDelete 확인");
		sqlSession.delete("notice.noticeBoardDelete",boardNum);
	}
	
	//	BoardDAO에 추가한다.
	public int getTotal() {
			return sqlSession.selectOne("notice.getTotal");
		}

}
