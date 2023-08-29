<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>마이페이지</title>
    <link rel="stylesheet" href="../../css/view/myPage.css">
    <link rel="icon" herf="/img/로고.png">
</head>
<body>
    <div class="container">
        <div class="profil-container">
            <a href="/ljm/myInformation.html">
                <img src="" alt="" class="profil">
            </a>
            <a href="/ljm/myInformation.html">
                <h3>살빼조</h3>
            </a>
            <a href="/ljm/myInformation.html">
                bbagym@bbagym.co.kr
            </a>
        </div>
        <div class="logout-container">
            <a href="login.html">
                로그아웃
            </a>
        </div>
    </div>
    <div class="container">
        <div class="menu-container">
            <a href="/nyc/announcement .html">공지/이벤트</a>
        </div>
        <div class="menu-container">
            <a href="/nyc/FAQ.html">FAQ</a>
        </div>
        <div class="menu-container">
            <a href="/cuj/gymWrite.html">시설등록</a>
        </div>
        <!-- <div class="menu-container">
            <a href="">설정</a>
        </div> -->
        <a href="">
            <img src="" alt="" class="ad">
        </a>
        <script src="myPage.js"></script>
    </div>
    <script src="../js/myPage.js"></script>
<%@include file="../../footer.jsp" %>
</body>
</html>