/*
¿Qué encontamos en el árbol del DOM?

    - Node: es la unidad más básica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiqueta o un comentario, etc.
    <title> NODO
    MANIPULACIÓN DOM// Es un nodo pero es el hijo del title.

    - Document: Tambien es un nodo, del tipo documento, es el nodo raíz a partir del cual se desarrollan o generan todos los demás nodos.

    - Element: son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

    - Attributes: Nodos que dan información asociada al tipo de elemento. ej. src.

    - Comentario: comenttarios y otros elementos 

    */

    /* Cómo leer nodos de mi DOM

    - Métodos tradicionales (que se usan en versiones antiguas de JS)

    -document.getElementById (botonSuma)
    -document.getElementByTagName (<button>)
    -document.getElementClassName (botones)
    */


    var elementoID = document.getElementById ("botonSuma");
    console.log(elementoID);

    var elementoEtiqueta=document.getElementsByTagName("button");
    console.log(elementoEtiqueta);
    console.log("Este es el primer elemento de mi colección de botones", elementoEtiqueta[0]);

    var elementoClassName =  document.getElementsByClassName("botones");
    console.log(elementoClassName);

    /*
    Métodos actuales
    - document.querySelector (#botones)
    - document.querySelectorAll (.botones)
    */

   // var unElemento=document.querySelector ("#input1");
   // console.log(unElemento);

   // var variosElementos=document.querySelectorAll (".botones")
   // console.log(variosElementos);


/*Creación de nodos
 
-document.createElement(tipoNodo)

*/

//Creación de unja etiqueta del tipo imagen
var imagenPerrito = document.createElement("img")

//creación de atributos a la etiqueta
imagenPerrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
imagenPerrito.alt = "Foto de perrito tierno";
imagenPerrito.style.width= "150px";
imagenPerrito.style.borderRadius="100px"

//Poner elementos o nodos en el html
document.body.append(imagenPerrito);


//Actualizar nodos
    //1er paso: Identificar el nodo que quiero cambiar (outer)
    //2do paso: Modificar el nodo (inner)
    //Identidicar el nodo con un metodo para tomarlo (getElemento o QuerySelector y modificarlo con inner.HTML)


var resultadoQueCambia = document.getElementById("resultado");


resultadoQueCambia.innerHTML = "Saludos, cambie el texto juas juas";





   //Construir nuestra calculadora
   var input1 = document.getElementById("input1")
   var input2 = document.getElementById("input2")

   var botonSuma = document.getElementById("botonSuma")
   var botonResta = document.getElementById("botonResta")
   var botonMultiplicacion = document.getElementById("botonMultiplicacion")
   var botonDivision = document.getElementById("botonDivision")

   var resultado = document.getElementById("resultado");

   //Construimos las funciones de nuestra calculadora

   function suma(){
    let valor1 = parseInt(input1.value); //number 1
    let valor2 = parseInt(input2.value); //number 2
    let suma = valor1 + valor2; // calculo suma
    resultado.innerHTML = suma; // incrusto el resultado en su lugar
   }


   function resta(){
    let valor1 = parseInt(input1.value); //number 1
    let valor2 = parseInt(input2.value); //number 2
    let resta = valor1 - valor2; // calculo resta
    resultado.innerHTML = resta; // incrusto el resultado en su lugar
   }

   function multiplicacion(){
    let valor1 = parseInt(input1.value); //number 1
    let valor2 = parseInt(input2.value); //number 2
    let multiplicacion = valor1 * valor2; // calculo multi
    resultado.innerHTML = multiplicacion; // incrusto el resultado en su lugar
   }

   function division(){
    let valor1 = parseInt(input1.value); //number 1
    let valor2 = parseInt(input2.value); //number 2
    let division = valor1 / valor2; // calculo divi
    resultado.innerHTML = division; // incrusto el resultado en su lugar
   }


   /* ¿Cómo se crea un evento?
        -node.addEventLitener ("evento a escuchar", lo que quiero que haga cuando se escuche)
            -node (nodo donde aterrizo el evento)
            -addEventLitener (palabra revervada para usar el evento)
            - evento a escuchar

   */

botonSuma.addEventListener("click",suma);
botonResta.addEventListener("click",resta);
botonMultiplicacion.addEventListener("click",multiplicacion);
botonDivision.addEventListener("click",division);

/*
Manipulación del DOM

° metodos para acceder a los elementos:
    -document.getElementById
    -document.getElementByTagName
    - className

° Métodos para crear elementos
    - document.createElement (eiqueta)
    - document.createTextNode (texto) - INVESTIGAR

°Métodos para insertar elementos
    - parentElement.append
    - parentElement.insertBefore
    - parentElement.insertAdjacentElement

° Métodos para modificar elementos
    - node.outerHTML (leer o referencias el elemento)
    - node.innerHTML (modificar el elemento)
    -
*/

//Primer paso: Definir con que voy a interectuar (almacena en una variable)
const textoAModificar = document.querySelector("#h1")

//Creo una funcion que cambia de color, segun el color que le paso como parametro
function cambiarColor(color){
    textoAModificar.style.color = color;
}

