let num;
do {
  num = prompt("Introduce un número entero positivo");
} while (isNaN(num) || num <= 0); // Verifica que el dato de entrada sea un número entero positivo

let factorial = 1;
for (let i = 1; i <= num; i++) {
  factorial *= i;
}

console.log(`El factorial de ${num} es: ${factorial}`);
