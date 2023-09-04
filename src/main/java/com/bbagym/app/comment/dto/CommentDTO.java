package com.bbagym.app.comment.dto;

import java.sql.Date;

public class CommentDTO {
	//field
	private int commentNum;
	private String commentContent;
	private Date CommentDate;
	private int  userNum;
	private int  businessUserNum;
	private int  adminNum;
	private int  boardNum;
	private String userId;
	private String businessUserId;
	
	//constructor

	public CommentDTO() {
		super();
	}
	
	//getter,setter
	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Date getCommentDate() {
		return CommentDate;
	}

	public void setCommentDate(Date commentDate) {
		CommentDate = commentDate;
	}

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public int getBusinessUserNum() {
		return businessUserNum;
	}

	public void setBusinessUserNum(int businessUserNum) {
		this.businessUserNum = businessUserNum;
	}

	public int getAdminNum() {
		return adminNum;
	}

	public void setAdminNum(int adminNum) {
		this.adminNum = adminNum;
	}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getBusinessUserId() {
		return businessUserId;
	}
	public void setBusinessUserId(String businessUserId) {
		this.businessUserId = businessUserId;
	}
	
}
