package com.bbagym.app.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.admin.dao.NoticeBoardDAO;

public class NoticeBoardDetailController implements Execute{
		@Override
		public Result execute(HttpServletRequest request, HttpServletResponse response)
				throws IOException, ServerException {
			Result result = null;
			
			NoticeBoardDAO dao = new NoticeBoardDAO();
			int noticeNum = Integer.parseInt(request.getParameter("noticeNum")) ;
			request.setAttribute("noticeBoardDetail", dao.noticeBoardDetail(noticeNum)); //여기 boardNum값 어캐주는지
			System.out.println("=======NoticeBoardDetail컨트롤러========");
			
			
			return null;
		}

	}

