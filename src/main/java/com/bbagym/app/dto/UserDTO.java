package com.bbagym.app.dto;

public class UserDTO {
//    user_num INT PRIMARY KEY AUTO_INCREMENT,
//    user_name VARCHAR(255) NOT NULL,
//    user_email VARCHAR(255) NOT NULL UNIQUE,
//    user_id VARCHAR(255) NOT NULL UNIQUE,
//    user_pw VARCHAR(255) NOT NULL,
//    user_phone VARCHAR(255) NOT NULL UNIQUE,
//    admin_num INT NOT NULL,
//    FOREIGN KEY (admin_num) REFERENCES tbl_admin(admin_num)
   
   
   private int userNum;
   private String userName;
   private String userEmail;
   private String userId;
   private String userPw;
   private String userPhone;
   private int admin_num;
   
   public int getAdmin_num() {
      return admin_num;
   }

   public void setAdmin_num(int admin_num) {
      this.admin_num = admin_num;
   }

   public UserDTO(){;}

   public int getUserNum() {
      return userNum;
   }

   public void setUserNum(int userNum) {
      this.userNum = userNum;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getUserEmail() {
      return userEmail;
   }

   public void setUserEmail(String userEmail) {
      this.userEmail = userEmail;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserPw() {
      return userPw;
   }

   public void setUserPw(String userPw) {
      this.userPw = userPw;
   }

   public String getUserPhone() {
      return userPhone;
   }

   public void setUserPhone(String userPhone) {
      this.userPhone = userPhone;
   }
   
   
   

}