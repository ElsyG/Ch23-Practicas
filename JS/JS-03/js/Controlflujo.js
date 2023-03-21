// if (condition){
//     Bloque código
// } else

let edad=parseInt(prompt("Escribe tu edad "));
if(edad <=17){
    document.write("Tas chiquitin") //document.write--imprimir
} else if(edad ===18){
    document.write("<h2>Eres mayor de edad</h2>");
}else if(edad >18){
    document.write("<h2>Tas ruco</h2>");
}else {
    document.write("<h2>Este no es un número valido</h2>");
}


//(5="5") no esta comparando, esta asignando

//(5=="5") true
//solo compara caracter

//(5==="5") false
//5 de tipo caracter el otro de tipo string--estricto