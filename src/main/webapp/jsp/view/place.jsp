<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=f7b0b1985a949546c083ca5f1006cb88&libraries=services,clusterer,drawing"></script>
    <!-- 카카오API 맵을 이용하기 위해 KEY를 받아서 불러옴 -->
    <script src="https://kit.fontawesome.com/acf4f592bf.js" crossorigin="anonymous"></script>
    <script defer src="../../js/view/place.js"></script>
    <link rel="stylesheet" href="../../css/view/place.css">    
    <link rel="icon" href="/img/로고.png">
    <title>place</title>
</head>
<body>
    <div class="container">
        <div class="addr-container">
            <!-- <div class="addr">&nbsp;서울특별시 노원구 상계동</div> -->
            <div class="addr" id="addr"></div>
            <div class="input-container">
                <form onsubmit="searchPlaces(); return false;">
                    <div class="input-border">
                        <input type="text" value="노원역 헬스장" id="keyword"> <div id="btn-span">&nbsp;<button><i class="fa-solid fa-magnifying-glass fa-lg" style="color: #ffffff;">&nbsp;</i></button></div>
                    </div>
                    <!-- <div class="btn"> 
                        <button type="submit">검색</button>
                    </div>                     -->
                </form>
            </div>
        </div>    

        <div class="map_wrap">
            <div id="map" style="width:100%;height:100%;position:relative;overflow:hidden;"></div>
        
            <div id="menu_wrap" class="bg_white">
                <div class="option">
                    
                </div>
                <hr>
                <ul id="placesList"></ul>
                <div id="pagination"></div>
            </div>
        </div>

    </div>
<%@include file="../../footer.jsp" %>
</body>
</html>