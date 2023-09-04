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

public class FindIdOkController implements Execute{

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException, ServletException {
      
      
      UserDAO userDAO = new UserDAO();
      UserDTO userDTO = new UserDTO();
      UserDTO result = null;
      
      userDTO.setUserName(request.getParameter("name"));
      System.out.println(request.getParameter("name"));
      userDTO.setUserEmail(request.getParameter("email"));
      System.out.println(request.getParameter("email"));
      try {
         result = userDAO.findId(userDTO);
         request.setAttribute("findId", result);
         
         if(result==null) {
            String scriptId = "<script>alert('입력된 정보로 아이디를 찾을 수 없습니다. 다시 시도해주세요.'); window.location.href='" + request.getContextPath() + "/jsp/form/findId.jsp';</script>";
               response.getWriter().println(scriptId);
         }
      }catch(Exception e) {
         e.printStackTrace();
      }
      
      

      
         return null;
   }

}