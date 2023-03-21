package com.engc.clases;

public class Suma implements OperacionesAritmeticas, Mensajes {
private double a;
private double b;


	public Suma (double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	
	public Suma() {
		
	}


	@Override
	public double sumar() {
		return this.a + this.b;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return this.a - this.b;
	}


	@Override
	public double multiplicar() {
		// TODO Auto-generated method stub
		return this.a * this.b;
	}

	@Override
	public double dividir() {
		// TODO Auto-generated method stub
		return this.a / this.b;
	}
	
	@Override
	public void mensaje() {
		System.out.println("Hola, soy una suma");
		
	}

}
