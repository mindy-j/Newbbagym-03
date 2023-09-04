package com.bbagym.app.admin.vo;

public class BoardVO {

   private String businessUserName;
   private int boardNum;
   private String boardName;
   private String boardAddress;
   
   public String getBusinessUserName() {
      return businessUserName;
   }
   public void setBusinessUserName(String businessUserName) {
      this.businessUserName = businessUserName;
   }
   public int getBoardNum() {
      return boardNum;
   }
   public void setBoardNum(int boardNum) {
      this.boardNum = boardNum;
   }
   public String getBoardName() {
      return boardName;
   }
   public void setBoardName(String boardName) {
      this.boardName = boardName;
   }
   public String getBoardAddress() {
      return boardAddress;
   }
   public void setBoardAddress(String boardAddress) {
      this.boardAddress = boardAddress;
   }
   
}