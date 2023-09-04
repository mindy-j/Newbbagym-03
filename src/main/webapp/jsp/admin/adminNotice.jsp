<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../../css/admin/adminNotice.css">
    <link rel="stylesheet" href="../../css/admin/adminHeader.css"/>
    <link rel="icon" href="../img/로고.png">
    <title>공지사항 page</title>
</head>

<body>
    <div class="admin_header">
        <ul class="admin_header_ul">
            <li>
                    <div class="admin_header_category">
                        <a href="selBoardOk.me">
                            게시판관리
                        </a>
                    </div>
                
                
            </li>
            <li>
                <div class="admin_header_category">
                    <a href="adminUser.me">
                        회원관리
                    </a>
                </div>
            </li>
            <li>
                <div class="admin_header_category">
                    <a href="adminNotice.me">
                        공지사항 관리
                    </a>
                </div>
            </li>
        </ul>
    </div>
    <!--여기까지 admin_header-->
  
        <div class="title">
            <h2>공지</h2>
        </div>
        
          <div class="container">
        <c:choose>
             <c:when test = "${not empty noticeBoardList}">
              <c:forEach var="noticeBoard" items="${noticeBoardList}">
              
              	<a href="noticeBoardDetail.me?noticeNum=${noticeBoard.getNoticeNum()}">
		            <div class="div">
		                <div class="inner-div">
			                <span class="blueText">[공지]</span>
			                <c:out value = "${noticeBoard.getNoticeTitle()}"/>
		                </div>
		                <div class="date-div">
			                <span class="date">
			                <c:out value = "${noticeBoard.getNoticeDate()}"/>
		                </span>
		                </div>
		            </div>
       			 </a>
         	</c:forEach>
           </c:when>
         </c:choose>
        
        <!-- 1번째 div -->
        <div class="pagination">
        	<div><!-- 번호들을 묶어주는 박스 -->
        <ul>
          <!-- ========== 페이징 처리 예시 ============ -->
          
          <c:if test="${prev}">
          <li><a href="${pageContext.servletContext.contextPath}/jsp/admin/adminNotice.me?page=${startPage-1}" class="prev">&lt;</a></li>
          </c:if>
          <c:forEach begin="${startPage}" end="${endPage}" var="i">
          	<li>
          		<c:if test="${page == i}">
          			<a href="${pageContext.servletContext.contextPath}/jsp/admin/adminNotice.me?page=${i}" class="active">${i}</a>
          		</c:if>
          		<c:if test="${page != i}">
          			<a href="${pageContext.servletContext.contextPath}/jsp/admin/adminNotice.me?page=${i}">${i}</a>
          		</c:if>
          	</li>
          </c:forEach>
          <c:if test="${next}">
          	<li><a href="${pageContext.servletContext.contextPath}/jsp/admin/adminNotice.me?page=${endPage+1}" class="next">&gt;</a></li>
          </c:if>
          <!-- ========== /페이징 처리 예시 ============ -->
        </ul>
		</div><!-- 번호들을 묶어주는 박스 끝-->   
      </div>

        

        <!-- 하단 버튼 -->
        <!-- <form action="../cuj/noticeWrite.html"> -->
            <a href="../admin/noticeWrite.jsp">
        <div class="button-div">
            <div class="main-button">
                <button>글 작성</button>
                    </div>
                <div>
            <!-- </form> -->
        </a>
        
        

    </div> <!-- div container 닫는 태그-->
</body>
</html>