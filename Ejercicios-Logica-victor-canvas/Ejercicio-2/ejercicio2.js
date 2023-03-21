 // Función para solicitar la temperatura al usuario y realizar las conversiones
 function convertirTemperatura() {
  let celsius = prompt("Ingrese la temperatura en grados Celsius:");

  // Verificar que la entrada sea un número válido
  while (isNaN(celsius)) {
    alert("El valor ingresado no es un número. Intente de nuevo.");
    celsius = prompt("Ingrese la temperatura en grados Celsius:");
  }

// Función para convertir Celsius a Fahrenheit
function celsiusToFahrenheit(celsius) {
    return celsius * 9/5 + 32;
  }
  
  // Función para convertir Celsius a Kelvin
  function celsiusToKelvin(celsius) {
    return celsius + 273.15;
  }
 
  
    var fahrenheit = celsiusToFahrenheit(parseFloat(celsius));
    var kelvin = celsiusToKelvin(parseFloat(celsius));
  
    console.log("Grados Fahrenheit: " + fahrenheit);
    console.log("Grados Kelvin: " + kelvin);
  
    // Imprimir en el DOM
    var kelvin = document.getElementById("Grados Kelvin: " + kelvin);
    //document.getElementById('kelvin').innerHTML = "Grados Kelvin: " + kelvin;
    //document.getElementById('fahrenheit').innerHTML = "Grados Fahrenheit: " + fahrenheit;
  }
  
  // Llamar a la función al cargar la página
  window.onload = function() {
    convertirTemperatura();
  }
  