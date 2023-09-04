<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>유저관리</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin/adminBoard.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin/adminHeader.css"/>
<link rel="icon" href="../img/로고.png">
</head>
<body>
    <!--페이징 처리 해야하고, 한 페이지에 20명의 정보-->
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
    <div class="container">
        <div class="title-container">
            <h2>게시판 관리</h2>
        </div>
        <br>
        <div class="user-info-container">
            <table border="1">
               <tr>
                   <th class="board_number">번호</th>
                   <th class="writer_name">작성자</th>
                   <th class="board_title">시설이름</th>
                   <th class="board_address">주소</th>
                   <th class="delete">삭제</th>
                </tr>
                <c:choose>
                   <c:when test="${not empty boardList}">
                      <c:forEach var="admin" items="${boardList}" varStatus="status">
                         <tr><!-- 첫번째 줄 시작 -->
                             <td><c:out value="${status.count}"/></td>
                             <td><c:out value="${admin.getBusinessUserName()}"/></td>
                             <td>
                                <a href="">
                                   <c:out value="${admin.getBoardName()}"/>
                                </a>
                             </td>
                             <td><c:out value="${admin.getBoardAddress()}"/></td>
                             <td>
                                <form action="delBoardOk.me" onsubmit="return confirm('정말 삭제하시겠습니까?');">
                                   <button type="submit" name="btn" value="${admin.getBoardNum()}">삭제</button>
                                </form>
                             </td>   
                         </tr><!-- 첫번째 줄 끝 -->
                     </c:forEach>
               </c:when>
            </c:choose>
            </table>
        </div>
    </div>       
</body>
</html>