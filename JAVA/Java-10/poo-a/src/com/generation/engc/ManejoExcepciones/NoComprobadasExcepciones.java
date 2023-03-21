package com.generation.engc.ManejoExcepciones;

import java.util.Scanner;

public class NoComprobadasExcepciones {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.println("Introduzca un valor ");
		
		int divisor;
		
		
		try {
			divisor = Integer.parseInt(dato.next());
			int division = 10/divisor;
			System.out.println("--> " + division);
		}catch (ArithmeticException e) {
			System.out.println("capturando exception " + e.getMessage());
		}catch(NumberFormatException nfe) {
			System.out.println("el dato es un caracter " + nfe.getMessage());
		}
		System.out.println("continuamos con el flujo de la aplicación");
	}

}
