let numeroSecreto = Math.floor(Math.random() * 100) + 1; // Genera un número aleatorio del 1 al 100
// let numeroSecreto = parseInt(prompt("Ingrese el número secreto")); // Si se desea pedir al usuario que ingrese el número secreto
let numeroIngresado = parseInt(prompt("Ingrese un número"));
let intentos = [numeroIngresado]; // Crea un arreglo de intentos y agrega el primer número ingresado

while (isNaN(numeroIngresado)) {
    alert("El valor ingresado no es un número válido");
    numeroIngresado = parseInt(prompt("Ingrese un número"));
}

while (numeroIngresado !== numeroSecreto) {
    alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
    numeroIngresado = parseInt(prompt("Ingrese un número"));
    intentos.push(numeroIngresado); // Agrega el número ingresado al arreglo de intentos
    while (isNaN(numeroIngresado)) {
        alert("El valor ingresado no es un número válido");
        numeroIngresado = parseInt(prompt("Ingrese un número"));
    }
}

console.log("Felicidades, adivinaste el número secreto!");
console.log("Lista de intentos:", intentos);
