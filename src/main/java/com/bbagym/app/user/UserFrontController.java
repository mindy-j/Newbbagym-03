package com.bbagym.app.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Result;

/**
 * Servlet implementation class UserFrontController
 */
public class UserFrontController extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
//      response.getWriter().append("Served at: ").append(request.getContextPath());
       request.setCharacterEncoding("utf-8");
       response.setContentType("text/html; charset=UTF-8");
      doProcess(request, response);
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      //post방식으로 보내게 되면 request 객체에 저장된 한글이 깨지므로 utf-8 추가해야한다
       request.setCharacterEncoding("utf-8");
       response.setContentType("text/html; charset=UTF-8");
      doProcess(request, response);
   }
   
      //jsp프로젝트에서는 get과 post를 구분하지 않고 사용
      protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         System.out.println("User 서블릿이 실행");
         
         //request.getContextPath()는 URL루트 경로를 의미한다
         System.out.println(request.getContextPath());
         
         //request.getRequestURI는 현재 요청의 URI를 보여준다      
         System.out.println(request.getRequestURI());
         
         //전체 URI에서 ContextPath를 제외시킨 부분이 필요하다
         String target = request.getRequestURI().substring(request.getContextPath().length());
         System.out.println(target);
         Result result = null;
         
         //단순한 값비교는 if문보다 switch문이 효율성이 좋고 가독성도 좋다
         //break문을 꼭 써야된다!
         switch(target) {
         case "/jsp/form/joinOk.us":
            System.out.println("회원가입 성공");
            result = new JoinOkController().execute(request, response); 
            request.getRequestDispatcher("/jsp/form/login.jsp").forward(request, response);
            break;
            
         case "/jsp/form/loginOk.us":
             System.out.println("로그인성공");
             result = new LoginOkController().execute(request, response);
             break;
          
         case "/logoutOk.us":
            System.out.println("로그아웃 성공");
            result = new LogoutOkController().execute(request, response);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            break;
            
         case "/delete.us":
            System.out.println("회원탈퇴 성공");
            result = new DeleteOkController().execute(request, response);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            break;
            
         case "/findId.us":
            System.out.println("아이디찾기 경로");
            request.getRequestDispatcher("/jsp/form/findId.jsp").forward(request, response);
            break;   
            
         case "/findIdOk.us":
            System.out.println("아이디찾기");
            result = new FindIdOkController().execute(request, response);
            request.getRequestDispatcher("/jsp/form/findIdOk.jsp").forward(request, response);
            break;
            
         case "/findPw.us":
            System.out.println("비밀번호찾기 경로");
            request.getRequestDispatcher("/jsp/form/findId.jsp").forward(request, response);
            break; 
            
         case "/findPwOk.us":
            System.out.println("비밀번호찾기");
            result = new FindIdOkController().execute(request, response);
            request.getRequestDispatcher("/jsp/form/findPwOk.jsp").forward(request, response);
            break;  
            
         case "/checkIdOk.us":
            System.out.println("아이디 중복검사");
             new CheckIdOkController().execute(request, response);
             break;
         case "/update.us":
             System.out.println("내정보 수정");
              new UpdateOkController().execute(request, response);
             request.getRequestDispatcher("/jsp/view/myInformation.jsp").forward(request, response);
              break;
             
         }
         
         
         
         if(result != null) {
            if(result.isRedirect()) {
               response.sendRedirect(result.getPath());
               //리다이렉션을 필요로 한다면 result객체의 경로로 리다이렉션을 수행한다
            }else {
               request.getRequestDispatcher(result.getPath()).forward(request, response);
             //포워딩을 필요로 하면 result객체의 경로로 포워딩을 수행한다
            }
         }
         
      }

}