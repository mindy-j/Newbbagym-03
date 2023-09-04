package com.bbagym.app.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.admin.dao.AdminDAO;
import com.bbagym.app.dto.UserDTO;

public class DelUserOkController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException, ServletException {
      AdminDAO adminDAO = new AdminDAO();
      UserDTO userDTO = new UserDTO();
      
      userDTO.setUserId(request.getParameter("btn"));
      System.out.println(userDTO);
      
      adminDAO.delUser(userDTO);
      
      request.setAttribute("userList", adminDAO.selUser());
      request.getRequestDispatcher("/jsp/admin/adminUser.jsp").forward(request, response);
      
      return null;
   }

}