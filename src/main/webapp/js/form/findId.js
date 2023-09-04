/**
 * 
 */var inputName = document.querySelector('#name');
var inputEmail = document.querySelector('#email');
var findIdBtn = document.querySelector('#find-id-btn');

inputName.addEventListener('keyup', activeEvent);
inputEmail.addEventListener('keyup', activeEvent);
// findIdBtn.addEventListener('click', errorEvent);

var idBox = document.getElementById("id-container");
function show() {
    idBox.classList.remove("show");
}

function activeEvent() {
    if (inputName.value && inputEmail.value) {
        findIdBtn.disabled = false;
    } else {
        findIdBtn.disabled = true;
    }
}


var bUser = document.getElementById("registrant");
var loginForm = document.getElementById("findForm");
var user = document.getElementById("common");

bUser.addEventListener('click',function(){
   console.log('click');
   if(bUser.checked){
      loginForm.action = "/bbagym/BusinessFindId.bu";
   }else{
      loginForm.action = "/bbagym/findIdOk.us";
   }
});

user.addEventListener('click',function(){
   if(user.checked){
      loginForm.action = "/bbagym/findIdOk.us";
   }else{
      loginForm.action = "/bbagym/BusinessFindId.bu";
   }
});