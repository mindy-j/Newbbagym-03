<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>아이디 찾기</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/form/findId.css">
    <link rel="icon" herf="../../img/로고.png">    

</head>
<body>
    <div class="container">
        <h2>
            <p>아이디를 잊으셨나요?</p>
            <p>이름과 이메일을 입력해주세요.</p>
        </h2>
        <form action="${pageContext.servletContext.contextPath}/findIdOk.us" id="findForm">            
            <div class="name-container">
                <div class="name-text">
                <div class="id-text">회원분류 <br>
                <input type="radio" name="kind" class="kind-check" id="common" checked> 일반회원 &nbsp;
                <input type="radio" name="kind" class="kind-check" id="registrant"> 시설등록자 
                </div> <br> 
                
                이름</div>
                <input type="text" placeholder="이름을 입력해주세요." class="name" id="name" name="name">
            </div>
            <div class="email-container">
                <div class="email-text">이메일</div>
                <input type="email" placeholder="bbagym@bbagym.co.kr" class="email" id="email" name="email">
            </div>
            <input type="submit" class="find-id-btn" id="find-id-btn" disabled>
        </form>
    </div>    
    
     <%@include file="../../footer.jsp" %>
 <script src="${pageContext.servletContext.contextPath}/js/form/findId.js"></script>        
</body>
</html>