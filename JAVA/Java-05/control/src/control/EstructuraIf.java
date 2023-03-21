package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
	public void controlIf() {
		// TODO Auto-generated method stub
		/*
		if (condition){ // si se cumple la prueba lógica va a ejecutar las sentencia de abajo.			
		}*/		
		long nota = 4;
		if (nota > 5) {
			System.out.println("Nota aprobada " + nota);
		}
		System.out.println("continua con el control de flujo");
		
		/*
		if (condition) {
			
		} else { //si la condicion anterior no se cumplió va  cumplir lo de abajo

		}*/
		
if ((nota > 5)) {
	System.out.println("Nota aprobada " + nota);
		} else {
			System.out.println("Nota no aprobada " + nota);
		}
	}
	
	public void divisible() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un valor: ");
		int dato1 = entrada.nextInt();
		System.out.println("Introduzca un segundo valor: ");
		int dato2 = entrada.nextInt();
		
		if (dato1 % dato2 == 0) {
			System.out.println(dato1 +" es divisible entre " + dato2);
		}else {
			System.out.println(dato1 +" no es divisible entre " + dato2);
		}
	}
	
	public void compara() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca el primer numero: ");
		int valor1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		int valor2 = entrada.nextInt();
		
		if (valor1 > valor2) {
			System.out.println(valor1 + " es mayor que " + valor2);
		}else {
			System.out.println(valor1 + " es menor que " + valor2);
		}
	}
	
	public void anidado() {
		// TODO Auto-generated method stub
		
		/*
		if (condition) {  //si la primera condicion es verdadera se ejecuta la sentencia de abajo.
			
		} else if (condition) { //si la primera condicion no es verdadera se ejecuta la sentencia de abajo.

		}else { //para determinar la última condicionante.
					
		}*/
		
		System.out.println("Introduzca el primer numero: ");
		int valor = entrada.nextInt();
				
		if (valor > 0) {
			System.out.println(valor + " es número positivo");
		} else if (valor < 0) {
			System.out.println(valor + " es un número negativo");
		} else{
			System.out.println(valor + " es un número neutro");
		}

		
	}
}

