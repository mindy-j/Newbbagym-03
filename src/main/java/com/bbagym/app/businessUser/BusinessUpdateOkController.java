package com.bbagym.app.businessUser;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.businessUser.dao.BusinessUserDAO;
import com.bbagym.app.dto.BusinessUserDTO;

public class BusinessUpdateOkController implements Execute{
   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException, ServletException {
      BusinessUserDAO userDAO = new BusinessUserDAO();
      BusinessUserDTO userDTO = new BusinessUserDTO();
      
      userDTO.setBusinessUserName(request.getParameter("name"));
      System.out.println(request.getParameter("name"));
      userDTO.setBusinessUserEmail(request.getParameter("email"));
      userDTO.setBusinessUserId(request.getParameter("id"));
      userDTO.setBusinessUserPw(request.getParameter("pw"));
      userDTO.setBusinessUserPhone(request.getParameter("phone"));   
      
      userDAO.buUpdate(userDTO);
      System.out.println(userDTO);
      
      
      
       HttpSession session = request.getSession();
        session.setAttribute("userNum", userDTO.getBusinessUserNum());
        session.setAttribute("userId", userDTO.getBusinessUserId());
        session.setAttribute("userPw", userDTO.getBusinessUserPw());
        session.setAttribute("userName", userDTO.getBusinessUserName());
        session.setAttribute("userPhone", userDTO.getBusinessUserPhone());
        session.setAttribute("userEmail", userDTO.getBusinessUserEmail());
      
      
      
      return null;
   }
}