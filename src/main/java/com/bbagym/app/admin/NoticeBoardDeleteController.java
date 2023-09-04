package com.bbagym.app.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.admin.dao.NoticeBoardDAO;

public class NoticeBoardDeleteController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {
		Result result = null;
		System.out.println("=======NoticeBoardDelete컨트롤러========");

		NoticeBoardDAO dao = new NoticeBoardDAO();
		
		int noticeNum = Integer.parseInt(request.getParameter("noticeNum"));
		dao.noticeBoardDelete(noticeNum); 
		System.out.println("=======NoticeBoardDelete컨트롤러========");
		
		return null;
	}
}
