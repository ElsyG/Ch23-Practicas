/*******Exercise 1*******/
var names=["Maria", "Antony", "Joy", "Juan"]

//Part 1
names.push("Elsy"); //para agregar un elemento
console.log(names);

//Part 2
function nombreExiste(names){
    return names;
}
let comprobation= nombreExiste("Joy", names)
console.log(comprobation)

//Part 3
var names2=("Miguel", "Mariana", "Lupe")
console.log(names2)

//Part 4
function longitud(names){
    let longitudes.push()
}
names.push("Juana", "Javier", "Luca")
for (let i=0; i<names.length;i++){
    console.log (names[i].lenghth)
}
console.log(names);


/*******Exercise 2*******/



/*******Exercise 3*******/


/*******Adicional*******/
var a;
var b = null;
var c = undefined;
var d = 4;
var e = 'five';
var f = a || b || c || d || e;

console.log(f);