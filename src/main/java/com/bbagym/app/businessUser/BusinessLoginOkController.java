package com.bbagym.app.businessUser;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.businessUser.dao.BusinessUserDAO;
import com.bbagym.app.dto.BusinessUserDTO;

public class BusinessLoginOkController implements Execute{

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException {
      BusinessUserDAO businessUserDAO = new BusinessUserDAO();
      BusinessUserDTO businessUserDTO = new BusinessUserDTO();
      BusinessUserDTO result = null;
      
      businessUserDTO.setBusinessUserId(request.getParameter("userId"));
      businessUserDTO.setBusinessUserPw(request.getParameter("userPw"));
      
      
      try {
                  
         result = businessUserDAO.login(businessUserDTO);
         
         if(result == null) {
               String script = "<script>alert('아이디 또는 비밀번호를 찾을 수 없습니다. 다시 시도해주세요.'); window.location.href='" + request.getContextPath() + "/jsp/form/login.jsp';</script>";
               response.getWriter().println(script);
               
         }
       //회원의 번호, 이름을 세션에 저장한다
         HttpSession session = request.getSession();
         session.setAttribute("BusinessUserNum", result.getBusinessUserNum());
         session.setAttribute("BusinessUserId", result.getBusinessUserId());
         session.setAttribute("BusinessUserPw", result.getBusinessUserPw());
         session.setAttribute("BusinessUserName", result.getBusinessUserName());
         session.setAttribute("BusinessUserPhone", result.getBusinessUserPhone());
         session.setAttribute("BusinessUserEmail", result.getBusinessUserEmail());
         
         response.sendRedirect(request.getContextPath());
                 
            
      } catch (Exception e) {
           // 예외 처리 로직 추가
           e.printStackTrace();
           // 에러 메시지를 클라이언트에 전달하는 방법 추가
           response.getWriter().println("로그인 중 오류가 발생했습니다.");
       }
      
      
      
      
      return null;
   }
   
   
}