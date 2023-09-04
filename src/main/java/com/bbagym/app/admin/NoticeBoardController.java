package com.bbagym.app.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.admin.dao.NoticeBoardDAO;
import com.bbagym.app.noticeBoardDTO.NoticeBoardDTO;

public class NoticeBoardController implements Execute {
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException , ServerException{
		NoticeBoardDAO dao = new NoticeBoardDAO();
		NoticeBoardDTO dto = new NoticeBoardDTO();
		Result result = new Result();
		
		 dto.setNoticeTitle(request.getParameter("title"));
		 System.out.println(dto.getNoticeTitle());
         dto.setNoticeContent(request.getParameter("content"));
         System.out.println(dto.getNoticeContent());
         //valueOf()는 문자열열 Integer로 바꿔준다
         //parseInt()는 문자열이 숫자가 아닐 경우 numberFormatException 예외발생하지만
         //valueOf()는 null을 반환한다(예외발생하지 않음)
         System.out.println(dto);
         
         dao.NoticeBoardWrite(dto);
         
         result.setRedirect(true);
         result.setPath(request.getContextPath());
         System.out.println(request.getContextPath());
         try {
        	 request.getRequestDispatcher("adminNotice.me").forward(request, response);
         }catch(Exception e) {
        	 e.printStackTrace();
         }
         
         return null;
	}
}
