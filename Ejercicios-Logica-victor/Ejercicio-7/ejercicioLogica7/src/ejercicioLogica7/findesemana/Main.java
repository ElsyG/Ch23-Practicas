package ejercicioLogica7.findesemana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir día de la semana
        String diaSemana = "";
        boolean esDiaValido = false;
        while (!esDiaValido) {
            System.out.println("Introduce un día de la semana (de lunes a viernes):");
            diaSemana = scanner.nextLine().toLowerCase();
            switch (diaSemana) {
                case "lunes":
                case "martes":
                case "miércoles":
                case "jueves":
                case "viernes":
                    esDiaValido = true;
                    break;
                default:
                    System.out.println("Error: día de la semana inválido.");
                    break;
            }
        }
        
        // Pedir hora y minutos
        int horas = -1;
        int minutos = -1;
        boolean sonHorasValidas = false;
        boolean sonMinutosValidos = false;
        while (!sonHorasValidas || !sonMinutosValidos) {
            System.out.println("Introduce una hora (horas y minutos, separados por un espacio):");
            horas = scanner.nextInt();
            minutos = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            if (horas >= 0 && horas <= 23) {
                sonHorasValidas = true;
            } else {
                System.out.println("Error: hora inválida.");
            }
            if (minutos >= 0 && minutos <= 59) {
                sonMinutosValidos = true;
            } else {
                System.out.println("Error: minutos inválidos.");
            }
        }
        
        // Calcular minutos hasta el fin de semana
        int minutosHastaFinDeSemana = 0;
        switch (diaSemana) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
                minutosHastaFinDeSemana += (23 - horas) * 60; // minutos restantes del día
                minutosHastaFinDeSemana += (59 - minutos); // minutos restantes de la hora
                minutosHastaFinDeSemana += 60 * 24 * (5 - (diaSemana.equals("viernes") ? 0 : 1)); // minutos de los días restantes de la semana
                minutosHastaFinDeSemana += 60 * (15 - 1); // minutos hasta las 15:00 del viernes
                break;
            case "viernes":
                if (horas < 15) {
                    minutosHastaFinDeSemana += (14 - horas) * 60; // minutos restantes del día
                    minutosHastaFinDeSemana += (59 - minutos); // minutos restantes de la hora
                    minutosHastaFinDeSemana += 60 * (15 - 1); // minutos hasta las 15:00 del viernes
                }
                break;
        }
        
        // Mostrar resultado
        System.out.println("Faltan " + minutosHastaFinDeSemana + " minutos para el fin de semana.");
    }
}

