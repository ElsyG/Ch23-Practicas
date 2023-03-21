package com.engc.testers;

import com.engc.clases.*;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		FigurasGeometricas rectangulo = new Rectangulo(10,2); //estamos haciendo un enlace por referencia y las clases que implementan
		FigurasGeometricas circulo = new Circulo(2);
		FigurasGeometricas triangulo = new Triangulo(6,9);
		Cuadrado cuadrado = new Cuadrado(4);//podemos hacer instancia desde la clase hija
		System.out.println(rectangulo.areas());
		System.out.println(circulo.areas());
		System.out.println(triangulo.areas());
		System.out.println(cuadrado.areas());System.out.println(triangulo.areas());
	
		rectangulo.pedirDatos();
		System.out.println(rectangulo.toString());
		rectangulo.toString(rectangulo.areas());
	}

}
