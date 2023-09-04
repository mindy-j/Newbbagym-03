package com.bbagym.app.adminDTO;

public class AdminDTO {
	//field
	private int adminNum; //관리자번호
	private String adminId; //관리자 아이디
	private String adminPassword; //관리자 패스워드
	//constructor
	public AdminDTO() {
		super();
	}
	//getter,setter
	public int getAdminNum() {
		return adminNum;
	}
	public void setAdminNum(int adminNum) {
		this.adminNum = adminNum;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
}
