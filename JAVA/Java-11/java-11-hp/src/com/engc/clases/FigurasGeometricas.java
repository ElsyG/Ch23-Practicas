package com.engc.clases;

public abstract class FigurasGeometricas { //con las palaabra abstract creamos una clase abstracta
	/*caracteristicas de la clase abstaracta, el contenido de métodos abstractos, por lo menos 1
	-implementa la abstraccion en la clase
	-metodo abstracto, debe ser declarado no definido ni implementado.*/
	private String nombre;
	
	public FigurasGeometricas(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double areas(); //la clase hija lo va a implementar o definir 
	public abstract void pedirDatos();
	
	@Override
	public String toString() {
		return "FigurasGeometricas [nombre: " + nombre +", areas()=" + areas() + "]";
	}
}

