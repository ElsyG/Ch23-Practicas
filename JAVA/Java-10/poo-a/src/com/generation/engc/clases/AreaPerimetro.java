package com.generation.engc.clases;

public class AreaPerimetro {
	
	public double areaCuadrado(double lado) {
		double areaCuadrado = lado * lado;
		return areaCuadrado;
	}
	public double perimetroCuadrado(double lado) {
		double perimetro = lado * 4;
		return perimetro;
	}

	public double areaTriangulo (int base, int altura) {
		int areaTriangulo = base * altura/2;
		return areaTriangulo;
}
	public double perimetroTriangulo (int ladoA, int ladoB, int ladoC) {
		double perimetroTriangulo = ladoA + ladoB + ladoC;
		return perimetroTriangulo;
}
	public double areaCirculo (int base, int altura) {
		int areaCirculo = base * altura/2;
		return areaCirculo;
}
	public double perimetroCirculo(int ladoA, int ladoB, int ladoC) {
		double perimetroCirculo = ladoA + ladoB + ladoC;
		return perimetroCirculo;
	}
}
	

