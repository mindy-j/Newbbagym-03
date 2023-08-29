<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>공지사항 상세페이지</title>
    <link rel="stylesheet" href="../../css/view/noticeDetail.css"/>
    <link rel="icon" href="../img/로고.png">
</head>
<body>
    <div class="container">
        <div class="title"> <!--제목이 들어가는 부분-->
            <h2>3차 코로나19 관련 홀딩 추가 공지</h2>
        </div>
       
        <div class="content-container"> <!--내용이 들어가는 부분-->
            <div class="content">
                <pre class="content-area" >
안녕하세요.
운동할 땐, 다짐부터! 다짐입니다.
                    
최근 사회적 거리두기 2.5단계 격상으로 인해 일부 제휴 시설들의 운영이  12월 28일까지 중단됩니다.
따라서 모든 통합회원권 고객님들 대상으로,요청 고객님께 한하여 추가 홀딩을 제공드립니다.
                    
[기존]
[단일회원권]
- 결제하신 운동시설에 문의
                    
[통합회원권]
- 다짐 앱 내에서 신청 (3개월 2주 / 6개월 4주 / 12개월 8주)
                    
[변경]
[단일회원권]
- 결제하신 운동시설에 문의 (대부분의 다짐제휴운동시설에서도 홀딩을 넉넉하게 적용하고 있습니다)
                    
[통합회원권]
- 기존 규정(3개월 2주 / 6개월 4주 / 12개월 8주)과 별개로 채팅상담 문의시 1회에 한하여 한달 홀딩 연장
                    
[신청방법]
[마이다짐] - [채팅상담(우측 하단의 말풍선 아이콘)] - [회원권 이용 및 출석문의] - [[코로나19] 홀딩 신청]
*채팅상담 버튼이 안보이면, 앱을 최신 버전으로 업데이트 후 이용해주세요!
                    
마음 편히 운동할 수 있는 일상을 되찾고자 회원님들과 함께 노력하는 다짐이 되겠습니다.
                    
감사합니다.
다짐 드림            
                </pre>
            </div>
        </div>
        <div class="btn-container">
            <button type="submit" value="수정" id="update" onclick="location.href='../cuj/noticeWrite.html'">수정</button>
            <button type="submit" value="삭제" id="delete" onclick="confirm('정말 삭제하시겠습니까?')">삭제</button>
        </div>
    </div>
<%@include file="../../footer.jsp" %>
</body>
</html>