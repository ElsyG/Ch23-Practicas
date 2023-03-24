package ejercicioLogica8.numerosprimos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        // Solicitar números por consola y almacenarlos en el array
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
        }

        // Crear un nuevo array con los números primos al principio
        int[] primosAlPrincipio = new int[10];
        int indicePrimos = 0;
        int indiceNoPrimos = numeros.length - 1;

        // Recorrer el array original de atrás hacia adelante
        for (int i = numeros.length - 1; i >= 0; i--) {
            if (esPrimo(numeros[i])) {
                primosAlPrincipio[indicePrimos] = numeros[i];
                indicePrimos++;
            } else {
                primosAlPrincipio[indiceNoPrimos] = numeros[i];
                indiceNoPrimos--;
            }
        }

        // Mostrar el array original
        System.out.println("Array original:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i + " - " + numeros[i]);
        }

        // Mostrar el array con los números primos al principio
        System.out.println("Array con los números primos al principio:");
        for (int i = 0; i < primosAlPrincipio.length; i++) {
            System.out.println(i + " - " + primosAlPrincipio[i]);
        }
    }

    // Función para determinar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

