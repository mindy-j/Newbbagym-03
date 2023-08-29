<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>이용약관</title>
    <link rel="stylesheet" href="../../css/form/joinAgree.css">
    <link rel="icon" herf="/img/로고.png">
</head>
<body>
    <div class="container">
        <h2>이용약관 동의</h2>
        <form action="joinInform.html">
            <div class="agree-container">
                <label for="" class="agree-label">
                    <div class="agree-all">
                        <input type="checkbox" id="all" value="all" class="all">
                        <h3>전체 이용약관에 동의합니다.</h3>
                    </div>
                    <div class="agree-content">
                        <div class="agree">
                            <input type="checkbox" id="agreement" value="personal" class="agreement must">
                            <span class="agree-text">개인정보 수집·이용에 동의합니다.</span>
                            <span class="agree-must">(필수)</span>
                        </div>
                        <a href="" class="a">내용보기</a>
                    </div>
                    <div class="personal-inform">
                        <p>개인정보 수집</p>
                        <p>목적: 회원권 상품 판매 및 중개 서비스의 이행 및 서비스 제공</p>
                        <p>항목: 이름, 주소, 성별, 이메일, 비밀번호, 휴대폰 번호</p>
                        <p>보유기간: 탈퇴 시 즉시 파기</p>
                    </div>
                    <div class="agree-content">
                        <div class="agree">
                            <input type="checkbox" id="agreement" value="tos" class="agreement must">
                            <span>이용약관에 동의합니다.</span>
                            <span class="agree-must">(필수)</span>
                        </div>
                        <a href="">내용보기</a>
                    </div>
                    <div class="agree-content">
                        <div class="agree">
                            <input type="checkbox" id="agreement" value="gps" class="agreement must">
                            <span>위치기반 서비스 약관에 동의합니다.</span>
                            <span class="agree-must">(필수)</span>
                        </div>
                        <a href="">내용보기</a>
                    </div>
                    <div class="agree-content">
                        <div class="agree">
                            <input type="checkbox" id="agreement" value="age" class="agreement must">
                            <span>만 14세 이상입니다.</span>
                            <span class="agree-must">(필수)</span>
                        </div>
                    </div>
                    <div class="agree-content">
                        <div class="agree">
                            <input type="checkbox" id="agree" value="" class="agreement">
                            <span>마케팅 정보 수신에 동의합니다.</span>
                        </div>
                    </div>
                </label>
            </div>
            <input type="submit" value="가입하기" class="join-btn" name="join-btn" disabled>
        </form>
    </div>
    <script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
    <script src="../../js/form/joinAgree.js"></script>
<%@include file="../../footer.jsp" %>
</body>
</html>