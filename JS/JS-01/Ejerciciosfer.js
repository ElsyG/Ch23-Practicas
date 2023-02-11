//Ejercicio 1
let diasTrabajados=prompt("¿Cuántos días trabajó el empleado? ")
let salarioDiario=prompt("¿Cuánto es tu salario diario? ")
let salario=diasTrabajados*salarioDiario
alert("Tu salario es: " + salario)


//Ejercicio 2
let n1=3+2
let n2=2*5
let n3= n1/n2
alert("El resultado de (3+2)/2*5 es: "+ n3)


//Ejercicio 3
let pesoLibras=parseFloat(prompt("Dime tu peso en libras"))
let estCm=parseInt(prompt("Dime tu estatura en centímetros"))
let pesoKg=pesoLibras*0.453592
let estM=estCm/100
let imc=pesoKg/estM**2

alert("Tu IMC es "+imc)

clasificar(imc);
function clasificar(imc){
    if (imc < 16) {
        alert("Criterio de ingreso")  
    }
    else if(imc >=16 && imc <= 16.9) {
        alert("Infrapeso")
    }
    else if (imc >16.9 && imc <= 18.4) {
        alert ("Bajo peso")
    }
    else if (imc >18.4 && imc <= 24.9) {
        alert ("Peso Normal")
    }
    else if (imc >24.9 && imc <= 29.9) {
        alert ("Sobrepeso")
    }
    else if (imc >29.9 && imc <= 34.9) {
        alert ("Obesidad Premorbida")
    }
    else if (imc >34.9 && imc <= 45) {
        alert ("Obesidad Morbida")
    }
    else if (imc>45){
        alert("Obesidad Hipermorbida!")
    }
}..