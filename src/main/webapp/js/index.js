/**
 * 
 */
let $slideBox = $('.slide-box');
let $slideImgs = $('.slide-img');

let slideWidth = 1400; 
let currentIdx = 0;
let slideCnt = $slideImgs.length;
console.log('slideCnt : ' + slideCnt);

checkEnd();

$('.next').on('click', function () {
  console.log('aaa');
  currentIdx++;
  console.log('currentIdx : ' + currentIdx);
  $slideBox.css('left', -(currentIdx * slideWidth));
  $slideBox.css('transition', '0.5s ease');
  checkEnd();
});

$('.prev').on('click', function () {
  console.log('bbb');
  currentIdx--;
  console.log('currentIdx : ' + currentIdx);
  $slideBox.css('left', -(currentIdx * slideWidth));
  $slideBox.css('transition', '0.5s ease');
  checkEnd();
});

function checkEnd() {
  if (currentIdx <= 0) {
    $('.prev').css('display', 'none');
  } else {
    $('.prev').css('display', 'block');
  }

  if (currentIdx >= slideCnt - 1) {
    $('.next').css('display', 'none');
  } else {
    $('.next').css('display', 'block');
  }
}

    document.querySelector('#img1').addEventListener('click', e=>{
        window.open('https://blog.naver.com/PostView.naver?blogId=cdwcgw1&logNo=223190223210&categoryNo=0&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=&from=menu&userTopListOpen=true&userTopListCount=5&userTopListManageOpen=false&userTopListCurrentPage=1');
    });
    document.querySelector('#img2').addEventListener('click', e=>{
        window.open('https://blog.naver.com/PostView.naver?blogId=cdwcgw1&Redirect=View&logNo=223190211330&categoryNo=1&isAfterWrite=true&isMrblogPost=false&isHappyBeanLeverage=true&contentLength=21158');
    });
    document.querySelector('#img3').addEventListener('click', e=>{
        window.open( 'https://blog.naver.com/PostView.naver?blogId=cdwcgw1&logNo=223190225561&redirect=Dlog');
    });


