package com.bbagym.app.businessUser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Result;
import com.bbagym.app.user.CheckIdOkController;
import com.bbagym.app.user.DeleteOkController;
import com.bbagym.app.user.FindIdOkController;
import com.bbagym.app.user.LoginOkController;
import com.bbagym.app.user.LogoutOkController;

/**
 * Servlet implementation class UserFrontController
 */
public class BusinessUserFrontController extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BusinessUserFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
//      response.getWriter().append("Served at: ").append(request.getContextPath());
         doProcess(request, response);
       response.setContentType("text/html; charset=UTF-8");
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
         case "/jsp/form/businessJoinOk.bu":
            System.out.println("시설 회원가입 성공");
            result = new BusinessJoinOkController().execute(request, response); 
            request.getRequestDispatcher("/jsp/form/login.jsp").forward(request, response);
            break;
            
         case "/jsp/form/businessLoginOk.bu":
             System.out.println("시설 로그인성공");
             result = new BusinessLoginOkController().execute(request, response);
             break;
             
         case "/BusinessDelete.bu":
            System.out.println("시설 회원탈퇴 성공");
            result = new BusinessDeleteOkController().execute(request, response);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            break;
            
         case "/BusinessFindId.bu":
            System.out.println("시설 아이디찾기");
            result = new BusinessFindIdOkController().execute(request, response);
            request.getRequestDispatcher("/jsp/form/findIdOk.jsp").forward(request, response);
            break;     
            
         case "/BusinessFindPw.bu":
            System.out.println("시설 비밀번호찾기");
            result = new BusinessFindIdOkController().execute(request, response);
            request.getRequestDispatcher("/jsp/form/findPwOk.jsp").forward(request, response);
            break;    
            
         case "/checkBusinessIdOk.bu":
            System.out.println("시설 아이디 중복");
             new BusinessCheckIdOkController().execute(request, response);
             break;
             
         case "/buUpdate.bu":
             System.out.println("시설 내정보 수정");
              new BusinessUpdateOkController().execute(request, response);
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