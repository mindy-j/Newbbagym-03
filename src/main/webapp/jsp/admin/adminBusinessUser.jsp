<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>유저관리</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin/adminBusinessUser.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin/adminHeader.css"/>
<link rel="icon" href="../img/로고.png">
</head>
<body>
    <div class="admin_header">
        <ul class="admin_header_ul">
            <li>
                <div class="admin_header_category">
                   <a href="selBoardOk.me">게시판관리</a>
               </div>
            </li>
            <li>
                <div class="admin_header_category">
                    <a href="selUserOk.me">회원관리</a>
                </div>
            </li>
            <li>
                <div class="admin_header_category">
                    <a href="adminNotice.jsp">공지사항 관리</a>
                </div>
            </li>
        </ul>
    </div>
    <!--여기까지 admin_header-->    
    <div class="container">
       <div class="title-container">
          <a href="selUserOk.me" style="color: gray;">일반회원관리</a>
           <span>&nbsp;/&nbsp;</span>
           <h2>시설등록자관리</h2>
        </div>
        <br>
        <div class="user-info-container">
            <table border="1">
               <tr>
                 <th>번호</th>
                  <th class="name">이름</th>
                  <th class="id">아이디</th>
                  <th class="pw">패스워드</th>
                  <th class="phone">핸드폰번호</th>
                  <th class="business">사업자번호</th>
                  <th class="delete">삭제</th>
               </tr>
                <!-- 첫번째 줄 시작 -->
               <c:choose>
                   <c:when test="${not empty businessUserList}">
                      <c:forEach var="admin" items="${businessUserList}" varStatus="status">
                         <tr>
                            <td><c:out value="${status.count}"/></td>
                            <td><c:out value="${admin.getBusinessUserName()}"/></td>
                            <td><c:out value="${admin.getBusinessUserId()}"/></td>
                            <td><c:out value="${admin.getBusinessUserPw()}"/></td>
                            <td><c:out value="${admin.getBusinessUserPhone()}"/></td>
                            <td><c:out value="${admin.getBusinessNum()}"/></td>
                            <td>
                               <form action="delBusinessUserOk.me" onsubmit="return confirm('정말 삭제하시겠습니까?');">
                                  <button type="submit" name="btn" value="${admin.getBusinessUserId()}">삭제</button>
                               </form>
                            </td>
                         </tr><!-- 첫번째 줄 끝 -->
                      </c:forEach>
                   </c:when>
               </c:choose>
            </table>
        </div>
   </div>
    <!--페이징 처리 해야하고, 한 페이지에 20명의 정보-->
</body>
</html>