<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    <link rel="stylesheet" href="../../css/form/login.css">
    <link rel="icon" href="../../img/로고.png">
</head>
<body>
    <div class="container">
        <a href="../../index.jsp">
            <img src="../../img/로고.png" class="logo">
        </a>
        
        <form action="loginOk.us" method ="post" id="loginForm">
            <div class="id-container">
                <div class="id-text">회원분류 <br>
                <input type="radio" name="kind" value="common" class="kind-check" id="common" checked> 일반회원 &nbsp;
                <input type="radio" name="kind" value="registrant" class="kind-check" id="registrant"> 시설등록자 
                </div>                   
            </div>
            <div class="id-container">
                <div class="id-text">아이디</div>
                <input type="text" placeholder="아이디를 입력해 주세요." class="id" id="id" name="userId">
            </div>
            <div class="pw-container">
                <div class="pw-text">비밀번호</div>
                <input type="password" placeholder="영문, 숫자 포함 6~20자를 입력해 주세요." class="pw" id="pw" name="userPw">
            </div>
            
            <input type="submit" value="로그인" class="login-btn" id="login-btn" disabled>
        </form>
        <div class="find-container">
            <a href="${pageContext.request.contextPath}/findId.us" class="find-id">아이디 찾기</a>
            <a href="findPw.jsp" class="find-password">비밀번호 찾기</a>
            <a href="joinAgree.jsp" class="join">회원가입</a>
        </div>
        <div class="banner-container">
            <img src="http://localhost:8888/bbagym/img/mainImg/test.png" class="banner">
        </div>
        <div class="terms-container">
            <div class="terms">
                최초 로그인 시 이용약관과 개인정보 취급방침, 위치기반서비스 이용약관에 동의하는 것으로 간주합니다.
            </div>
        </div>
    </div>

<script src="${pageContext.request.contextPath}/js/form/login.js"></script>    
<%@include file="../../footer.jsp" %>
</body>
</html>