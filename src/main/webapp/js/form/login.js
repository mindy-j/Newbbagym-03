/**
 * 
 */
var inputId = document.querySelector('#id');
var inputPw = document.querySelector('#pw');
var loginBtn = document.querySelector('#login-btn');

inputId.addEventListener('keyup', activeEvent);
inputPw.addEventListener('keyup', activeEvent);
// loginBtn.addEventListener('click', errorEvent);

function activeEvent() {
    if (inputId.value && inputPw.value) {
        loginBtn.disabled = false;
    } else {
        loginBtn.disabled = true;
    }
}



var bUser = document.getElementById("registrant");
var loginForm = document.getElementById("loginForm");
var user = document.getElementById("common");

bUser.addEventListener('click',function(){
   console.log('click');
   if(bUser.checked){
      loginForm.action = "businessLoginOk.bu";
   }else{
      loginForm.action = "loginOk.us";
   }
});

user.addEventListener('click',function(){
   if(user.checked){
      loginForm.action = "loginOk.us";
   }else{
      loginForm.action = "businessLoginOk.bu";
   }
});


