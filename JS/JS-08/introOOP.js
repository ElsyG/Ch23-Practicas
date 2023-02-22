//OOP: Forma por prototipos
//Object.prototype object es la clase mayor y es un prototipo
let persona = { //"let, palabra reservada"
    nombre : 'Juan',
    apellido: 'Perez',
    nombreCompleto: function(){
        return 'El nombre es ' + this.nombre + ' ' + this.apellido; //"this" hace referencia a las propiedades del objeto declaradas.
    }    
}
console.log(persona);
console.log(persona.nombre)
console.log(persona.nombreCompleto());