package ciclos.forwhiledo;

import java.util.Scanner;

public class UsoWhile {
	Scanner entrada = new Scanner(System.in); //para pedirle al usuario un valor
	public void cicloW() {
		System.out.println("Ciclo While");
		int iterador = 0;
		while (iterador < 10) {
			System.out.println("iterador " + iterador);
			iterador = iterador +1;
		}
	}
	/*While uso centinela*/

	public void centinelaW() {
		System.out.println("centinela");
		final int centinela =  -1; //al asiganrle final a la variable y se convierte una constante, es decir que no cambia
		System.out.print("Introduzca una nota: ");
		int nota = entrada.nextInt();
		
		while (nota != centinela) {
			System.out.println("La nota es: "+ nota);
			System.out.print("Introduzca una nota: ");
			nota = entrada.nextInt();				
		}
		System.out.println("Fin");
	}
	/*
	 * public void banderaW() { //va retornar unvalor double y de a fuerza lleva return. //estatico ya no es creado, reside en la memoria.
	 
		System.out.println("Hola soy el método estatico");//tiene que ser de algun tipo y tiene que llevar return.
		Math.pow(2, 2);
		return 0.0;		 
	}*/

		public void banderaW() {
			System.out.println("bandera");
			boolean valorb = false;
			while (!valorb) { // ! para convertir a true
				System.out.println("Introduzca un valor numérico");
				int valorx = entrada.nextInt();
				if (valorx > 0 && valorx < 5) {
					int potaxio = (int)Math.pow(valorx, 2);
					System.out.println("El resultado --> " + potaxio);
				} else {
					valorb = true;
					System.out.println("adios");
				}
			}
		}
}

