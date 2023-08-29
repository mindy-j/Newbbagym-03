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