package com.bbagym.app.noticeBoardDTO;

import java.sql.Date;

public class NoticeBoardDTO {
//	notice_num INT PRIMARY KEY AUTO_INCREMENT,
//    notice_title VARCHAR(255) NOT NULL UNIQUE,
//    notice_content TEXT NOT NULL,
//    notice_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
//    admin_num INT NOT NULL,
	
	private int noticeNum;
	private String noticeTitle;
	private String noticeContent;
	private Date noticeDate;
	public NoticeBoardDTO() {
		super();
	}
	
	public int getNoticeNum() {
		return noticeNum;
	}
	public void setNoticeNum(int noticeNum) {
		this.noticeNum = noticeNum;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public Date getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	
}
