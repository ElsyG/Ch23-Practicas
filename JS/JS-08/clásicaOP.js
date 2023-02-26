//POO: Forma clásica pegada a los principios:

//La abstracción la puedo clasificar, ese algo que pienso es el objeto (cuando ya le pongo atributos, ya es el objeto).

class OperacionesAritmeticas { //"class" para hacer representaciones de abstracciones / Nomenclatura camel= cuando inicia con letra mayuscula es un "class".

//constructor, es el alma de la clase, pide reserve la memoria para poder crear
    numero0 = 5;
    numero1 = 0;

    constructor (valor0, valor1){
        this.numero0=valor0;
        this.numero1=valor1;
    }



    sumar(){ //poner los parametros (a,b)
        return this.numero0 + this.numero1;
    }
}


let obj4 = new OperacionesAritmeticas(8,6);
console.log("--> " + obj4.sumar());


let obj3 = new OperacionesAritmeticas();
obj3.numero0 = 8 //reasignamos valores a los atributos
obj3.numero1 =5;
console.log(obj3.sumar(obj3.numero0, obj3.numero1))


let obj1; //declaracion de objeto
obj1 = new OperacionesAritmeticas(); // asignarción o creación de un objeto //se pone parentisis para llamar a un componente o artefacto que no esta declarada.
console.log(obj1.numero0); //llamada de los atributos de ese objeto.
//a la declaracion, la creacion y llamada se le llama "instancia"
