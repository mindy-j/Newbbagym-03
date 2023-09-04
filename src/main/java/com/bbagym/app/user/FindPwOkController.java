package com.bbagym.app.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.dto.UserDTO;
import com.bbagym.app.user.dao.UserDAO;

public class FindPwOkController implements Execute{

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException, ServletException {
      
      
      UserDAO userDAO = new UserDAO();
      UserDTO userDTO = new UserDTO();
      UserDTO result = null;
      
      userDTO.setUserName(request.getParameter("name"));
      System.out.println(request.getParameter("name"));
      userDTO.setUserEmail(request.getParameter("email"));
      System.out.println(request.getParameter("email"));
      userDTO.setUserId(request.getParameter("id"));
      System.out.println(request.getParameter("email"));
      
      result = userDAO.findId(userDTO);      
      request.setAttribute("findId", result);
      System.out.println(result.getUserId());
      
      
      return null;
   }

}