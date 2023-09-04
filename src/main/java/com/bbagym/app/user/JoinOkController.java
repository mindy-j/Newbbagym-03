package com.bbagym.app.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.dto.UserDTO;
import com.bbagym.app.user.dao.UserDAO;

public class JoinOkController implements Execute{
   
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException{
      UserDAO userDAO = new UserDAO();
      UserDTO userDTO = new UserDTO();
      Result result = new Result();
      
      
      
      
         
      userDTO.setUserId(request.getParameter("userId"));
      userDTO.setUserPw(request.getParameter("userPw"));
      userDTO.setUserName(request.getParameter("userName"));
      userDTO.setUserPhone(request.getParameter("userPhone"));
      userDTO.setUserEmail(request.getParameter("userEmail"));
        System.out.println(userDTO);
         
        userDAO.join(userDTO);     
         
        result.setRedirect(true);
        result.setPath(request.getContextPath());
         
        return result;
   }
}