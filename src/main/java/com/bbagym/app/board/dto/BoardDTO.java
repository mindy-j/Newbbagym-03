package com.bbagym.app.board.dto;

public class BoardDTO {
	
//    board_num INT PRIMARY KEY AUTO_INCREMENT,
//    board_name VARCHAR(255) NOT NULL,
//    map_number INT,
//    board_price int NOT NULL,
//    board_content TEXT NOT NULL,
//    board_notice TEXT NOT NULL,
//    board_time TIME NOT NULL,
//    board_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
//    board_category VARCHAR(255) NOT NULL,
//    admin_num INT NOT NULL,
//    business_user_num INT NOT NULL,
//    FOREIGN KEY (admin_num) REFERENCES tbl_admin(admin_num),
//    FOREIGN KEY (business_user_num) REFERENCES tbl_business_user(business_user_num)
	
	private int boardNum;
	private String boardName;
	private int mapNumber;
	private String boardPrice;
	private String boardContent;
	private String boardNotice;
	private String boardTime;
	private String boardDate;
	private String boardCategory;
	private int adminNum;
	private int businessUserNum;
	
	public BoardDTO(){;}

	public int getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardNmae(String boardName) {
		this.boardName = boardName;
	}

	public int getMapNumber() {
		return mapNumber;
	}

	public void setMapNumber(int mapNumber) {
		this.mapNumber = mapNumber;
	}

	public String getBoardPrice() {
		return boardPrice;
	}

	public void setBoardPrice(String boardPrice) {
		this.boardPrice = boardPrice;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getBoardNotice() {
		return boardNotice;
	}

	public void setBoardNotice(String boardNotice) {
		this.boardNotice = boardNotice;
	}

	public String getBoardTime() {
		return boardTime;
	}

	public void setBoardTime(String boardTime) {
		this.boardTime = boardTime;
	}

	public String getBoardDate() {
		return boardDate;
	}

	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}

	public String getBoardCategory() {
		return boardCategory;
	}

	public void setBoardCategory(String boardCategory) {
		this.boardCategory = boardCategory;
	}

	public int getAdminNum() {
		return adminNum;
	}

	public void setAdminNum(int adminNum) {
		this.adminNum = adminNum;
	}

	public int getBusinessUserNum() {
		return businessUserNum;
	}

	public void setBusinessUserNum(int businessUserNum) {
		this.businessUserNum = businessUserNum;
	}

	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", boardName=" + boardName + ", mapNumber=" + mapNumber
				+ ", boardPrice=" + boardPrice + ", boardContent=" + boardContent + ", boardNotice=" + boardNotice
				+ ", boardTime=" + boardTime + ", boardDate=" + boardDate + ", boardCategory=" + boardCategory
				+ ", adminNum=" + adminNum + ", businessUserNum=" + businessUserNum + "]";
	}
	
	
	

	
	
	

}
