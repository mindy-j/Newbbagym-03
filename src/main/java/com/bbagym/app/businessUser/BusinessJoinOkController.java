package com.bbagym.app.businessUser;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.businessUser.dao.BusinessUserDAO;
import com.bbagym.app.dto.BusinessUserDTO;

public class BusinessJoinOkController implements Execute{
   
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException{
      BusinessUserDAO bnUserDAO = new BusinessUserDAO();
      BusinessUserDTO bnUserDTO = new BusinessUserDTO();
      Result result = new Result();
         
      bnUserDTO.setBusinessUserId(request.getParameter("userId"));
      bnUserDTO.setBusinessUserPw(request.getParameter("userPw"));
      bnUserDTO.setBusinessUserName(request.getParameter("userName"));
      bnUserDTO.setBusinessUserPhone(request.getParameter("userPhone"));
      bnUserDTO.setBusinessUserEmail(request.getParameter("userEmail"));
      bnUserDTO.setBusinessNum(request.getParameter("businessNum"));
      System.out.println(bnUserDTO);
         
        bnUserDAO.join(bnUserDTO);   
         
        result.setRedirect(true);
        result.setPath(request.getContextPath());
         
        return result;
   }
}