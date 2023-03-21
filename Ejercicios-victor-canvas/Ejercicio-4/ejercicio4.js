let numero = parseInt(prompt("Ingrese un número"));
while (isNaN(numero)) {
    alert("El valor ingresado no es un número válido");
    numero = parseInt(prompt("Ingrese un número"));
}

function fibonacci(n) {
    let serie = [0, 1];
    for (let i = 2; i < n; i++) {
        serie[i] = serie[i - 1] + serie[i - 2];
    }
    console.log(serie);
}

fibonacci(numero);
