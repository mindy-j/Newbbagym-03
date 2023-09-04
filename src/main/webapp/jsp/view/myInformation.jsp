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
       
        <div class="information-box">
            <p class="information-title">기본 정보</p>
            <form action="" class="information-form">
                <ul class="information-ul">
                    <li>
                        <c:choose>
                     <c:when test = "${not empty sessionScope.userNum }">
                        <label class="information-label">이름  </label>
                              <input type="text" class="information-input" value="${sessionScope.userName}" disabled/>
                     </c:when>
                     <c:when test = "${not empty sessionScope.BusinessUserNum }">
                        <label class="information-label">이름  </label>
                              <input type="text" class="information-input" value="${sessionScope.BusinessUserName}" disabled/>
                     </c:when>
                     <c:otherwise>
                     </c:otherwise>   
                  </c:choose>
                    </li>
                    <li>
                       <c:choose>
                     <c:when test = "${not empty sessionScope.userNum }">
                        <label class="information-label">이메일  </label>
                              <input type="text" class="information-input" value="${sessionScope.userEmail}" disabled/>
                     </c:when>
                     <c:when test = "${not empty sessionScope.BusinessUserNum }">
                        <label class="information-label">이메일  </label>
                              <input type="text" class="information-input" value="${sessionScope.BusinessUserEmail}" disabled/>
                     </c:when>
                     <c:otherwise>
                     </c:otherwise>   
                  </c:choose>
                    </li>
                    <li>
                        <c:choose>
                     <c:when test = "${not empty sessionScope.userNum }">
                        <label class="information-label">아이디  </label>
                              <input type="text" class="information-input" value="${sessionScope.userId}" disabled/>
                     </c:when>
                     <c:when test = "${not empty sessionScope.BusinessUserNum }">
                        <label class="information-label">아이디  </label>
                              <input type="text" class="information-input" value="${sessionScope.BusinessUserId}" disabled/>
                     </c:when>
                     <c:otherwise>
                     </c:otherwise>   
                  </c:choose>
                    </li>
                   
                    <li>
                        <label class="information-label">비밀번호 </label>
                        <input type="password" class="information-input" value="123456"  disabled/>
                    </li>
                    <li>
                       <c:choose>
                     <c:when test = "${not empty sessionScope.userNum }">
                        <label class="information-label">사용자 구분 </label>
                           <input type="text" class="information-input" value="일반 사용자" disabled/>
                     </c:when>
                     <c:when test = "${not empty sessionScope.BusinessUserNum }">
                        <label class="information-label">사용자 구분 </label>
                           <input type="text" class="information-input" value="시설 사용자" disabled/>
                     </c:when>
                     <c:otherwise>
                        <label class="information-label">사용자 구분 </label>
                              <input type="text" class="information-input" value="" disabled/>
                     </c:otherwise>   
                  </c:choose>
                    </li>
                    <li>
                        <c:choose>
                     <c:when test = "${not empty sessionScope.userNum }">
                        <label class="information-label">휴대폰 번호 </label>
                              <input type="text" class="information-input" value="${sessionScope.userPhone}" disabled/>
                     </c:when>
                     <c:when test = "${not empty sessionScope.BusinessUserNum }">
                        <label class="information-label">휴대폰 번호  </label>
                              <input type="text" class="information-input" value="${sessionScope.BusinessUserPhone}" disabled/>
                     </c:when>
                  </c:choose>  
                    </li>
                </ul>
            </form>
        </div>

        
   <c:choose>
      <c:when test="${not empty sessionScope.userNum }">
         <div class="btn-container">         
            <form action="${pageContext.servletContext.contextPath}/jsp/view/myInformationUpdate.jsp">
               <div class="unregister-box">               
                   <button class="unregister" name="upBtn">
                       회원수정
                   </button>               
               </div>
            </form>
           <form action="${pageContext.servletContext.contextPath}/delete.us" onsubmit="return confirm('정말 탈퇴하시겠습니까?');">
               <div class="unregister-box">               
                   <button class="unregister" name="btn" value="${sessionScope.userId}">
                       회원탈퇴
                   </button>               
               </div>
            </form>
            </div>
         </c:when>
            <c:when test="${not empty sessionScope.BusinessUserNum }">
            <div class="btn-container">         
            <form action="${pageContext.servletContext.contextPath}/jsp/view/myInformationUpdate.jsp">
               <div class="unregister-box">               
                   <button class="unregister" name="upBtn">
                       회원수정
                   </button>               
               </div>
            </form>
            <form action="${pageContext.servletContext.contextPath}/BusinessDelete.bu" onsubmit="return confirm('정말 탈퇴하시겠습니까?');">
               <div class="unregister-box">               
                   <button class="unregister" name="btn" value="${sessionScope.BusinessUserId}">
                       회원탈퇴
                   </button>               
               </div>
            </form>
            </div>
           </c:when> 
           </c:choose>  
    </div>
<%@include file="../../footer.jsp" %>
</body>
</html>