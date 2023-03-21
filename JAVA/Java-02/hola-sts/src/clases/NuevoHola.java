package clases;
import java.util.Scanner;
public class NuevoHola {	
	private String nombre;
	//para inicializar la variable usamos el método constructor
	//para generar el constructor click derecho en source

	public NuevoHola(String nombre) {
		this.nombre = nombre;
	}
	public void saludo() {
		System.out.println("Hola desde java con sts de nuevo" + this.nombre);
	}
	
	public void saludoConNombre() {
		System.out.print ("Hola tu eres: " + this.nombre);
	}
}
