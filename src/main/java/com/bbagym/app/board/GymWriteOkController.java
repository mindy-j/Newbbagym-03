package com.bbagym.app.board;

import java.io.File;
import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bbagym.app.Execute;
import com.bbagym.app.Result;
import com.bbagym.app.board.dao.BoardDAO;
import com.bbagym.app.board.dto.BoardDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class GymWriteOkController implements Execute{
   
   String realPath;
   
   public GymWriteOkController(String context) {
      this.realPath = context;
      
   }
   
public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException{
      request.setCharacterEncoding("UTF-8");
      BoardDAO boardDAO = new BoardDAO();
        BoardDTO boardDTO = new BoardDTO();
        Result result = new Result();
        
        System.out.println("Setting Upload path to realPath : "+realPath);
        
        System.out.println("GymWrite Call!!");
        MultipartRequest mr = new MultipartRequest(request, realPath, 1024*1024*10, "UTF-8", new DefaultFileRenamePolicy());
        
        File image = mr.getFile("photoName"); 
        
        System.out.println(mr.getParameter("title"));
        System.out.println(image);
        

        boardDTO.setBoardName(mr.getParameter("title"));
        boardDTO.setImageName(mr.getFile("photoName").toString().substring(50));
        System.out.println(mr.getFile("photoName").toString().substring(50));
        boardDTO.setBoardAddress(mr.getParameter("address"));
       
        
        boardDTO.setBoardPrice(Integer.valueOf(mr.getParameter("price")));
        boardDTO.setBoardCategory(mr.getParameter("category"));
        boardDTO.setBoardContent(mr.getParameter("content"));
     
        boardDTO.setBoardNotice(mr.getParameter("notice"));
        boardDTO.setBoardTime(mr.getParameter("time"));
        boardDTO.setBoardDate(mr.getParameter("Date"));

        boardDTO.setAdminNum();
        boardDTO.setBusinessUserNum(2);
        System.out.println("GymWrite : "+boardDTO.toString());
        
        boardDAO.gymWrite(boardDTO);

        result.setRedirect(true);
        result.setPath("/view/gymList.bo");
    
        return result;
  
   }
}