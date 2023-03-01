package control;

import java.util.Scanner;

public class OrdenTres {
	Scanner num = new Scanner(System.in);

		public void ordena() {
			// TODO Auto-generated method stub
			System.out.println("Introduzca el primer número: ");
			int num1 = num.nextInt();
			System.out.println("Introduzca el segundo número: ");
			int num2 = num.nextInt();
			System.out.println("Introduzca el tercer número: ");
			int num3 = num.nextInt();
			
			int mayor, medio, menor;

	        if (num1 >= num2 && num1 >= num3) {
	            mayor = num1;
	            if (num2 >= num3) {
	                medio = num2;
	                menor = num3;
	            } else {
	                medio = num3;
	                menor = num2;
	            }
	        } else if (num2 >= num1 && num2 >= num3) {
	            mayor = num2;
	            if (num1 >= num3) {
	                medio = num1;
	                menor = num3;
	            } else {
	                medio = num3;
	                menor = num1;
	            }
	        } else {
	            mayor = num3;
	            if (num1 >= num2) {
	                medio = num1;
	                menor = num2;
	            } else {
	                medio = num2;
	                menor = num1;
	            }
	        }

	        System.out.println("Los números ordenados de menor a mayor son: " + menor + ", " + medio + ", " + mayor + ".");
	    }
	}
