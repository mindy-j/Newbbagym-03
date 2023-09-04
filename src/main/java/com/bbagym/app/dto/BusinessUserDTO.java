package com.bbagym.app.dto;

public class BusinessUserDTO {
//    business_user_num INT PRIMARY KEY AUTO_INCREMENT,
//    business_user_name VARCHAR(255) NOT NULL,
//    business_user_email VARCHAR(255) NOT NULL UNIQUE,
//    business_user_id VARCHAR(255) NOT NULL UNIQUE,
//    business_user_pw VARCHAR(255) NOT NULL,
//    business_user_phone VARCHAR(255) NOT NULL UNIQUE,
//    business_num INT not null UNIQUE,
   
   private int businessUserNum;
   private String businessUserName;
   private String businessUserEmail;
   private String businessUserId;
   private String businessUserPw;
   private String businessUserPhone;
   private String businessNum;
   private int adminNum;
   
   
   public BusinessUserDTO() {
      super();
   }


   public int getBusinessUserNum() {
      return businessUserNum;
   }


   public void setBusinessUserNum(int businessUserNum) {
      this.businessUserNum = businessUserNum;
   }


   public String getBusinessUserName() {
      return businessUserName;
   }


   public void setBusinessUserName(String businessUserName) {
      this.businessUserName = businessUserName;
   }


   public String getBusinessUserEmail() {
      return businessUserEmail;
   }


   public void setBusinessUserEmail(String businessUserEmail) {
      this.businessUserEmail = businessUserEmail;
   }


   public String getBusinessUserId() {
      return businessUserId;
   }


   public void setBusinessUserId(String businessUserId) {
      this.businessUserId = businessUserId;
   }


   public String getBusinessUserPw() {
      return businessUserPw;
   }


   public int getAdminNum() {
   return adminNum;
}


public void setAdminNum(int adminNum) {
   this.adminNum = adminNum;
}


public void setBusinessUserPw(String businessUserPw) {
      this.businessUserPw = businessUserPw;
   }


   public String getBusinessUserPhone() {
      return businessUserPhone;
   }


   public void setBusinessUserPhone(String businessUserPhone) {
      this.businessUserPhone = businessUserPhone;
   }


   public String getBusinessNum() {
      return businessNum;
   }


   public void setBusinessNum(String businessNum) {
      this.businessNum = businessNum;
   }
   
   
   
}