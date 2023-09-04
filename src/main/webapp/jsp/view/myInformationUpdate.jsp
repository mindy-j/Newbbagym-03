<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>      
    <!--마이페이지 : "내 정보 수정" 파트입니다-->
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>내 정보</title>
    <link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/view/myInformation.css"/>
    <link rel="icon" href="${pageContext.servletContext.contextPath }/img/로고.png">
</head>
<body>
    
    <div class="container">
        <a href="#">
            <div class="profile-img-container">
                <img src="https://stone-i-dagym-centers.s3.ap-northeast-2.amazonaws.com/images/profile/icon2/11.png" class="profile-img"/>
            </div>
        </a>
       <c:choose>
         <c:when test = "${not empty sessionScope.userNum }">
              <div class="information-box">
                 <p class="information-title">기본 정보</p>           
                  <form action="${pageContext.servletContext.contextPath}/update.us" class="information-form">
                      <ul class="information-ul">
                          <li>                        
                        <label class="information-label">이름  </label>
                              <input type="text" class="information-input" value="${sessionScope.userName}" name="name"/>
                           </li>
                           <li>
                        <label class="information-label">이메일  </label>
                              <input type="text" class="information-input" value="${sessionScope.userEmail}"name="email"/>
                           </li>
                           <li>
                        <label class="information-label">아이디  </label>
                              <input type="text" class="information-input" value="${sessionScope.userId}" name="id"/>
                           </li>
                           <li>
                        <label class="information-label">비밀번호  </label>
                              <input type="text" class="information-input" value="${sessionScope.userPw}" name="pw"/>
                           </li>
                           <li>
                        <label class="information-label">사용자 구분 </label>
                           <input type="text" class="information-input" value="일반 사용자" disabled/>
                           </li>
                           <li>
                        <label class="information-label">휴대폰 번호 </label>
                              <input type="text" class="information-input" value="${sessionScope.userPhone}" name="phone"/>
                           </li>
                      </ul>
           </div>           
         <div class="btn-container">            
               <div class="unregister-box">               
                   <button class="unregister" name="upBtn">수정하기</button>               
               </div>
            </form>
            </div>                         
            </c:when>
            <c:when test = "${not empty sessionScope.BusinessUserNum }">
            <div class="information-box">
                 <p class="information-title">기본 정보</p>           
                  <form action="${pageContext.servletContext.contextPath}/buUpdate.bu" class="information-form">
                      <ul class="information-ul">
                          <li>                        
                        <label class="information-label">이름  </label>
                              <input type="text" class="information-input" value="${sessionScope.BusinessUserName}" name="name"/>
                           </li>
                           <li>
                        <label class="information-label">이메일  </label>
                              <input type="text" class="information-input" value="${sessionScope.BusinessUserEmail}"name="email"/>
                           </li>
                           <li>
                        <label class="information-label">아이디  </label>
                              <input type="text" class="information-input" value="${sessionScope.BusinessUserId}" name="id"/>
                           </li>
                           <li>
                        <label class="information-label">비밀번호  </label>
                              <input type="text" class="information-input" value="${sessionScope.BusinessUserPw}" name="pw"/>
                           </li>
                           <li>
                        <label class="information-label">사용자 구분 </label>
                           <input type="text" class="information-input" value="시설 사용자" disabled/>
                           </li>
                           <li>
                        <label class="information-label">휴대폰 번호 </label>
                              <input type="text" class="information-input" value="${sessionScope.BusinessUserPhone}" name="phone"/>
                           </li>
                      </ul>
           </div>           
         <div class="btn-container">            
               <div class="unregister-box">               
                   <button class="unregister" name="upBtn">수정하기</button>               
               </div>
            </form>
            </div>                         
            </c:when>
      </c:choose>
    </div>
<%@include file="../../footer.jsp" %>
</body>
</html>