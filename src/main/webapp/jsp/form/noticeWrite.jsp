<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>noticeWrite</title>
    <link rel="stylesheet" href="../../css/form/noticeWrite.css">    
    <link rel="icon" href="/img/로고.png">
    <script defer src="../../js/form/noticeWrite.js"></script>
</head>
<body>
    <form><!--서버에 보내기 위해 form 태그를 사용함--> 
        <table><!--테이블 이용 10행, 2열의 표를 만듬-->
            <tr><!--tr은 하나의 행을 의미함-->
                <th colspan="2">공지사항 등록</th><!--th 제목의 셀을 의미함, colspan=2는 2칸의 셀은 가로로 병합을 의미-->
            </tr>
            <tr>
                <th>제목</th>
                <td><input type="text" placeholder="제목을 입력해주세요" id="title"></td><!--td는 하나의 셀을 의미-->
                <!--input text를 이용해 text를 받을 수 있고 placeholder를 이용해 작성 전 안내문구를 표시할 수 있다-->
            </tr>

            <tr>
                <th>내용</th>
                <!--textarea를 사용해 긴글을 작성 받게 합니다-->
                <td><textarea id="content" placeholder="내용을 입력해주세요"></textarea></td>
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