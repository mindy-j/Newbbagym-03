package com.bbagym.app.board.controller;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Excute;
import com.bbagym.app.Result;
import com.bbagym.app.board.dao.BoardDAO;
import com.bbagym.app.board.dto.BoardDTO;

public class GymWriteOkController implements Excute{
	
	
	public Result execute(HttpServletRequest request, HttpServletResponse respose) throws IOException, ServerException{
		BoardDAO boardDAO = new BoardDAO();
        BoardDTO boardDTO = new BoardDTO();
        Result result = new Result();
        
        boardDTO.setBoardNum(Integer.valueOf(request.getParameter("boardNum")));
        boardDTO.setBoardNmae(request.getParameter("memberBoardNmae"));
        boardDTO.setMapNumber(Integer.valueOf(request.getParameter("MapNumber")));
        boardDTO.setBoardPrice(request.getParameter("boardPrice"));
        boardDTO.setBoardContent(request.getParameter("boardContent"));
     
        boardDTO.setBoardNotice(request.getParameter("boardNotice"));
        boardDTO.setBoardTime(request.getParameter("boardTime"));
        boardDTO.setBoardDate(request.getParameter("boardDate"));
        boardDTO.setAdminNum(Integer.valueOf(request.getParameter("adminNum")));
        boardDTO.setBusinessUserNum(Integer.valueOf(request.getParameter("businessUserNum")));
        
 
        System.out.println(boardDTO);
        boardDAO.gymWrite(boardDTO);
        
        result.setRedirect(true);
        result.setPath(request.getContextPath());
        
        return result;
  
 
	}
	
	

}
