<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>비밀번호 찾기</title>
    <link rel="stylesheet" href="../../css/form/findPw.css">
    <link rel="icon" herf="../../img/로고.png">
</head>
<body>
    <div class="container">
        <h2>
            <p>비밀번호를 잊으셨나요?</p>
            <p>이름, 아이디, 이메일을 입력해 주세요.</p>
        </h2>
        <form action="${pageContext.servletContext.contextPath}/findPwOk.us" id="findForm">
            <div class="name-container">
               <div class="id-text">회원분류 <br>
                <input type="radio" name="kind" value="common" class="kind-check" id="common" checked> 일반회원 &nbsp;
                <input type="radio" name="kind" value="registrant" class="kind-check" id="registrant"> 시설등록자 
                </div>  
                <div class="name-text">
                이름</div>
                <input type="text" placeholder="이름을 입력해 주세요." class="name" id="name" name="name">
            </div>
            <div class="id-container">
                <div class="id-text">아이디</div>
                <input type="text" placeholder="아이디를 입력해 주세요." class="id" id="id" name="id">
            </div>
            <div class="email-container">
                <div class="email-text">이메일</div>
                <input type="email" placeholder="bbagym@bbagym.co.kr" class="email" id="email" name="email">
            </div>
            <input type="submit" class="find-pw-btn" id="find-pw-btn" disabled>
        </form>
    </div>
<%@include file="../../footer.jsp" %>
    
    <script src="../../js/form/findPw.js"></script>    
</body>
</html>