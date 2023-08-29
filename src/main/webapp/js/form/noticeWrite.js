/**
 * 
 */
var title = document.getElementById("title");
var content = document.getElementById("content");
var button = document.getElementById("btn");

// 글을 담을 변수 선언, alert창이 나오고 작성했던 글들이 사라지지 않게 하기 위함
var saveTitle = "";
var saveContent ="";

title.addEventListener('input', function() {
    saveTitle = title.value;
});

content.addEventListener('input', function() {
    saveContent = content.value;
});


// 버튼을 클릭했을 때 제목과 내용이 비어져 있으면 경고창으로 알림
button.addEventListener('click',function(){

    if(saveTitle === ""){
        alert('제목을 입력하세요');
    }else if(saveContent === ""){
        alert('내용을 입력하세요')
    }else{
        //버튼을 submit 타입으로 변환
        button.type = "submit";
        // 폼을 제출
        button.closest('form').submit();
        alert('등록 되었습니다');
    }
});