package com.bbagym.app.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.user.dao.UserDAO;

public class CheckIdOkController implements Execute{

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException, ServletException {
         UserDAO userDAO = new UserDAO();
         response.setContentType("text/html; charset=utf-8");
         
         PrintWriter out =response.getWriter();
         
         boolean isTrue = userDAO.checkId(request.getParameter("id"));
         
         if(isTrue) {
            out.print("사용 가능한 아이디입니다.");
         } else {
               out.print("중복된 아이디입니다.");
            }
         
         out.close();
         
         return null;
   }

}