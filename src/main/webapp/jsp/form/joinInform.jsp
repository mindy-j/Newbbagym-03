<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
    <link rel="stylesheet" href="../../css/form/joinInform.css">
    <link rel="icon" herf="/img/로고.png">
</head>
<body>
    <div class="container">
        <a href="">
            <img src="../../img/로고.png" class="logo" />
        </a>
        <form action="login.html">
            <div class="inform-container">
                <div class="inform-text">아이디</div>
                <input type="text" placeholder="아이디를 입력해주세요" class="inform" id="id">
            </div>
            <div class="inform-container">
                <div class="inform-text">비밀번호</div>
                <input type="password" placeholder="비밀번호를 입력해주세요." class="inform" id="pw">
            </div>
            <div class="infrom-container">
                <div class="inform-text">비밀번호 확인</div>
                <input type="password" placeholder="다시 한번 비밀번호를 입력해 주세요." class="inform" id="pw-check">
            </div>
            <div class="inform-container">
                <div class="inform-text">이름</div>
                <input type="text" placeholder="이름을 입력해 주세요." class="inform" id="name">
            </div>
            <div class="inform-container">
                <div class="inform-text">휴대폰 번호</div>
                <input type="text" placeholder="-없이 입력해 주세요." class="inform" id="phone">
            </div>
            <div class="inform-container">
                <div class="inform-text">이메일</div>
                <input type="text" placeholder="bbagym@bbagym.co.kr" class="inform" id="email">
            </div>
            <div class="inform-container">
                <div class="inform-text">회원분류</div>
                <label for="" class="kind-label">
                    <input type="radio" name="kind" value="common" class="kind-check" id="common" onclick="show()" checked>
                    <div class="kind">일반회원</div>
                    <input type="radio" name="kind" value="registrant" class="kind-check" id="registrant" onclick="hide()">
                    <div class="kind">시설등록자</div>
                </label>
            </div>
            <div class="business-container show" id="business-container">
                <div class="inform-text">사업자 번호</div>
                <input type="text" placeholder="-없이 입력해 주세요." class="inform" id="business">
            </div>
            <input type="submit" value="가입완료" class="join-btn" id="join-btn" disabled>
        </form>
    </div>
    <script src="../../js/form/joinInform.js"></script>
<%@include file="../../footer.jsp" %>
</body>
</html>