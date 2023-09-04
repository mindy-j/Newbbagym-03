<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>마이페이지</title>
    <link rel="stylesheet" href="../../css/view/myPage.css">
    <link rel="icon" href="../../img/로고.png">
</head>
<body>
    <div class="container">
        <div class="profil-container">
            <a href="myInformation.jsp" class="a-tag">
                <img src="https://stone-i-dagym-centers.s3.ap-northeast-2.amazonaws.com/images/profile/icon2/11.png" alt="" class="profil">
            </a>
            
               <c:choose>
               <c:when test = "${not empty sessionScope.userNum}">
                        <h3>${sessionScope.userName}</h3>
                            ${sessionScope.userEmail}
                     </c:when>
                     <c:when test = "${not empty sessionScope.BusinessUserNum}">
                        <h3>${sessionScope.BusinessUserName}</h3>
                            ${sessionScope.BusinessUserEmail}
                     </c:when>
            </c:choose> 
        </div>
        <div class="logout-container">
           <form action="${pageContext.request.contextPath}/logoutOk.us">
               <button class="a-tag">로그아웃</button>
            </form>
        </div>
    </div>
    <div class="container">
        <div class="menu-container">
            <a href="announcement.jsp" class="a-tag">공지/이벤트</a>
        </div>
        <div class="menu-container">
            <a href="faq.jsp" class="a-tag">FAQ</a>
        </div>
        
             <c:choose>
           <c:when test="${not empty sessionScope.BusinessUserNum }">
              <div class="menu-container">
                  <a href="../form/gymWrite.jsp" class="a-tag">시설등록</a>
              </div>
           </c:when>
        </c:choose>
        
        <!-- <div class="menu-container">
            <a href="">설정</a>
        </div> -->
        <a href="" class="a-tag">
            <img src="" alt="" class="ad"> <!-- 광고배너 이미지 아무거나 갖다 붙히기 -->
        </a>
    </div>
    <script src="../../js/myPage.js"></script>
<%@include file="../../footer.jsp" %>
</body>
</html>