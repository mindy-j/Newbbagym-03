/**
 * 
 */
var $all = $(".all");
var $inputs = $(".agreement");
var $must = $(".must");
var $btn = $(".join-btn");

$all.on('click', function(){
    if($(this).is(":checked")){
        $inputs.prop('checked', true);
        $btn.prop('disabled', false);
    }else{
        $inputs.prop('checked', false);
        $btn.prop('disabled', true);
    }
});

$inputs.on('click', function(){
    if(!$(this).is(":checked")){
        $all.prop('checked', false);
    }
    if($must.filter(":checked").length == 4){
        $btn.prop('disabled', false);
    }else{
        $btn.prop('disabled', true);
    }
    if($inputs.filter(":checked").length == 5){
        $all.prop('checked', true);
        $btn.prop('disabled', false);
    }
});