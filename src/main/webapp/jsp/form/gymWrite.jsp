<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>gymWrite</title>
    <link rel="stylesheet" href="../../css/form/gymWrite.css">
    <link rel="icon" href="/img/로고.png">
    <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
    <script defer src="../../js/form/gymWrite.js"></script>
</head>
<body>
    <form><!--서버에 보내기 위해 form 태그를 사용함--> 
        <table><!--테이블 이용 10행, 2열의 표를 만듬-->
            <tr><!--tr은 하나의 행을 의미함-->
                <th colspan="2">운동시설 등록</th><!--th 제목의 셀을 의미함, colspan=2는 2칸의 셀은 가로로 병합을 의미-->
            </tr>
            <tr>
                <th>시설명</th>
                <td><input type="text" placeholder="시설명을 입력해주세요" id="title" name="title"></td><!--td는 하나의 셀을 의미-->
                <!--input text를 이용해 text를 받을 수 있고 placeholder를 이용해 작성 전 안내문구를 표시할 수 있다-->
            </tr>
            <tr>
                <th>시설사진</th>
                <td><input type="file" id="photo" name="photo" accept="image/gif, image/jpeg, image/png" /></td>
                <!--input file을 이용하여 파일을 업로드하여 사진을 불러올 수 있도록 함-->
            </tr>
            <tr>
                <th rowspan="3">주소</th>
                <!-- <td><input type="text" placeholder="주소를을 입력해주세요" id="address" name="address"></td> -->
                <!--input text를 이용해 text를 받을 수 있고 placeholder를 이용해 작성 전 안내문구를 표시할 수 있다-->
                <td>                    
                    <input type="text" id="sample6_postcode" placeholder="우편번호">
                    <input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기">
                </td>
            </tr>
            <tr>
                <td><input type="text" id="sample6_address" placeholder="주소"></td>
            </tr>
            <tr>
                <td>
                    <input type="text" id="sample6_detailAddress" placeholder="상세주소">
                    <input type="text" id="sample6_extraAddress" placeholder="참고항목">
                </td>
            </tr>
            <tr>
                <th>가격</th>
                <td><input type="text" placeholder="가격을 숫자만으로 입력해주세요. ex)5000" id="price" name="price" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');"></td>
                <!-- 정규식을 이용하여 입력받은 값을 숫자로만 입력 받는다 -->
                <!--input text를 이용해 text를 받을 수 있고 placeholder를 이용해 작성 전 안내문구를 표시할 수 있다-->
            </tr>
            <tr>
                <th>카테고리</th>
                <td>
                    <!--type checkbox를 이용하여 카테고리를 체크 분류할 수 있게 합니다-->
                    <input type="checkbox" name="category" value="헬스" checked>헬스
                    <input type="checkbox" name="category" value="요가">요가
                    <input type="checkbox" name="category" value="크로스핏">크로스핏
                    <input type="checkbox" name="category" value="복싱">복싱<br>
                    <input type="checkbox" name="category" value="필라테스">필라테스
                    <input type="checkbox" name="category" value="주짓수">주짓수
                    <input type="checkbox" name="category" value="골프">골프
                    <input type="checkbox" name="category" value="수영">수영
                </td>
            </tr>
            <tr>
                <th>내용</th>
                <!--textarea를 사용해 긴글을 작성 받게 합니다-->
                <td><textarea id="content" placeholder="내용을 입력해주세요" name="content"></textarea></td>
            </tr>
            <tr>
                <th>공지사항</th>
                <!--textarea를 사용해 긴글을 작성 받게 합니다-->
                <td><textarea id="notice" placeholder="공지사항을 입력해주세요" name="notice"></textarea></td>
            </tr>
            <tr>
                <th>운영시간</th>
                <td><textarea id="time" placeholder="운영시간을 입력해주세요" name="time"></textarea></td>
                <!--textarea를 사용해 긴글을 작성 받게 합니다-->
            </tr>
        </table>
        <div class="btn-container">
        <button type="button" value="등록" id="btn"> 등록 </button>
        <!--button을 페이지리로딩과 폼제출을 막아줌 스크립트를 이용하여 입력한 값들을 전송합니다-->
        <!-- submit을 하면 작성했던 글들이 사라지는것을 방지하기 위함 -->
        </div>
    </form>
<%@include file="../../footer.jsp" %>
</body>
</html>