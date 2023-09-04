package com.bbagym.app.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.admin.dao.NoticeBoardDAO;
import com.bbagym.app.noticeBoardDTO.NoticeBoardDTO;

public class NoticeBoardUpdateOkController implements Execute{
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {
		Result result = null;
		
		NoticeBoardDAO dao = new NoticeBoardDAO();
		NoticeBoardDTO dto = new NoticeBoardDTO();
		
		int noticeNum = Integer.parseInt(request.getParameter("noticeNum"));
		dto.setNoticeTitle(request.getParameter("updateTitle"));
		dto.setNoticeContent(request.getParameter("updateContent"));
		dto.setNoticeNum(noticeNum);
		dao.noticeBoardUpdate(dto);
		System.out.println("=======컨트롤러========");
		
		return null;
	}
}
