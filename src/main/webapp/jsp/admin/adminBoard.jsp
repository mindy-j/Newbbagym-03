<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>유저관리</title>
 <link rel="stylesheet" href="css/admin_board.css"/>
 <link rel="stylesheet" href="css/admin_header.css"/>
 <link rel="icon" href="../img/로고.png">

</head>
<body>
    <!--페이징 처리 해야하고, 한 페이지에 20명의 정보-->
    <div class="admin_header">
        <ul class="admin_header_ul">
            <li>
                    <div class="admin_header_category">
                        <a href="admin_board.html">
                            게시판관리
                        </a>
                    </div>
                
                
            </li>
            <li>
                <div class="admin_header_category">
                    <a href="admin_user.html">
                        회원관리
                    </a>
                </div>
            </li>
            <li>
                <div class="admin_header_category">
                    <a href="admin_notice.html">
                        공지사항 관리
                    </a>
                </div>
            </li>
        </ul>
    </div>
    <div class="container">
        
        <div class="title-container">
            <h2>게시판 관리</h2>
        </div>
        
       
        
        <br>
        <div class="user-info-container">
            <table border="1">
                <th class="board_number">번호</th>
                <th class="writer_name">작성자</th>
                <th class="board_title">시설이름</th>
                <th class="board_content">내용</th>
                <th colspan="1">삭제</th>
                
                <tr><!-- 첫번째 줄 시작 -->
                    <td>1</td>
                    <td>이종민</td>
                    <td>중화 복싱 체육관</td>
                    <td><a href="../cuj/gymDetaile.html">왜 중화복싱체육관을 다녀야할까요?</a>
                        </td>
                    <td><button onclick="confirm('정말 삭제하시겠습니까?')">삭제</button></td>   
                </tr><!-- 첫번째 줄 끝 -->
             
                
                
            </table>
        </div>
    </div>       
</body>
</html>