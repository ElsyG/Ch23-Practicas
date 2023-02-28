package TiposdeDatos;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad = 18;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) {
		    System.out.println("Puede conducir un coche");
		} else {
		    System.out.println("No puede conducir un coche");
		}
		
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) { //con una que se cumpla es Juan Perez
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		boolean esVerdadero = true;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}
		
		// 1. Verificar si un número es par y positivo:
			int num = 6;
			if (num > 0 && num % 2 == 0) {
				System.out.println("El número es par y positivo");
			}else {
				System.out.println("El número es impar o negativo");
			}
			
			
		// 2. Verificar si un número está dentro de un rango específico
			int num2 = 10;
			if (num2 >= 0 && num2 <= 10) {
				System.out.println("El número esta un rango de 0 a 10");
				
			}else if (num2 >10 && num2<=20);
			{
				System.out.println("El numero esta arriba de 20");
			}

		// 3. Verificar si una cadena es igual a otra o no
			String cadena1 = "Hola";
			String cadena2 = "hola";
			
			if(cadena1.equals(cadena2)) { // equal es para comparar devuelve un true  cuando ambos son iguales.
				System.out.println("Las cadenas son iguales");
			}
			else {
				System.out.println("Las cadenas no son iguales");
			}

	}

}
