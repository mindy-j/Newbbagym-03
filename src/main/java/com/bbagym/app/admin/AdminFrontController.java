package com.bbagym.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Result;

/**
 * Servlet implementation class AdminFrontController
 */
//@WebServlet("/AdminFrontController")
public class AdminFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
	
	//jsp프로젝트에서는 get과 post를 구분하지 않고 사용
	   protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   request.setCharacterEncoding("UTF-8");
		   System.out.println("admin 서블릿이 실행");
	      
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
	      case "/jsp/admin/adBoard.me":
	         System.out.println("공지사항 글쓰기 성공");
	         result = new NoticeBoardController().execute(request, response);
	         System.out.println(result);
	         request.getRequestDispatcher("adminNotice.jsp").forward(request, response);
	         break;
	      case "/jsp/admin/adminLogin.me":
		         System.out.println("관리자 로그인 성공");
		         try {
		        	 new AdminLoginController().execute(request, response);
		        	 request.getRequestDispatcher("adminUser.jsp").forward(request, response);
		         }catch(NullPointerException e) {
		        	 System.out.println("등록되지 않은 아이디");
		        	 request.getRequestDispatcher("adminLogin.jsp").forward(request, response);
		        	 e.printStackTrace();
		         }
		         break;
		         
	      case "/jsp/admin/adminBoard.me":
	      		request.getRequestDispatcher("adminBoard.jsp").forward(request, response);
	      		break;
	      case "/jsp/admin/adminUser.me":
	      		request.getRequestDispatcher("adminUser.jsp").forward(request, response);
	      		break;
	      case "/jsp/admin/adminNotice.me":
	    	  	System.out.println("adminNotice.me 실행");
	    	  	new NoticeBoardListController().execute(request, response);
	    	  	request.getRequestDispatcher("adminNotice.jsp").forward(request, response);
	    	  	break;	
	      case "/jsp/admin/noticeBoardDetail.me":
	    	  	System.out.println("NoticeBoardDetail.me 실행");
	    	  	new NoticeBoardDetailController().execute(request,response);
	    	  	request.getRequestDispatcher("adminNoticeDetail.jsp").forward(request, response);
	    	  	break;
	    	  	
	      case "/jsp/admin/noticeBoardDelete.me":
	    	  System.out.println("noticeBoardDelete 실행");
	    	  new NoticeBoardDeleteController().execute(request, response);
	    	  System.out.println("삭제완료");
	    	  response.sendRedirect("/bbagym/jsp/admin/adminNotice.me");
	    	  break;
	      
	      case "/jsp/admin/noticeBoardUpdate.me":
	    	  System.out.println("noticeBoardUpdate 실행");
	    	  new NoticeBoardUpdateController().execute(request, response);
	    	  request.getRequestDispatcher("noticeUpdate.jsp").forward(request, response);
	    	  break;
	     
	      case "/jsp/admin/noticeBoardUpdateOk.me":
	    	  System.out.println("noticeBoardUpdateOk.me 실행");
	    	  new NoticeBoardUpdateOkController().execute(request, response);
	    	  response.sendRedirect("/bbagym/jsp/admin/adminNotice.me");
	    	  break;
	    	  
	      case "/jsp/admin/selUserOk.me":
	          System.out.println("selUserOk!!");
	          result = new SelUserOkController().execute(request, response);
	          break;
	       case "/jsp/admin/delUserOk.me":
	          System.out.println("delUserOk!!");
	          result = new DelUserOkController().execute(request, response);
	          break;
	       case "/jsp/admin/selBusinessUserOk.me":
	          System.out.println("selBusinessUserOk!!");
	          result = new SelBusinessUserOkController().execute(request, response);
	          break;
	       case "/jsp/admin/delBusinessUserOk.me":
	          System.out.println("delBusinessUserOk!!");
	          result = new DelBusinessUserOkController().execute(request, response);
	          break;
	       case "/jsp/admin/selBoardOk.me":
	          System.out.println("selBoardOk!!");
	          result = new SelBoardOkController().execute(request, response);
	          break;
	       case "/jsp/admin/delBoardOk.me":
	          System.out.println("delBoardOk!!");
	          result = new DelBoardOkController().execute(request, response);
	          break;	  
	      }
//	      if(result != null) {
//	    	  if(result.isRedirect()) {
//	    		  response.sendRedirect(result.getPath());
//	    		  //리다이렉션을 필요로 한다면 리다이렉션을 수행한다
//	    	  }else {
//	    		  request.getRequestDispatcher(result.getPath()).forward(request, response);
//	    		  //포워딩을 필요로 하면 result객체의 경로로 포워딩을 수행한다
//	    		  
//	    	  }
//	      }
			
			
			 
	   }
}
	   
	
	


	   
