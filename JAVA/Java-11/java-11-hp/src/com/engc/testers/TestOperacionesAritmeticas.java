package com.engc.testers;

import com.engc.clases.Mensajes;
import com.engc.clases.OperacionesAritmeticas;
import com.engc.clases.Suma;

public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		Suma s = new Suma (5,2);
		OperacionesAritmeticas ss = new Suma(10,3);		
		Mensajes sss = new Suma();		
		
		System.out.println("suma " + s.sumar());
		System.out.println("Operaciones Aritmeticas " + ss.sumar());
		System.out.println("Resta " + s.restar());
		System.out.println("Multiplicación " + s.multiplicar());
		System.out.println("División " + s.dividir());
		
		s.mensaje();
		sss.mensaje();
	}

}
