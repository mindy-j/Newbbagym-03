package com.bbagym.app.board;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.comment.dao.CommentDAO;

public class CommentDeleteController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {
		Result result = null;

		
		  CommentDAO dao = new CommentDAO(); 
		  int commentNum =Integer.parseInt(request.getParameter("commentNum"));
		  dao.commentDelete(commentNum);
		  System.out.println(commentNum);
		  System.out.println("삭제완료");
		 
		return null;
	}
	
}
