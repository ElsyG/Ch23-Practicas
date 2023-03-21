package com.generation.engc.mains;

import com.generation.engc.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseGenerica <Integer> intObj = new ClaseGenerica<Integer>(55);
		ClaseGenerica <String> caracteresObj = new ClaseGenerica<String>("Prueba");
		intObj.claseTipo();
		caracteresObj.claseTipo();
	}
}
