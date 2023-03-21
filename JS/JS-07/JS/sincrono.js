//Javascript sincrono
alert("cohorte 23");
console.log("Hola, buen día");
alert("Día del gatito");
console.log("adios");

setTimeout(
function(){
    console.log("Hola mundo, con retaso");
}, 0
)
console.log("sorpresa")

const myCallBack = () => console.log("Hola mundo, con retraso")
setTimeout(myCallBack);

console.log("sorpresa");