package Funciones;

public class FuncionTrigonometrica {

		
		public static void main(String[] args) {			
			double anguloElevacion = 30; // en grados
			double adyacenteDistancia = 100;
			double opuestoAltura = Math.tan(Math.toRadians(anguloElevacion))* adyacenteDistancia;
			
			
		System.out.println("La base es: " + adyacenteDistancia + " metros");
		System.out.println("La altura es: " + opuestoAltura + " metros");

	}

}
