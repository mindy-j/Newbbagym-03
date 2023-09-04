package com.bbagym.app.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.board.dao.BoardDAO;
import com.bbagym.app.board.dto.BoardDTO;

public class DelBoardDetailOkController implements Execute {

   @Override
   public Result execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      BoardDAO boardDAO = new BoardDAO();
      BoardDTO boardDTO = new BoardDTO();
      
      boardDTO.setBusinessUserNum(Integer.parseInt(request.getParameter("btn")));
      System.out.println(boardDTO);
      
      boardDAO.delBoardDetail(boardDTO);
      
//      int boardNum
//      
//      request.setAttribute("boardDetailList", boardDAO.selBoardDetail());
      request.getRequestDispatcher("/jsp/view/gymDetaile.jsp").forward(request, response);
      
      return null;
   }

}