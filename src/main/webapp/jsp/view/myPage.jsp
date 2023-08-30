<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>마이페이지</title>
    <link rel="stylesheet" href="../../css/view/myPage.css">
    <link rel="icon" herf="../../img/로고.png">
</head>
<body>
    <div class="container">
        <div class="profil-container">
            <a href="myInformation.jsp" class="a-tag">
                <img src="" alt="" class="profil">
            </a>
            <a href="myInformation.jsp" class="a-tag">
                <h3>살빼조</h3>
            </a>
            <a href="myInformation.jsp" class="a-tag">
                bbagym@bbagym.co.kr
            </a>
        </div>
        <div class="logout-container">
            <a href="" class="a-tag">
                로그아웃
            </a>
        </div>
    </div>
    <div class="container">
        <div class="menu-container">
            <a href="announcement.jsp" class="a-tag">공지/이벤트</a>
        </div>
        <div class="menu-container">
            <a href="faq.jsp" class="a-tag">FAQ</a>
        </div>
        <div class="menu-container">
            <a href="../form/gymWrite.jsp"  class="a-tag">시설등록</a>
        </div>
        <!-- <div class="menu-container">
            <a href="">설정</a>
        </div> -->
        <a href="" class="a-tag">
            <img src="" alt="" class="ad">
        </a>
    </div>
    <script src="../../js/myPage.js"></script>
<%@include file="../../footer.jsp" %>
</body>
</html>