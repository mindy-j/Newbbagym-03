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