let lista = [12,5,80,34,7];
lista.sort(//el sort esta aceptando la función como parametro
    function(valor1,valor2){
        return valor1 > valor2; //guarda la función para poder utilizarlo
    }
);
console.log(lista);


lista.sort()//lo ordena en orden alfabetico
console.log(lista);


lista.reverse(); //lo ordena en sentido contrario
console.log(lista);


let remover =lista.splice(1,2)//para eliminar un elemento específico de la lista
console.log(remover); //para imprimir los objetos removidos
console.log(lista); //para ver los objetos no removidos
lista.splice(2,0,100,200,300);
console.log(lista);

lista.shift;//eliminar un elemento al inicio de la lista
console.log(lista)


lista.pop();//elimina un valor al final de la lista
console.log(lista);


let masE=lista.concat(100,200,300); //para agregar más de un elemento
console.log(masE)


lista.push(100); //para agregar un elemento
console.log(lista);



let msj=lista.join("-");//para agregar un caracter
console.log(msj);



let listaNueva= lista.slice(1,4) //antes de que llegue al indice 4
console.log(listaNueva)

//console.log (lista.lenght);

for (let i=0; i<lista.length; i++){
    console.log ("-->" +lista[i])
}
console.log(lista);