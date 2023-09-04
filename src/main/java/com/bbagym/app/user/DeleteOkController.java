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

public class DeleteOkController implements Execute{

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response)   throws IOException, ServerException, ServletException {
      UserDTO userDTO = new UserDTO();
      UserDAO userDAO = new UserDAO();
      
      System.out.println("delete : " +  request.getParameter("btn"));
      
      userDTO.setUserId(request.getParameter("btn"));
      userDAO.delete(userDTO);
      
      HttpSession session = request.getSession();
      session.invalidate();
      System.out.println("실행");
      
      try {
         request.getRequestDispatcher("/").forward(request, response);
      } catch (ServletException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      return null;
   }

}