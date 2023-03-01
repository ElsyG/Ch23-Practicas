package control;

import java.util.Scanner;

public class EstructuraMultiple {
	Scanner dato = new Scanner(System.in);
	
public void vocal() {
	// TODO Auto-generated method stub
	System.out.println("Introduzca una letra: ");
	char letra = dato.next().charAt(0);
	switch (letra) {
	case 'a': case 'A':
	case 'e': case 'E':
	case 'i': case 'I':
	case 'o': case 'O':
	case 'u': case 'U':
		System.out.println(letra + " es una vocal");
		break;

	default:  //caso no contemplado
		System.out.println(letra + ", el caracter no es vocal");
		break;
	}
}

	public void calificaciones() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca su califación: ");
		int nota = dato.nextInt();
		switch (nota) {
		case 10:System.out.println("Excelente");break; 
		case 9:System.out.println("Muy bien");break;
		case 8:System.out.println("Bueno");break;
		case 7:System.out.println("Regular");break;
		case 6:System.out.println("Deficiente");break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:System.out.println("Reprobado");	
			break;

		default:
			System.out.println("Fuera del rango");
			break;
		}

	}
	
	/*Operador Elvis
	 * variable =(PL)? Entrada verdad : Entrada Falso
	 */
	
	public void ternario() {
		// TODO Auto-generated method stub
		System.out.print("Introduzca el primer valor numérico");
		int entradaV = dato.nextInt();
		System.out.println("Introduzca el segundo valor numérico");
		int entradaF = dato.nextInt();
		int menor = (entradaV <= entradaF)? entradaV : entradaF;
		System.out.println("--->" + menor);
	}
	 
}
