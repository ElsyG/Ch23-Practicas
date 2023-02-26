

class Persona {
    constructor (nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    set nombre (nombre){
        this._nombre = nombre;
    }
    get nombre(){
        return this._nombre;
    }
    set apellido (apellido){
        this._apellido = apellido;
    }
    get apellido(){
        return this._apellido;
}
nombreCompleto(){
    return this._nombre + ' ' + this._apellido;
}
//sobreescribir el método de la clase Padre Object
toString(){
    return this.nombreCompleto();
}
}

class Empleado extends Persona{ //con la palabra reservada extends ya hice herencia
    constructor(nombre, apellido, departamento){//en el constructor debemos ingresar los parametros.
        super (nombre, apellido); //con super accedemos a esos datos
        this._departamento=departamento;
    }
    set departamento (departamento){
        this._departamento=departamento;
    }
    get departamento (){
        return this._departamento;
    }
    //SOBREESCRITURA
    nombreCompleto(){ //la clase padre ya esta definido pero lo sobrescribimos -- redifiniimos el método
        return super.nombreCompleto()+','+this._departamento;
    }
}

let persona1 = new Persona ('Arturo', 'Chavez');
console.log(persona1.toString());

console.log(persona1.nombreCompleto());

let empleado1 = new Empleado('Maria', 'Chavez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());
console.log(empleado1.toString());







let persona3 = new Persona('Jhonny', 'Deep');

persona3.nombre ='Juan';
console.log(persona3.nombre)

persona3.apellido ='Jimenez';
console.log(persona3.apellido)


let persona1 = new Persona ('Juan', 'Perez');
console.log(persona1.nombre)
console.log(persona1.apellido)
let persona2 = new Persona ('Juan', 'Perez');
console.log(persona2)