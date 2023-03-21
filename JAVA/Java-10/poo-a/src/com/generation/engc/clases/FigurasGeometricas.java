package com.generation.engc.clases;

public class FigurasGeometricas {
	private double perimetro;
	private double area;
	
	public FigurasGeometricas() { //constructor vacio
		
	}

	public FigurasGeometricas(double perimetro, double area) {
		
		this.perimetro = perimetro;
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
	
}
