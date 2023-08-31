package com.bbagym.app.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Result;





/**
 * Servlet implementation class BoardFrontController
 */
//@WebServlet("/BoardFrontController")
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		doProcess(request, response);
		
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{ 
		
	      System.out.println("Member 서블릿이 실행");
	      
	      System.out.println(request.getContextPath());
	      System.out.println(request.getRequestURI());
	      String target = request.getRequestURI().substring(request.getContextPath().length());
	      System.out.println(target);
	      
           Result result = null;
           
           switch(target) {
           case "/board/gymWrite.bo":
              System.out.println("글쓰기준비작업!");
              request.getRequestDispatcher("/jsp/form/gymWrite.jsp").forward(request, response);
              break;
              
           case "/board/gymWriteOk.bo":
             System.out.println("글쓰기 완료!!");
              result = new GymWriteOkController().execute(request, response);
              break;
              
          
        
           }  
           
	}
		
	}

