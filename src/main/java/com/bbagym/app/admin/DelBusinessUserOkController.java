package com.bbagym.app.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.admin.dao.AdminDAO;
import com.bbagym.app.dto.BusinessUserDTO;

public class DelBusinessUserOkController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException, ServletException {
      AdminDAO adminDAO = new AdminDAO();
      BusinessUserDTO businessUserDTO = new BusinessUserDTO();
      
      businessUserDTO.setBusinessUserId(request.getParameter("btn"));
      System.out.println(businessUserDTO);
      
      adminDAO.delBusinessUser(businessUserDTO);
      
      request.setAttribute("businessUserList", adminDAO.selBusinessUser());
      request.getRequestDispatcher("/jsp/admin/adminBusinessUser.jsp").forward(request, response);

      return null;
   }

}