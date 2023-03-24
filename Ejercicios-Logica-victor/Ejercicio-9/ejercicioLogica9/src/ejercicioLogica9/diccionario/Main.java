package ejercicioLogica9.diccionario;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Creamos un objeto HashMap para almacenar las palabras
        HashMap<String, String> diccionario = new HashMap<String, String>();

        // Agregamos palabras al diccionario
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("coche", "car");
        diccionario.put("mesa", "table");
        diccionario.put("libro", "book");
        diccionario.put("hombre", "man");
        diccionario.put("mujer", "woman");
        diccionario.put("niño", "child");
        diccionario.put("niña", "girl");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("amarillo", "yellow");
        diccionario.put("blanco", "white");
        diccionario.put("negro", "black");
        diccionario.put("alto", "tall");
        diccionario.put("bajo", "short");
        diccionario.put("grande", "big");
        diccionario.put("pequeño", "small");

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca una palabra en español
        System.out.print("Introduce una palabra en español: ");
        String palabra = scanner.nextLine();

        // Buscamos la traducción de la palabra en el diccionario
        String traduccion = diccionario.get(palabra);

        // Si la traducción es null, significa que la palabra no está en el diccionario
        if (traduccion == null) {
            System.out.println("La palabra no se encuentra en el diccionario.");
        } else {
            // Mostramos la traducción por consola
            System.out.println("La traducción de \"" + palabra + "\" es \"" + traduccion + "\".");
        }
    }
}

