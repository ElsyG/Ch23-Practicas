let miVariable = 5;
//let miArray = [2, 3, 4, 5, 6, 7];
//let miArray = new Array();

console.log("miArray+miArra[0]")
console.log("miArray+miArra[1]")


console.log("miArray1 "+miArray[0][1]);
console.log("miArray1 "+miArray[0][2]);
console.log("miArray1 "+miArray[2][1]);
console.log("miArray1 "+miArray[1][2]);
console.log("miArray1 "+miArray[1][0]);

console.log("todo el indice " + miArray1[0]);
console.log("todo el indice " + miArray1[1]);
console.log("todo el indice " + miArray1[2]);

/**************** Ciclo for */
let miArray={2,3,4,5,6,7}
for(let i=0; i <= 5; i++){
    console.log("Imprimiendo mi array"+miArray);
}
let miArray1 = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
];

let matrizR=[
    [], [],[]
]
for(let i= 0; i<3; i++){
    for(let j=0; j<3; j++){
    matrizR[i][j]=miArray1[i][j] * miArray1[i][j];
    }
    console.log("***************")
}

for(let i= 0; i<3; i++){
    for(let j=0; j<3; j++){
        console.log("imprimiendo la matriz1 -> "+ miArray1[i][j])
    }
}

/**********While******** */
/*
let variable inicio
while(condición){
   sentencias que necesite o desee ejecutar
}
*/

let contador=0;
while(contador < 10){
    console.log(contador);
    contador++;
}