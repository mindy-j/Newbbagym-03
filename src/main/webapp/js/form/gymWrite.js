/**
 * 
 */
//버튼을 눌렀을 때 내용이 비어져 있을면 경고창으로 알림
var title = document.getElementById("title");
var photo = document.getElementById("photo");
var address = document.getElementById("sample6_address");
var price = document.getElementById("price");
var content = document.getElementById("content");
var notice = document.getElementById("notice");
var time = document.getElementById("time");
var button = document.getElementById("btn");
var check = document.querySelectorAll("input[type='checkbox']");
// 글을 담을 변수 선언, alert창이 나오고 작성했던 글들이 사라지지 않게 하기 위함
var saveTitle = "";
var savePhoto = "";
var savePrice = "";
var saveContent = "";
var saveNotice = "";
var saveTime = "";

title.addEventListener('input', function() {
    saveTitle = title.value;
});
photo.addEventListener('input', function() {
    savePhoto = photo.value;
})
price.addEventListener('input', function() {
    savePrice = price.value;
})
content.addEventListener('input', function() {
    saveContent = content.value;
});
notice.addEventListener('input', function() {
    saveNotice = notice.value;
})
time.addEventListener('input', function() {
    saveTime = time.value;
});




// 주소 api
function sample6_execDaumPostcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 각 주소의 노출 규칙에 따라 주소를 조합한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var addr = ''; // 주소 변수
            var extraAddr = ''; // 참고항목 변수

            //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
            if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                addr = data.roadAddress;
            } else { // 사용자가 지번 주소를 선택했을 경우(J)
                addr = data.jibunAddress;
            }

            // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
            if(data.userSelectedType === 'R'){
                // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                    extraAddr += data.bname;
                }
                // 건물명이 있고, 공동주택일 경우 추가한다.
                if(data.buildingName !== '' && data.apartment === 'Y'){
                    extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                }
                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                if(extraAddr !== ''){
                    extraAddr = ' (' + extraAddr + ')';
                }
                // 조합된 참고항목을 해당 필드에 넣는다.
                document.getElementById("sample6_extraAddress").value = extraAddr;
            
            } else {
                document.getElementById("sample6_extraAddress").value = '';
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('sample6_postcode').value = data.zonecode;
            document.getElementById("sample6_address").value = addr;
            // 커서를 상세주소 필드로 이동한다.
            document.getElementById("sample6_detailAddress").focus();
        }
    }).open();
}


//버튼을 눌렀을 때 내용이 비어져 있을면 경고창으로 알림
button.addEventListener('click',function(){

    var checkedCount = 0;//체크박스가 선택한 수를 담을 변수
    for (var i = 0; i < check.length; i++) {
        if (check[i].checked) {//체크박스에 선택을 했을 경우
            checkedCount++;//수를 증가
        }
    }

    if(saveTitle === ""){
        alert('시설명을 입력해주세요');
    }else if(savePhoto === ""){
        alert('시설 사진을 업로드해주세요')
    }else if(address.value === ""){
        alert('주소를 입력해주세요')
    }else if(savePrice === ""){
        alert('가격을 입력해주세요')
    }else if (checkedCount === 0) {
        alert("최소한 한 개 이상의 체크박스를 선택하세요.");
    }else if(saveContent === ""){
        alert('내용을 입력해주세요')
    }else if(saveNotice === ""){
        alert('공지사항을 입력해주세요')
    }else if(saveTime === ""){
        alert('운영시간을 입력해주세요')
    }else{
        //버튼을 submit 타입으로 변환
        button.type = "submit";
        // 폼을 제출
        button.closest('form').submit();
        alert('등록 되었습니다');
    }
});
