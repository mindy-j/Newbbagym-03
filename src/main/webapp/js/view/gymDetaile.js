var remove = document.getElementById("delete");

remove.addEventListener("click",function(){
    confirm("정말로 삭제하겠습니까?")
})



var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = {
        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
        level: 3 // 지도의 확대 레벨
    };  

// 지도를 생성합니다    
var map = new kakao.maps.Map(mapContainer, mapOption); 

// 주소-좌표 변환 객체를 생성합니다
var geocoder = new kakao.maps.services.Geocoder();

//주소 입력란에 들어갈 div에 텍스트를 저장할 변수 선언
var addr = document.getElementById('addr').textContent;

// 주소로 좌표를 검색합니다
geocoder.addressSearch(addr, function(result, status) {

    // 정상적으로 검색이 완료됐으면 
     if (status === kakao.maps.services.Status.OK) {

        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);

        // 결과값으로 받은 위치를 마커로 표시합니다
        var marker = new kakao.maps.Marker({
            map: map,
            position: coords
        });

        // 인포윈도우로 장소에 대한 설명을 표시합니다
        var infowindow = new kakao.maps.InfoWindow({
            content: '<div style="width:150px;text-align:center;padding:2px 0;">시설 위치</div>'
        });
        infowindow.open(map, marker);

        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
        map.setCenter(coords);
    } 
});


var plus = document.getElementById("comments-btn");
var show = document.getElementById("rm")
plus.addEventListener('click',function(){
    if(show.style.display != 'flex'){
        show.style.display = 'flex';
    }else {
        show.style.display = 'none';
      }
})

var comm = document.getElementById('comm-btn');
var view = document.getElementById('comm-none');
var up = document.getElementById('up');
var down = document.getElementById('down');

comm.addEventListener('click',function(){
    if(view.style.display != 'flex'){
        view.style.display = 'flex';
        up.style.display = 'inline'
        down.style.display = 'none'
    }else{
        view.style.display = 'none';
        up.style.display = 'none'
        down.style.display = 'inline'
    }
})

var rmbtn = document.getElementById('rm-btn')
rmbtn.addEventListener('click',function(){
    confirm('정말 댓글을 삭제하시겠습니까?');
})