package com.bbagym.app.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.board.dao.BoardDAO;

public class SelBoardDetailOkController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      BoardDAO boardDAO = new BoardDAO();
      
      int boardNum = Integer.parseInt(request.getParameter("boardNum"));
      request.setAttribute("boardDetail", boardDAO.selBoardDetail(boardNum));
      
      System.out.println("얘 되나>?");
      return null;
   }

}