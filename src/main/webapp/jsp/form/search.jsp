<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>검색창</title>
   <link rel="stylesheet" href="../../css/form/search.css"/>
   <link rel="icon" href="../img/로고.png">
</head>
<body>
    <div class="container">
        <h2 class="search-title">어떤 운동을 찾으세요?</h2>
        <br>
       <div class="search-box">
        <form action="gymList.html" class="search-form">
            <input class="search-bar" type="text"/>
        </form>
       </div>
           
        <div class="commend-search-box">
            <p class="commend-search-text"><strong>추천 검색어</strong></p>
        </div>
        <div class="commend-content-box">
            <div class="commend-content">
                헬스
            </div>
            <div class="commend-content">
                요가
            </div>
            <div class="commend-content">
                필라테스
            </div>
            <div class="commend-content">
                주짓수
            </div>
            <div class="commend-content">
                골프
            </div>
            <div class="commend-content">
                수영
            </div>
        </div>
    </div>
<%@include file="../../footer.jsp" %>
</body>
</html>