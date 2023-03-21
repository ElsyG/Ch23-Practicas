package com.engc.clases;

public class Cuadrado extends FigurasGeometricas {
	private double lado;

	@Override
	public double areas() {
		return lado*lado;
	}

	public Cuadrado(double lado) {
		super("Cuadrado");
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}
	
}
