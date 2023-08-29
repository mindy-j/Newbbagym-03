<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>아이디 찾기</title>
    <link rel="stylesheet" href="../../css/form/findId.css">
    <link rel="icon" herf="/img/로고.png">    
    <script src="../../js/form/form/findId.js"></script>
</head>
<body>
    <div class="container">
        <h2>
            <p>아이디를 잊으셨나요?</p>
            <p>이름과 이메일을 입력해주세요.</p>
        </h2>
        <form action="login.html">
            <div class="name-container">
                <div class="name-text">이름</div>
                <input type="text" placeholder="이름을 입력해주세요." class="name" id="name">
            </div>
            <div class="email-container">
                <div class="email-text">이메일</div>
                <input type="email" placeholder="bbagym@bbagym.co.kr" class="email" id="email">
            </div>
            <div class="id-container show" id="id-container">
                <h3>bbagym1234</h3>
            </div>
            <input type="submit" value="아이디 찾기" class="find-id-btn" id="find-id-btn" onclick="show()" disabled>
        </form>
    </div>
     <%@include file="../../footer.jsp" %>    
</body>
</html>