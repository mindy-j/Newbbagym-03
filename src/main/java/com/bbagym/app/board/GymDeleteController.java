package com.bbagym.app.board;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.board.dao.BoardDAO;

public class GymDeleteController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException, ServletException {
			
		Result result = null;
		System.out.println("=======GymDelete컨트롤러========");

		BoardDAO dao = new BoardDAO();
		
		int boardNum = Integer.parseInt(request.getParameter("boardNum"));
		dao.gymDelete(boardNum); 
		
		return null;
	}

}
