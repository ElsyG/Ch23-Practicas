let texto = "Hola Mundo";//esto es una cadena, variable, objeto
if (texto.includes("o")){ //va a busar en toda la cadena ese caracter
    console.log("true"); //si esta el caracter aparecerá este texto
}else{//si no
    console.log ("Ese caracter no esta en el texto")//si no esta aparecerá éste texto
}


let palabra= texto.split(" "); //split busca espacio en blanco, hace la consideración por palabra.
console.log(palabra[0]+" / " + palabra[1]);//"[]"la utilice como un arreglo // ahora lo toma por palabra no por caracter


let palabra= texto.substring(5,7);//aquí se debe específicar, omite el último
console.log(palabra);


let palabra = texto.substr(5); //(0, 4)me recupera los caracteres hasta donde quiero, (5) a partir de aquí recupera
console.log(palabra)


let mensaje= texto.toUpperCase()
console.log(mensaje);



let mensaje= " ";
for (let index = 0; index < texto.length; index++) { //para recorrer nececito un ciclo "for"
    mensaje += texto[index] + " "; //+ concatenar       
}
mensaje= mensaje.trim()//quita los espacios en blanco al inicio y final de una cadena de caracteres
console.log(mensaje);



let mensaje= "El texto tiene " + texto.length + " caracteres";
console.log(mensaje);