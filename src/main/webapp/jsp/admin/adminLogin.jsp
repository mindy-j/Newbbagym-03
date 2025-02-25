<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
    <link rel="stylesheet" href="../../css/admin/adminLogin.css">
    <link rel="icon" herf="../img/로고.png">
</head>
<body>
    <div class="container">
        <a href="/main/main.html">
            <img src="../../img/로고.png" class="logo">
        </a>
        <h2 class="admin_login_title">관리자 로그인</h2>
        <hr>
        <form action="myPage.html">
            <div class="id-container">
                <div class="id-text">아이디</div>
                <input type="text" placeholder="아이디를 입력해 주세요." class="id" id="id">
            </div>
            <div class="pw-container">
                <div class="pw-text">비밀번호</div>
                <input type="password" placeholder="영문, 숫자 포함 6~20자를 입력해 주세요." class="pw" id="pw">
            </div>
            <input type="submit" value="로그인" class="login-btn" id="login-btn" disabled>
        </form>
        
       
        <div class="terms-container">
            <div class="terms">
                최초 로그인 시 이용약관과 개인정보 취급방침, 위치기반서비스 이용약관에 동의하는 것으로 간주합니다.
            </div>
        </div>
    </div>
    <script src="login.js"></script>
</body>
</html>