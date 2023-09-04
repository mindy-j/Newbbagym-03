package com.bbagym.app.board;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.comment.dao.CommentDAO;
import com.bbagym.app.comment.dto.CommentDTO;

public class CommentWriteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {
		System.out.println("commentWriteOkController 실행");
		CommentDAO dao = new CommentDAO();
		CommentDTO dto = new CommentDTO();
		Result result = null;
		
		dto.setCommentContent(request.getParameter("commentContent"));
		dto.setBoardNum(Integer.parseInt(request.getParameter("boardNum")));
		if(request.getParameter("userNum") != null && request.getParameter("userNum") != "") {
			dto.setUserNum(Integer.parseInt(request.getParameter("userNum")));
			dao.userCommentWrite(dto);
		}else {
			dto.setBusinessUserNum(Integer.parseInt(request.getParameter("businessUserNum")));
			dao.businessUserCommentWrite(dto);
		}
		
		System.out.println("댓글 작성 완료");
		return null;
	}
	
}
