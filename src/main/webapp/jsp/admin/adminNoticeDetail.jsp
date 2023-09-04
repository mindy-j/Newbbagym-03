<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>공지사항 상세페이지</title>
    <link rel="stylesheet" href="../../css/view/noticeDetail.css"/>
    <link rel="icon" href="../img/로고.png">
</head>
<body>
       
    <div class="container">
        <div class="title"> <!--제목이 들어가는 부분-->
            <h2>${noticeBoardDetail.getNoticeTitle()}</h2>
        </div>
       
        <div class="content-container"> <!--내용이 들어가는 부분-->
            <div class="content">
                <pre class="content-area" >
			${noticeBoardDetail.getNoticeContent()}
                </pre>
            </div>
        </div>
        <div class="btn-container">
            <button type="button" value="수정" id="update" onclick="location.href='noticeBoardUpdate.me?noticeNum=${noticeBoardDetail.getNoticeNum()}'">수정</button>
            <button type="button"  id="delete" onclick="location.href='noticeBoardDelete.me?noticeNum=${noticeBoardDetail.getNoticeNum()}'">삭제</button>
            <!--  confirm('정말 삭제하시겠습니까?')-->
        </div>
    </div>
</body>
</html>