package com.bbagym.app.businessUser;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.businessUser.dao.BusinessUserDAO;
import com.bbagym.app.dto.BusinessUserDTO;

public class BusinessFindPwOkController implements Execute{

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException, ServletException {
      
      
      BusinessUserDAO userDAO = new BusinessUserDAO();
      BusinessUserDTO userDTO = new BusinessUserDTO();
      BusinessUserDTO result = null;
      
      userDTO.setBusinessUserName(request.getParameter("name"));
      System.out.println(request.getParameter("name"));
      userDTO.setBusinessUserEmail(request.getParameter("email"));
      System.out.println(request.getParameter("email"));
      userDTO.setBusinessUserEmail(request.getParameter("id"));
      System.out.println(request.getParameter("id"));
      
      result = userDAO.findId(userDTO);
      request.setAttribute("buFindid", result);
      
      
      return null;
   }

}