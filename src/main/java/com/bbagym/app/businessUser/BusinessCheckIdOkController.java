package com.bbagym.app.businessUser;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.businessUser.dao.BusinessUserDAO;

public class BusinessCheckIdOkController implements Execute{

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException, ServletException {
         BusinessUserDAO bUserDAO = new BusinessUserDAO();
         response.setContentType("text/html; charset=utf-8");
         
         PrintWriter out =response.getWriter();
         
         boolean isTrue = bUserDAO.checkId(request.getParameter("id"));
         
         if(isTrue) {
            out.print("사용 가능한 아이디입니다.");
         } else {
            out.print("중복된 아이디입니다.");
         }
         
         out.close();
         
         return null;
   }

}