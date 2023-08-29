/**
 * 
 */
var inputId = document.querySelector('#id');
var inputPw = document.querySelector('#pw');
var checkPw = document.querySelector('#pw-check');
var inputName = document.querySelector('#name');
var inputPhone = document.querySelector('#phone');
var inputEmail = document.querySelector('#email');
var radioCommon = document.querySelector('#common');
var radioRegist = document.querySelector('#registrant');
var inputBusiness = document.querySelector('#business');
var joinBtn = document.querySelector('#join-btn');

inputId.addEventListener('keyup', activeEvent);
inputPw.addEventListener('keyup', activeEvent);
checkPw.addEventListener('keyup', activeEvent);
inputName.addEventListener('keyup', activeEvent);
inputPhone.addEventListener('keyup', activeEvent);
inputEmail.addEventListener('keyup', activeEvent);
radioCommon.addEventListener('checked', activeEvent);
radioRegist.addEventListener('checked', activeEvent);
inputBusiness.addEventListener('keyup', activeEvent);
// findIdBtn.addEventListener('click', errorEvent);

var business = document.getElementById("business-container");
function hide(){
    business.classList.remove("show");
}
function show(){
    business.classList.add("show");
}

function activeEvent() {
    if (radioRegist.value) {
        if (inputId.value &&
            inputPw.value &&
            checkPw.value &&
            inputName.value &&
            inputPhone.value &&
            inputEmail.value &&
            joinBtn.value) {
            joinBtn.disabled = false;
        } else {
            joinBtn.disabled = true;
        }
    } else {
        if (inputId.value &&
            inputPw.value &&
            checkPw.value &&
            inputName.value &&
            inputPhone.value &&
            inputEmail.value) {
            joinBtn.disabled = false;
        } else {
            joinBtn.disabled = true;
        }
    }
}