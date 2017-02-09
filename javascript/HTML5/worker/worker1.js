/*
for(var i = 0 ; i < 1000000; i++){
	console.log(i);
	postMessage(i);
};*/
var num = 100;

addEventListener("message", updateNumber);
function updateNumber(evt){
	num = evt.data;
}
setInterval(function(){
	postMessage(Math.round(Math.random()*num))
},100);