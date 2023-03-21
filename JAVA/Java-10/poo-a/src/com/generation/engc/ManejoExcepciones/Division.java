package com.generation.engc.ManejoExcepciones;

public class Division {
	private int numerador;
	private int denominador;
	
	public Division(int numerador, int denominador) {
		
		if (denominador == 0) {
			throw new OpException("El denominador cero");			
		}
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
	public void visualizarD() {
		System.out.println("El resultado de la división es " + (this.numerador/this.denominador););
	}
	
	
}
