division(14, 5);

//Función directa
function agregarCarritoCompra(){
    //Lo que hace mi función
}
//Invocar función
agregarCarritoCompra();



//Para pensar a futuro
//agregarCarritoCompra();
//borraCarrito();
//agregarProducto();
//Pagar()



//Funciónes
function suma(a, b) {
    let sum1 = a + b;
    console.log(sum1);
}



//Funciom anonima
let funcionAnonima = function(){
    let valor1=5;
    let valor2= 7;
    let suma = valor1+valor2;
    console.log("Esta función anonima: ", suma);
}
//Llamamos a la funcionAnonima
funcionAnonima();





/*Por que son importantes las funciones?
    - Nos permite reutilizar codigo en lugar de escribirlo varias veces. Podemos llamar nuestra funcion en distintos lugares de nuestro programa, y así lo usamos cuando lo necesitamos sin necesidad de escribirlo de nuevo.
    - Nos permite modularizar nuestro codigo, esto es, dividir nuestra aplicacion en partes mas pequeñas e independientes. Así mejoramos el entendimiento y comprensión del código.
    - Mantienen su propio espacio, y las variable que se encuentran dentro de una funcion no se pueden acceder fuera de ella (scope).
    - Por que podemos probar pequeñas partes de nuestro programa de forma aislada. (Debugging)
*/


//funcion
function division(parametro1, parametro 2)

division(88, 10)

/*Tipos de funciones:
    -Funciones directas - nombre (comunes)
    -Funciones anonimas - viven pegadas a una variable o constante
    -Funciones como metodos (para especificar que hace mi objeto)
    -Funciones como constructores (para construir o crear un objeto)
*/

//Funcion directa o normal
function areaCuadrado(){
    let lado=5;
    let area= lado*lado;
    console.log("El área de mi cuadrado es: ");
    return area;
    
}