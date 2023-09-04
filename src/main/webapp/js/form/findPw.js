/**
 * 
 */var inputName = document.querySelector('#name');
var inputId = document.querySelector('#id');
var inputEmail = document.querySelector('#email');
var findPwBtn = document.querySelector('#find-pw-btn');

inputName.addEventListener('keyup', activeEvent);
inputId.addEventListener('keyup', activeEvent);
inputEmail.addEventListener('keyup', activeEvent);
// findPwBtn.addEventListener('click', errorEvent);

var pwBox = document.getElementById("pw-container");
function show() {
    pwBox.classList.remove("show");
}

function activeEvent() {
    if (inputName.value && inputId && inputEmail.value) {
        findPwBtn.disabled = false;
    } else {
        findPwBtn.disabled = true;
    }
}

var bUser = document.getElementById("registrant");
var loginForm = document.getElementById("findForm");
var user = document.getElementById("common");

bUser.addEventListener('click',function(){
   console.log('click');
   if(bUser.checked){
      loginForm.action = "/bbagym/BusinessFindPw.bu";
   }else{
      loginForm.action = "/bbagym/findPwOk.us";
   }
});

user.addEventListener('click',function(){
   if(user.checked){
      loginForm.action = "/bbagym/findPwOk.us";
   }else{
      loginForm.action = "/bbagym/BusinessFindPw.bu";
   }
});