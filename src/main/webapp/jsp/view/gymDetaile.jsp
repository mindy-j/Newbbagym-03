<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>gymDetaile</title>
    <link rel="stylesheet" href="../../css/view/gymDetaile.css">
    <link rel="icon" href="/img/로고.png">
    <script src="https://kit.fontawesome.com/acf4f592bf.js" crossorigin="anonymous"></script>
    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=f7b0b1985a949546c083ca5f1006cb88&libraries=services,clusterer,drawing"></script>
    <!-- 카카오API 맵을 이용하기 위해 KEY를 받아서 불러옴 -->
    <script defer src="../../js/view/gymDetaile.js"></script>
</head>
<body>
    <div class="container">
        <div class="img-container"><img src="img_cuj/1.png" alt="" id="main-img"></div><!--메인 이미지를 담은 영역-->
        <div class="title-container"><!--제목 및 주소, 가격을 담을 div영역-->
            <div class="title">중화 복싱 체육관</div>
            <div class="addr-price">
                <div class="addr" id="addr">서울특별시 중랑구 동일로 811, 2층</div>
                <div class="price">67,500원/월</div>
            </div>
        </div><!--title-container 끝-->

        <hr><!--밑줄 경계선을 추가하여 구분-->

        <div class="content"><!--소개내용을 담을 div영역-->
            
<pre>왜 중화복싱체육관을 다녀야할까요?

1. "중랑구 통틀어 최고의 시설!"

2. "개개인들의 1:1 교육을 원칙으로 확실한 운동법 전수!"

3. "2층은 복싱연습장 3층은 헬스장으로 다양한 운동 가능!"

확실한 운동방법으로 다이어트를 책임져 드립니다
지금 바로 중화복싱체육관으로 빠짐하세요!</pre>            
        </div><!--content 끝-->

        <hr>

        <div class="title-container notice"><!--공지사항을 담을 div영역-->
            <div class="subTitle">공지사항</div>
            <div class="notice-content">
<pre>빠짐 페이지에서만 가능한 알림

- 3개월 선착순 10명 할인 혜택
- 6개월 선착순 10명 할인 혜택
- 12개월 선착순 10명 할인 혜택

정원 초과 시 이벤트가 종료될 수 있습니다</pre>
            </div>
        </div><!--notice 끝-->

        <hr>

        <div class="title-container time"><!--운영시간을 담을 div영역-->
            <div class="subTitle">운영시간</div>
            <div class="time-content">
<pre>[평일] 10:00 ~ 23:00
[주말] 10:00 ~ 18:00
[공휴일] 10:00 ~ 18:00</pre></div>
        </div><!--time 끝-->

        <hr>

        <div class="com-container">
            <button id="comm-btn">댓글 확인&nbsp;<i class="fa-solid fa-sort-down" style="color: #000000;" id="down"></i><i class="fa-solid fa-sort-up" style="color: #000000;" id="up"></i></button>
        </div>
        <div id="comm-none">
            <div class="comments">
                <form action="">
                    <div id="rm">                
                        <div><button id="ud-btn">수정</button></div>
                        <div><button id="rm-btn">삭제</button></div>                
                    </div>
                </form>



                <div class="view-id">
                    <div>아이디가 나오는 부분</div>
                    <div><button type="button" id="comments-btn"><i class="fa-solid fa-ellipsis-vertical" style="color: #000000;"></i></button></div>
                </div>
                <div class="view-content">내용이 나오는 부분</div>
                <div class="view-time">작성일시가 나오는 부분</div>
            </div>
            
            <div class="comments">
                <form>              
                    <div class="view-id">아이디가 나오는 부분</div>
                    <div class="com-write"><textarea name="" id="comment-write" cols="30" rows="10" placeholder="궁금하신 내용을 댓글로 달아주세요"></textarea></div>
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
            <button class="last-btn" type="submit" value="수정" id="update">수정</button>
            <button class="last-btn" type="submit" value="삭제" id="delete">삭제</button>
        </div>

    </div><!--container 끝-->
<%@include file="../../footer.jsp" %>
</body>
</html>