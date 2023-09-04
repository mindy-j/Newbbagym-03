<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>gymDetaile</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/view/gymDetaile.css">
    <link rel="icon" href="http://localhost:8888/bbagym/img/로고.png">
    
    <!-- 카카오API 맵을 이용하기 위해 KEY를 받아서 불러옴 -->
   
</head>
<body>

    <div class="container">
        <div class="img-container"><img src="${pageContext.request.contextPath}/uploadFile/logo.png" alt="" id="main-img"></div><!--메인 이미지를 담은 영역-->
        <div class="title-container"><!--제목 및 주소, 가격을 담을 div영역-->
            <div class="title"><c:out value="${boardDetail.getBoardName()}"/></div>
            <div class="addr-price">
                <div class="addr" id="addr"><c:out value="${boardDetail.getBoardAddress()}"/></div>
                <div class="price"><c:out value="${boardDetail.getBoardPrice()}"/>원/월</div>
            </div>
        </div><!--title-container 끝-->

        <hr><!--밑줄 경계선을 추가하여 구분-->

        <div class="content"><!--소개내용을 담을 div영역-->
         <pre><c:out value="${boardDetail.getBoardContent()}"/></pre>
        </div><!--content 끝-->

        <hr>

        <div class="title-container notice"><!--공지사항을 담을 div영역-->
            <div class="subTitle">공지사항</div>
            <div class="notice-content">
            <pre><c:out value="${boardDetail.getBoardNotice()}"/></pre>
            </div>
        </div><!--notice 끝-->

        <hr>

        <div class="title-container time"><!--운영시간을 담을 div영역-->
            <div class="subTitle">운영시간</div>
            <div class="time-content">
            <pre><c:out value="${boardDetail.getBoardTime()}"/></pre></div>
           </div><!--time 끝-->

        <hr>

        <div class="com-container">
            <button id="comm-btn">댓글 확인&nbsp;<i class="fa-solid fa-sort-down" style="color: #000000;" id="down"></i><i class="fa-solid fa-sort-up" style="color: #000000;" id="up"></i></button>
        </div>
        <div id="comm-none">
           <c:choose>
           	<c:when test="${not empty commentList}">
           		<c:forEach var="comment" items="${commentList}">
           			 <div class="comments">
                <form action="">
                    <div id="rm">                
                        <div><button id="rm-btn" onclick="location.href='commentDelete.bo?commentNum=${comment.getCommentNum()}'">삭제</button></div>                
                    </div>
                </form>

                <div class="view-id">
                    <div><c:out value = "${comment.getBusinessUserId()}"/></div>
                    <div><button type="button" id="comments-btn"><i class="fa-solid fa-ellipsis-vertical" style="color: #000000;"></i></button></div>
                </div>
                <div class="view-content"><c:out value = "${comment.getCommentContent()}"/></div>
                <div class="view-time"><c:out value = "${comment.getCommentDate()}"/></div>
            </div>
           		</c:forEach>
           	</c:when>
           </c:choose>
           <div class="pagination">
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
      </div>
            
            <div class="comments">
                <form action="commentWriteOk.bo">
                	<input type="hidden" name="userNum" value=""/>             
                	<input type="hidden" name="boardNum" value="1"/>             
                	<input type="hidden" name="businessUserNum" value="1"/>             
                    <div class="view-id">아이디가 나오는 부분</div>
                    <div class="com-write"><textarea name="commentContent" id="comment-write" cols="30" rows="10" placeholder="궁금하신 내용을 댓글로 달아주세요"></textarea></div>
                    <div class="com-btn"><button id="btn">등록</button></div>
                </form>            
            </div>
        </div>
        

        <!-- <div class="title-container place">위치를 담을 div영역
            <div class="subTitle">위치</div>
            <div class="sub-place"><img src="img_cuj/2.png" alt="" id="place-img"></div>
        </div>place 끝 -->

        <hr>

        <div class="title-container place"><!--위치를 담을 div영역-->
            <div class="subTitle">위치</div>
            <div class="sub-place" id="map"></div>
        </div><!--place 끝-->



        <div class="btn-container">
         <%--   <c:if test="${sessionScope.businessUserNum == boardDetail.getBusinessUserNum()}"> --%>
              <form action="gymUpdate.bo">
              <input type="hidden" name="boardNum" value="${boardDetail.getBoardNum()}"/>
                  <button class="last-btn" type="submit" id="update">수정</button>
              </form>
              <form action="gymDelete.bo" method="post"><!-- <!--  onsubmit="return confirm('정말 삭제하시겠습니까?'); --> -->
              		<input type="hidden" name="boardNum" value="${boardDetail.getBoardNum()}"/>
                  <button class="last-btn" type="submit" id="delete">삭제</button>
              </form>
            <%-- </c:if> --%>
        </div>
    </div><!--container 끝-->
<%@include file="../../footer.jsp" %>
 <script defer src="${pageContext.request.contextPath}/js/view/gymDetaile.js"></script>
 <script src="https://kit.fontawesome.com/acf4f592bf.js" crossorigin="anonymous"></script>
 <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=f7b0b1985a949546c083ca5f1006cb88&libraries=services,clusterer,drawing"></script>
</body>
</html>