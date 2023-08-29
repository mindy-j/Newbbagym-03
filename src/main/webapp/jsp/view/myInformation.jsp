<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--마이페이지 : "내 정보 수정" 파트입니다-->
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>내 정보</title>
    <link rel="stylesheet" href="../../css/view/myInformation.css"/>
    <link rel="icon" href="../img/로고.png">
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
                        <label class="information-label">이름  </label>
                        <input type="text" class="information-input" value="이종민"/>
                    </li>
                    <li>
                        <label class="information-label">이메일  </label>
                        <input type="text" class="information-input" value="flower@naver.com"/>
                    </li>
                    <li>
                        <label class="information-label">아이디  </label>
                        <input type="text" class="information-input" value="flower"/>
                    </li>
                   
                    <li>
                        <label class="information-label">비밀번호 </label>
                        <input type="password" class="information-input" value="123456"  disabled/>
                    </li>
                    <li>
                        <label class="information-label">사용자 구분 </label>
                        <input type="text" class="information-input" value="시설 사용자" disabled/>
                    </li>
                    <li>
                        <label class="information-label">휴대폰 번호 </label>
                        <input type="text" class="information-input" value="010-1234-1234"/>  
                    </li>
                </ul>
            </form>
        </div>

        <div class="information-box">
            <p class="information-title">상세 정보</p>
            <form action="" class="information-form">
                <ul class="information-ul">
                    <li>
                        <label class="information-label">성별  </label>
                        <input type="text" class="information-input" value="남"/>
                    </li>
                    <li>
                        <label class="information-label">나이 </label>
                        <input type="text" class="information-input" value="25"/>
                    </li>
                    <li>
                        <label class="information-label">관심지역 </label>
                        <input type="text" class="information-input" value=""/>
                    </li>
                    <li>
                        <label class="information-label">운동목적 </label>
                        <input type="text" class="information-input" value=""/>  
                    </li>
                    
                    <li>
                        <label class="information-label">관심 운동 종목  </label>
                        <input type="text" class="information-input" value=""/>
                    </li>
                </ul>
            </form>
        </div>

        
            <div class="unregister-box">
                <button class="unregister" onclick="confirm('정말 탈퇴하시겠습니까?')">
                    회원탈퇴
                </button>
            </div>
    </div>
<%@include file="../../footer.jsp" %>
</body>
</html>