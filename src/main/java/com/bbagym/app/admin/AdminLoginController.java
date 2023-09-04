package com.bbagym.app.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bbagym.app.Result;
import com.bbagym.app.admin.dao.AdminLoginDAO;
import com.bbagym.app.adminDTO.AdminDTO;

public class AdminLoginController {
		public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException , ServerException{
			AdminLoginDAO dao  = new AdminLoginDAO();
			AdminDTO dto = new AdminDTO();
			AdminDTO result = null;

			dto.setAdminId(request.getParameter("adminId"));
			dto.setAdminPassword(request.getParameter("adminPassword"));
			
			result = dao.adminLogin(dto);
			
			System.out.println(result.getAdminNum());
			System.out.println(result.getAdminId());
			
			//회원의 번호와 이름을 세션에 저장
			HttpSession session  = request.getSession();
			session.setAttribute("adminNumber", result.getAdminNum());
			session.setAttribute("adminId", result.getAdminId());
			 
//			response.sendRedirect(request.getContextPath());
			
			return null;
		}
}
