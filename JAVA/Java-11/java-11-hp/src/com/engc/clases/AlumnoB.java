package com.engc.clases;

public class AlumnoB extends PersonaP{
	private int matriculas;
	private double promedio;
	
	public AlumnoB (int matriculas, double promedio, String nombre, int edad) {
		super (nombre, edad); //aquí estamos accediendo a la clase padre que la definen como persona
	    this.matriculas = matriculas;
	    this.promedio = promedio;  
	}
	
	//set y get
	public int getMatriculas() {
	    return matriculas;
	}
	public void setMatriculas(int matriculas) {
	    this.matriculas = matriculas;
	}
	public double getPromedio() {
	    return promedio;
	}
	public void setPromedio(double promedio) {
	    this.promedio = promedio;
	}
	
	@Override//metodo tostring
	public String toString() {
	    return "AlumnoB [matriculas=" + matriculas + ", promedio=" + promedio + "]";
	}
	
	//si quiero acceder desde alumno
	public void mostrarDatos() {
		System.out.println(this.getNombre() +  " " + this.getEdad()+ " "+ this.matriculas + " " + this.promedio);

	}
	
	public void mostrarDatos(String apellido) { //polimorfismo en tiempo de compilacion, aqui estamos sobrecargando con el mismo metodo
		System.out.println(this.getNombre() +  " " + apellido + " "+ this.getEdad()+ " "+ this.matriculas + " " + this.promedio);

	}
}
