package pruebaJUnit.engc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import pruebaJUnit.engc.app.Calculadora;

class CalculadoraTest {
	private Calculadora ct;
	private Calculadora ct1=null;
	
	@BeforeEach //ejecutar todo lo que este anotado con test
	public void configurandoBefore() {
		ct = new Calculadora();
		
		System.out.println("Ejecutando Before --> configurandoBefore()");
	}
	
	@AfterEach //indica que se ejecutará dspues de cada teste y que liberará recurso.
	private void configurandoAfter() {
		// TODO Auto-generated method stub
		ct = null;
		System.out.println("Ejecutando AfterEach --> configurandoafter");
		System.out.println("----***********----");
	}
	
	@Test
	public void calculadoraNull() {
		assertNull(ct1, "La clase es una instancia no nula");
		System.out.println("Ejecutando primer test --> Calculadora");
	}
	
	@Test
	public void calcudoraNotNull() {
	// TODO Auto-generated method stub
	assertNotNull(ct);
	System.out.println("Ejecutando segundo test --> Calculadora");
}
/***********Primeras pruebas********/
	@Test
	public void primerosAssert() {
		/*
		 * 1.- Indicar que se va a evaluar
		 * 2.- Indicar lo que se va realizar
		 * 3.- Evaluar con el assert adecuado
		 */
		int resultadoEsperado=10;
		int resultadoActual;
		resultadoActual = ct.sumar(6, 4);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("Ejecutando tercer test --> primerosAssert");
	}
	@Test
	public void sumaTest() {
		Calculadora calculadora = new Calculadora();
		assertEquals(20, calculadora.sumar(10, 10));
	}
	/********Tipos test********/
	@Test
	public void tiposAsserts() {
		assertTrue(1 == 1);
		assertEquals("Generation", "Generation");
		assertNull(ct1);
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = c1;
		
		assertSame(c1, c3);
		assertNotSame(c1,c3);
		assertEquals(1, 1.2, .5);
	}
	
	@Test
	public void validandoSuma() {
		// TODO Auto-generated method stub
		assertEquals(11, ct.sumar(5,  6));
	}
	@Test
	public void validandoResta() {
		// TODO Auto-generated method stub
		assertEquals(50, ct.restar(56, 6));
	}
	@Test
	public void validandoRestaNegativa() {
		// TODO Auto-generated method stub
		assertEquals(-10,ct.restar(1,  20));
	}
	@Test
	public void validandoDivision() {
		// TODO Auto-generated method stub
		assertEquals(2, ct.division(10, 5));
	}
	
	/*@Test
	private void validandoByZer() {
		assertThrows(ArithmeticException.class, ()->ct.divisionByZero(10, 0), "No se puede dividir entre cero");
	}*/
	@Disabled("En espera")
	@Test
	private void validandoByZer() {
		assertThrows(ArithmeticException.class, ()->ct.divisionByZero(10, 0), "No se puede dividir entre cero");
	
}
}
