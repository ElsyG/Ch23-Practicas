package com.engc.clases;

public class Triangulo extends FigurasGeometricas {
	private double base;
	private double altura;

	@Override
	public double areas() {
		return base * altura/2;
	}
	

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	

}
