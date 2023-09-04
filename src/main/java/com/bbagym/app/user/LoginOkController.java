package com.bbagym.app.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.dto.UserDTO;
import com.bbagym.app.user.dao.UserDAO;

public class LoginOkController implements Execute{

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException {
      UserDAO userDAO = new UserDAO();
      UserDTO userDTO = new UserDTO();
      UserDTO result = null;
      
      userDTO.setUserId(request.getParameter("userId"));
      userDTO.setUserPw(request.getParameter("userPw"));
      
      
       try {
           result = userDAO.login(userDTO);

           if (result == null) {
               String scriptId = "<script>alert('아이디 또는 비밀번호를 찾을 수 없습니다. 다시 시도해주세요.'); window.location.href='" + request.getContextPath() + "/jsp/form/login.jsp';</script>";
               response.getWriter().println(scriptId);
           }

           // 회원 정보를 세션에 저장
           HttpSession session = request.getSession();
           session.setAttribute("userNum", result.getUserNum());
           session.setAttribute("userId", result.getUserId());
           session.setAttribute("userPw", result.getUserPw());
           session.setAttribute("userName", result.getUserName());
           session.setAttribute("userPhone", result.getUserPhone());
           session.setAttribute("userEmail", result.getUserEmail());
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