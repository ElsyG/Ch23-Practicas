package com.generation.engc.mains;

import com.generation.engc.clases.AreaPerimetro;
import com.generation.engc.clases.FigurasGeometricas;

public class TestAreaPerimetro {

	public static void main(String[] args) {
		AreaPerimetro ap = new AreaPerimetro();
		FigurasGeometricas fg = new FigurasGeometricas();
		
		fg.setArea(ap.areaCuadrado(5));
		System.out.println("Área cuadrado --> " + fg.getArea());	
	
	fg.setPerimetro(ap.perimetroCuadrado(5));
	System.out.println("Périmetro cuadrado --> " + fg.getPerimetro());
	
	fg.setArea(ap.areaTriangulo(3, 8));
	System.out.println("Área Triángulo --> " + fg.getArea());
	
	fg.setPerimetro(ap.perimetroTriangulo(3, 3, 3));
	System.out.println("Périmetro triángulo --> " + fg.getPerimetro());
	
}
}
