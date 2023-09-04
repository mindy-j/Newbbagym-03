package com.bbagym.app.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.admin.dao.NoticeBoardDAO;
import com.bbagym.app.noticeBoardDTO.NoticeBoardDTO;

public class NoticeBoardUpdateController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {
		
		NoticeBoardDAO noticeBoardDAO = new NoticeBoardDAO();
		int noticeNum = Integer.parseInt(request.getParameter("noticeNum"));
		NoticeBoardDTO noticeBoardDTO = noticeBoardDAO.noticeBoardDetail(noticeNum);
		
		request.setAttribute("noticeBoardUpdate", noticeBoardDTO);
		
		return null;
	}
}
