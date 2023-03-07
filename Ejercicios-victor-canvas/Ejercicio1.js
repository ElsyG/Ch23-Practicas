var num1=parseInt(prompt("Dame un primer número: "));
var num2=parseInt(prompt("Dame un segundo número: "));
var num3=parseInt(prompt("Dame un tercer número: "));

let = mayor;
let = centro;
let = menor;

if (num1 >= num2 && num1 >= num3) {
    mayor = num1;

    if (num2 >= num3) {
        centro = num2;
        menor = num3;
} else {
    centro = num3;
    menor = num2;
}

}else if (num2 >= num1 && num2 >= num3) {
    mayor = num2;

    if (num2 >= num3) {
        centro = num2;
        menor = num3;
} else {
    centro = num3;
    menor = num2;
}
}else if (num3 >= num1 && num2 >= num2) {
    mayor = num3;

    if (num2 >= num1) {
        centro = num2;
        menor = num1;
} else {
    centro = num1;
    menor = num2;
}
}

var lista=[num1,num2,num3];
console.log(lista);

// Imprimimos los números ordenados de mayor a menor y de menor a mayor
console.log("Ordenados de mayor a menor: " + mayor + " " + centro + " " + menor);
console.log("Ordenados de mayor a menor: " + menor + " " + centro + " " + mayor);

// Verificamos si los números son iguales
if (num1 == num2 ) {
    console.log (num1 + "y" + num2 + " son iguales");

    if (num1 == num3) {
        console.log (num1 + "y" + num3 + " son iguales");
} else if (num2 == num3){
    console.log (num2 + "y" + num3 + " son iguales");
}else{
    console.log (num1 + ", " + num2 + " y" + num3 + " son iguales");
}
}