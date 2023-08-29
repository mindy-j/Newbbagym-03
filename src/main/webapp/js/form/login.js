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