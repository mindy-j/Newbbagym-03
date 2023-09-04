package com.bbagym.app.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.admin.dao.AdminDAO;
import com.bbagym.app.admin.vo.BoardVO;

public class DelBoardOkController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      AdminDAO adminDAO = new AdminDAO();
      BoardVO boardVO = new BoardVO();
      
      boardVO.setBoardNum(Integer.parseInt(request.getParameter("btn")));
      System.out.println(boardVO);
      
      adminDAO.delBoard(boardVO);
      
      request.setAttribute("boardList", adminDAO.selBoard());
      request.getRequestDispatcher("/jsp/admin/adminBoard.jsp").forward(request, response);
      
      return null;
   }

}