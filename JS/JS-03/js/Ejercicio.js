let díaNumero=parseInt(prompt("Escribe un número de la semana del 0 al 6: "));
if(díaNumero ===0){
    document.write("<h2>El día es Domingo</h2>") //document.write--imprimir
} else if(díaNumero ===1){
    document.write("<h2>El día es Lunes</h2>");
}else if(díaNumero ===2){
    document.write("<h2>El día es Martes</h2>");
}else if(díaNumero ===3){
    document.write("<h2>El día es Miércoles</h2>");
}else if(díaNumero ===4){
    document.write("<h2>El día es Jueves</h2>");
}else if(díaNumero ===5){
    document.write("<h2>El día es Viernes</h2>");
}else if(díaNumero ===6){
    document.write("<h2>El día es Sábado</h2>");
}else {
    document.write("<h2>Este no es un número valido</h2>");
}

let q = true;
let p = false;
if (q && p)