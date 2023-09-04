package com.bbagym.app.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.dto.UserDTO;
import com.bbagym.app.user.dao.UserDAO;

public class UpdateOkController implements Execute{

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException, ServletException {
      UserDAO userDAO = new UserDAO();
      UserDTO userDTO = new UserDTO();
      
      userDTO.setUserName(request.getParameter("name"));
      System.out.println(request.getParameter("name"));
      userDTO.setUserEmail(request.getParameter("email"));
      userDTO.setUserId(request.getParameter("id"));
      userDTO.setUserPw(request.getParameter("pw"));
      userDTO.setUserPhone(request.getParameter("phone"));   
      
      userDAO.update(userDTO);
      System.out.println(userDTO);
      
      
      
       HttpSession session = request.getSession();
        session.setAttribute("userNum", userDTO.getUserNum());
        session.setAttribute("userId", userDTO.getUserId());
        session.setAttribute("userPw", userDTO.getUserPw());
        session.setAttribute("userName", userDTO.getUserName());
        session.setAttribute("userPhone", userDTO.getUserPhone());
        session.setAttribute("userEmail", userDTO.getUserEmail());
      
      
      
      return null;
   }

}